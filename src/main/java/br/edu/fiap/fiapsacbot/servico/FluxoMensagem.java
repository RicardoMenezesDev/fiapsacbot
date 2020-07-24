package br.edu.fiap.fiapsacbot.servico;

import java.util.Calendar;

import org.telegram.telegrambots.meta.api.objects.Update;

import br.edu.fiap.fiapsacbot.configuracao.MensagemEnum;

public class FluxoMensagem {
	
	public String respostaFiap(Update update) {
		DicionarioSinonimos dicionarioSinonimos = new DicionarioSinonimos();
		String nomeCliente = update.getMessage().getFrom().getFirstName();
		String palavraOrigem = update.getMessage().getText();
		
		if(	palavraOrigem.equals("/start")) {
			return mensagemInicial(nomeCliente);
		}else { 
			String topico = dicionarioSinonimos.sinonimoPalavra(palavraOrigem.toLowerCase());
			if(topico.equals("aula")) {
				return " bem vindo a aula";
			}else {
				return mensagemInsucesso(nomeCliente);
			}
		}
	}
	
    private String mensagemInicial(String nomeCliente)
    {
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        String periodo = "";

        if(timeOfDay >= 0 && timeOfDay < 12){
            periodo = "Bom dia";
        }else if(timeOfDay >= 12 && timeOfDay < 16){
            periodo = "Boa tarde";
        }else if(timeOfDay >= 18 && timeOfDay < 24){
            periodo = "Boa noite";
        }
        
        return String.format("%s, %s.", periodo, nomeCliente) + MensagemEnum.AJUDA.getDescricao();        
    }

    private String mensagemInsucesso(String nomeCliente) {
    	return nomeCliente + MensagemEnum.NAO_ENTENDI.getDescricao(); 
    }
}
