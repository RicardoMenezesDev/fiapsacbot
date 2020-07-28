package br.edu.fiap.fiapsacbot.servico;

import java.util.Calendar;

import org.telegram.telegrambots.meta.api.objects.Update;

import br.edu.fiap.fiapsacbot.aluno.Aluno;
import br.edu.fiap.fiapsacbot.apostila.ApostilaServico;
import br.edu.fiap.fiapsacbot.aula.AulaServico;
import br.edu.fiap.fiapsacbot.aula.calendario.AulaCalendarioServico;
import br.edu.fiap.fiapsacbot.boleto.BoletoServico;
import br.edu.fiap.fiapsacbot.configuracao.MensagemEnumConfig;
import br.edu.fiap.fiapsacbot.disciplina.DisciplinaServico;
import br.edu.fiap.fiapsacbot.trabalho.TrabalhoServico;

public class FluxoMensagemServico {
	
    public String respostaFiap(Update update, Aluno aluno) {
        DicionarioSinonimosServico dicionarioSinonimos = new DicionarioSinonimosServico();
        AulaServico aulaServico = new AulaServico();
        AulaCalendarioServico aulaCalendarioServico = new AulaCalendarioServico();
        
        String nomeCliente = update.getMessage().getFrom().getFirstName();
        String palavraOrigem = update.getMessage().getText();
        String topico = dicionarioSinonimos.sinonimoPalavra(palavraOrigem.toLowerCase());

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
                
        if(topico.contains("calendario.aula")) {
        	return aulaCalendarioServico.respostaAulasCalendarioFiap(topico); 
        }
        
        if(topico.contains("aula")) {
        	return aulaServico.respostaAulasFiap(topico); 
        }
        
        return mensagemInsucesso(nomeCliente, aluno);

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

        return String.format("%s, %s!\n%s\n%s", periodo, nomeCliente, MensagemEnumConfig.BEM_VINDO_AJUDA.getDescricao(), MensagemEnumConfig.OPCOES.getDescricao());
    }

    private String mensagemInsucesso(String nomeCliente, Aluno aluno) {
    	aluno.setNumeroInteracoesInsucesso(aluno.getNumeroInteracoesInsucesso() + 1);
        return nomeCliente + MensagemEnumConfig.NAO_ENTENDI.getDescricao();
    }
}
