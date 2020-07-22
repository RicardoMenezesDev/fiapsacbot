package br.com.fiap.fiapsacbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendSticker;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


@SpringBootApplication
public class FiapsacbotApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiapsacbotApplication.class, args);
		TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
		try {
			telegramBotsApi.registerBot(new FiapSacBot());

		} catch (TelegramApiException e) {
			e.printStackTrace();
		}

	}

}