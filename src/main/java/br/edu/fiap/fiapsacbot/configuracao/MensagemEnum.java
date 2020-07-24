package br.edu.fiap.fiapsacbot.configuracao;

public enum MensagemEnum {
    BEM_VINDO("\nSeja bem vindo(a) ao Servi�o de Atendimento da FIAP."),
    BEM_VINDO_AJUDA("\nComo podemos ajudar?"),
    OPCOES("\nPara facilitar, temos as seguintes op��es para ajudar a direcionar sua busca:\n" +
            "\n - AULAS" +
            "\n - APOSTILAS" +
            "\n - CALEND�RIO DE AULAS" +
            "\n - ENTREGA DE TRABALHOS" +
            "\n - BOLETO" +
            "\n - ALTERAR SENHA" +
            "\n - PROFESSORES" +
            "\n - DISCIPLINAS" +
            "\n - NOTAS"),
    NAO_ENTENDI(" n�o entendi muito bem, mas oh! atualmente o que eu consigo te informar � sobre os t�picos: aula, calend�rio de aulas. \nSe for isso, digita aqui o t�pico, tudo bem?"),
    MATRICULA("\nInforme sua matr�cula para iniciar o atendimento.");

    private final String descricao;

    MensagemEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

}
