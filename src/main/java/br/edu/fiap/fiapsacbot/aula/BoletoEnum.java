package br.edu.fiap.fiapsacbot.aula;

public enum BoletoEnum {
    BOLETO("Escolha um dos serviços disponíveis:\n" +
            "\n- Boletos Pagos"),
    PAGOS("Segue abaixo os baletos pagos:" +
            "\n 05/02/2020 - R$ 1000,00 - PAGO" +
            "\n 05/03/2020 - R$ 1000,00 - PAGO" +
            "\n 05/04/2020 - R$ 1000,00 - PAGO" +
            "\n 05/05/2020 - R$ 1000,00 - PAGO" +
            "\n 05/06/2020 - R$ 1000,00 - PAGO" +
            "\n 05/07/2020 - R$ 1000,00 - PAGO" +
            "\n 05/08/2020 - R$ 1000,00 - NÃO IDENTIFICADO" +
            "\n 05/09/2020 - R$ 1000,00 - NÃO IDENTIFICADO");

    private final String descricao;

    BoletoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
