package com.fiapsacbot;

import java.util.Calendar;

public class Funcoes {

    String mensagem = "";
    public static String MENSAGEM_BEM_VINDO = "\nSeja bem vindo(a) ao Serviço de Atendimento ao Cliente da FIAP.";
    public static String MENSAGEM_MATRICULA = "\n\nInforme sua matrícula para iniciar o atendimento.";

    public String getMensagem(String nome) {
        mensagem = MontarMensagemInicial(nome);
        return mensagem;
    }

    private String RetornarPeriodoDia()
    {
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        String periodo = "";

        if(timeOfDay >= 0 && timeOfDay < 12){
            periodo = "Bom dia";
        }else if(timeOfDay >= 12 && timeOfDay < 16){
            periodo = "Bom tarde";
        }else if(timeOfDay >= 16 && timeOfDay < 21){
            periodo = "Boa noite";
        }else if(timeOfDay >= 21 && timeOfDay < 24){
            periodo = "Boa noite";
        }
        return periodo;
    }

    private String MontarMensagemInicial(String nomeCompleto)
    {
        return String.format("%s, %s.", RetornarPeriodoDia(), nomeCompleto) + MENSAGEM_BEM_VINDO + MENSAGEM_MATRICULA;
    }
}
