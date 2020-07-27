package br.edu.fiap.fiapsacbot.servico;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import br.edu.fiap.fiapsacbot.aluno.Aluno;
import br.edu.fiap.fiapsacbot.configuracao.MensagemEnum;
import br.edu.fiap.fiapsacbot.configuracao.TelegramEnum;

public class FiapSacBot extends TelegramLongPollingBot {

    private MensagemValidacao mensagemValidacao = new MensagemValidacao();
    private FluxoMensagem fluxoMensagem = new FluxoMensagem();
    private List<Aluno> alunos = new ArrayList<Aluno>();
    private String mensagemInsucesso;
    private Long numeroTentativasMax = 2L;
    private Aluno alunoRemovido = new Aluno();

    public void onUpdateReceived(Update update) {

        if (mensagemValidacao.temNovaMensagem(update)) {
            SendMessage envioMensagemTelegram = new SendMessage();

            if(!this.controleAcesso(update)) {
            	envioMensagemTelegram.setChatId(update.getMessage().getChatId())
				.setText(mensagemInsucesso);
            }else {
            	Aluno aluno = recuperaAluno(update.getMessage().getChat().getId());
            	
				envioMensagemTelegram.setChatId(update.getMessage().getChatId())
						.setText(fluxoMensagem.respostaFiap(update,aluno));
            }

            this.limparFilaAluno();
            try {
                execute(envioMensagemTelegram);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }

    }

    public String getBotUsername() {
        return TelegramEnum.USUARIO.getDescricao();
    }

    public String getBotToken() {
        return TelegramEnum.TOKEN.getDescricao();
    }
    
	private Boolean controleAcesso(Update update) {
		Long clienteChatId = update.getMessage().getChat().getId();
		String nomeCliente = update.getMessage().getFrom().getFirstName();

		if (alunos.size() < 1) {
			Aluno alunoNovo = new Aluno(clienteChatId, nomeCliente, 0, "");
			alunos.add(alunoNovo);
		} else {
			for (Aluno aluno : alunos) {
				if (!aluno.getUserIdChat().equals(clienteChatId)) {
					Aluno alunoNovo = new Aluno(clienteChatId, nomeCliente, 0, "");
					alunos.add(alunoNovo);
				}
				
				if (aluno.getNumeroInteracoesInsucesso().longValue() == numeroTentativasMax) {
					this.mensagemInsucesso = MensagemEnum.TRANSFERENCIA_CHAT_HUMANO.getDescricao();
					alunoRemovido = aluno;
					return false;
				}
			}
		}

		return true;
	}
	
	private Aluno recuperaAluno(Long clienteChatId) {
		for(Aluno aluno:alunos) {
			if (aluno.getUserIdChat().equals(clienteChatId)) {
				return aluno;
			}
		}
		return new Aluno();
	}

	private void limparFilaAluno() {
		if(!Objects.isNull(alunoRemovido)) {
			alunos.remove(alunoRemovido);
		}
	}
}
