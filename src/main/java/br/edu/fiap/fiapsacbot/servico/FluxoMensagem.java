package br.edu.fiap.fiapsacbot.servico;

import java.util.Calendar;

import org.telegram.telegrambots.meta.api.objects.Update;

import br.edu.fiap.fiapsacbot.configuracao.MensagemEnum;

public class FluxoMensagem {

    public String respostaFiap(Update update) {
        DicionarioSinonimos dicionarioSinonimos = new DicionarioSinonimos();
        String nomeCliente = update.getMessage().getFrom().getFirstName();
        String palavraOrigem = update.getMessage().getText();
        String topico = dicionarioSinonimos.sinonimoPalavra(palavraOrigem.toLowerCase());

        switch (topico) {
            case "/start":
                return mensagemInicial(nomeCliente);
            case "aula": //AULA
                return " bem vindo a aula";
            default:
                return mensagemInsucesso(nomeCliente);
        }
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
