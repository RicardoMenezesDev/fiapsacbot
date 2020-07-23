package br.edu.fiap.fiapsacbot.servico;

import org.telegram.telegrambots.meta.api.objects.Update;

public class MensagemValidacao {

	public Boolean temNovaMensagem(Update update) {
		return update.hasMessage() && update.getMessage().hasText();
	}
}
