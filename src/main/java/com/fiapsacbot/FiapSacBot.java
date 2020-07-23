package com.fiapsacbot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class FiapSacBot extends TelegramLongPollingBot {

    private Boolean iniciado = false;
    Funcoes funcoes = new Funcoes();

        public void onUpdateReceived(Update update) {

            if (update.hasMessage() && update.getMessage().hasText()) {
                if(update.getMessage().getText().equals("/start"))
                {
                    System.out.println("MENSAGEM BOM DIA");
                    SendMessage message = new SendMessage()
                            .setChatId(update.getMessage().getChatId())
                            .setText(funcoes.getMensagem(update.getMessage().getFrom().getFirstName()));
                    try
                    {
                        execute(message);
                    }
                    catch (TelegramApiException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
    }

    public String getBotUsername() {
        return "fiapsac_bot";
    }

    public String getBotToken() {
        return "1301863895:AAHQqRxWkm_4PY_u-y-azynePh2S6KJ0Cwo";
    }


}
