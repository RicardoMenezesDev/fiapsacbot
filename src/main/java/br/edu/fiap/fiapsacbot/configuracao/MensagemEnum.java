package br.edu.fiap.fiapsacbot.configuracao;

public enum MensagemEnum {
    BEM_VINDO("\nSeja bem vindo(a) ao Servi�o de Atendimento da FIAP."),
    BEM_VINDO_AJUDA("\nComo podemos ajudar?"),
    OPCOES("\nPara facilitar seu atendimento consulte as op��es abaixo:\n" +
            "\n - AULAS" +
            "\n - APOSTILAS" +
            "\n - CALEND?RIO DE AULAS" +
            "\n - ENTREGA DE TRABALHOS" +
            "\n - BOLETO" +
            "\n - ALTERAR SENHA" +
            "\n - PROFESSORES" +
            "\n - DISCIPLINAS" +
            "\n - NOTAS"),
    MATRICULA("\nInforme sua matr�cula para iniciar o atendimento."),
    NAO_ENTENDI(" Desculpe, n�o foi poss�vel realizar sua solicita��o. Informe uma das op��es abaixo para prosseguir com o atendimento." +
            "\n - AULAS" +
            "\n - APOSTILAS" +
            "\n - CALEND?RIO DE AULAS" +
            "\n - ENTREGA DE TRABALHOS" +
            "\n - BOLETO" +
            "\n - ALTERAR SENHA" +
            "\n - PROFESSORES" +
            "\n - DISCIPLINAS" +
            "\n - NOTAS");

    private final String descricao;

    MensagemEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

}
