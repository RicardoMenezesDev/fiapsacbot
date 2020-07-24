package br.edu.fiap.fiapsacbot.servico;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import br.edu.fiap.fiapsacbot.configuracao.TelegramEnum;

public class FiapSacBot extends TelegramLongPollingBot {

    private MensagemValidacao mensagemValidacao = new MensagemValidacao();
    private FluxoMensagem fluxoMensagem = new FluxoMensagem();

    public void onUpdateReceived(Update update) {

        if (mensagemValidacao.temNovaMensagem(update)) {
            SendMessage envioMensagemTelegram = new SendMessage();

            String mensagemResposta = fluxoMensagem.respostaFiap(update);

            envioMensagemTelegram.setChatId(update.getMessage().getChatId()).setText(mensagemResposta);

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

}
