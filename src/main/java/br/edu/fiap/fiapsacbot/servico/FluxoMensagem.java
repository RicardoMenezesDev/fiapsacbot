package br.edu.fiap.fiapsacbot.servico;

import java.util.Calendar;

import br.edu.fiap.fiapsacbot.boleto.BoletoServico;
import br.edu.fiap.fiapsacbot.disciplina.DisciplinaServico;
import br.edu.fiap.fiapsacbot.trabalho.TrabalhoServico;
import org.telegram.telegrambots.meta.api.objects.Update;

import br.edu.fiap.fiapsacbot.aula.AulaServico;
import br.edu.fiap.fiapsacbot.apostila.ApostilaServico;
import br.edu.fiap.fiapsacbot.configuracao.MensagemEnum;

public class FluxoMensagem {

    public String respostaFiap(Update update) {
        DicionarioSinonimos dicionarioSinonimos = new DicionarioSinonimos();
        String nomeCliente = update.getMessage().getFrom().getFirstName();
        String palavraOrigem = update.getMessage().getText();
        String topico = dicionarioSinonimos.sinonimoPalavra(palavraOrigem.toLowerCase());

        AulaServico aulaServico = new AulaServico();
        ApostilaServico apostilaServico = new ApostilaServico();
        BoletoServico boletoServico = new BoletoServico();
        DisciplinaServico disciplinaServico = new DisciplinaServico();
        TrabalhoServico trabalhoServico = new TrabalhoServico();

        if (topico.contains("/start")) {
            return mensagemInicial(nomeCliente);
        }

        if (topico.contains("aula")) {
            return aulaServico.respostaAulasFiap(topico);
        }

        if (topico.contains("apostila")) {
            return apostilaServico.respostaApostilaFiap(topico);
        }

        if (topico.contains("boleto")) {
            return boletoServico.respostaAulasFiap(topico);
        }

        if (topico.contains("trabalho")) {
            return trabalhoServico.respostaAulasFiap(topico);
        }

        if (topico.contains("disciplina")) {
            return disciplinaServico.respostaAulasFiap(topico);
        }

        return mensagemInsucesso(nomeCliente);
    }

    private String mensagemInicial(String nomeCliente) {
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        String periodo = "";

        if (timeOfDay >= 0 && timeOfDay < 12) {
            periodo = "Bom dia";
        } else if (timeOfDay >= 12 && timeOfDay < 16) {
            periodo = "Boa tarde";
        } else if (timeOfDay >= 18 && timeOfDay < 24) {
            periodo = "Boa noite";
        }

        return String.format("%s, %s!\n%s\n%s", periodo, nomeCliente, MensagemEnum.BEM_VINDO_AJUDA.getDescricao(), MensagemEnum.OPCOES.getDescricao());
    }

    private String mensagemInsucesso(String nomeCliente) {
        return nomeCliente + MensagemEnum.NAO_ENTENDI.getDescricao();
    }
}
