package br.edu.fiap.fiapsacbot.configuracao;

public enum MensagemEnum {
    BEM_VINDO("\nSeja bem vindo(a) ao Serviço de Atendimento da FIAP."),
    BEM_VINDO_AJUDA("\nComo podemos ajudar?"),
    OPCOES("\nPara facilitar seu atendimento consulte as opções abaixo:\n" +
            "\n - AULAS" +
            "\n - APOSTILAS" +
            "\n - CALEND?RIO DE AULAS" +
            "\n - ENTREGA DE TRABALHOS" +
            "\n - BOLETO" +
            "\n - ALTERAR SENHA" +
            "\n - PROFESSORES" +
            "\n - DISCIPLINAS" +
            "\n - NOTAS"),
    MATRICULA("\nInforme sua matrícula para iniciar o atendimento."),
    NAO_ENTENDI(" Desculpe, não foi possível realizar sua solicitação. Informe uma das opções abaixo para prosseguir com o atendimento." +
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
