package br.edu.fiap.fiapsacbot.configuracao;

public enum TelegramEnumConfig {

    USUARIO("fiapsac_bot"),
    TOKEN("1301863895:AAHQqRxWkm_4PY_u-y-azynePh2S6KJ0Cwo");

    private String descricao;

    TelegramEnumConfig(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
