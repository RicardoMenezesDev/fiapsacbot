package br.edu.fiap.fiapsacbot;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import br.edu.fiap.fiapsacbot.servico.FiapSacBot;

public class Main {

    public static void main (String []args)
    {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new FiapSacBot());

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
