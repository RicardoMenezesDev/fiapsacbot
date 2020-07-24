package br.edu.fiap.fiapsacbot.configuracao;

public enum MensagemEnum {
	AULA("Preciamos de mais informações, seguem as opções para facilitar:\n" +
			"\n- Na semana" + 
			"\n- Na no final de semana" + 
			"\n- Pendentes" + 
			"\n- Professores" +
			"\n- Presença" +
			"\n- Notas"),
    BEM_VINDO("\nSeja bem vindo(a) ao Serviço de Atendimento da FIAP."),
    BEM_VINDO_AJUDA("\nComo podemos ajudar?"),
    OPCOES("\nPara facilitar, temos as seguintes opções para ajudar a direcionar sua busca:\n" +
            "\n - AULAS" +
            "\n - APOSTILAS" +
            "\n - CALENDÁRIO DE AULAS" +
            "\n - ENTREGA DE TRABALHOS" +
            "\n - BOLETO" +
            "\n - ALTERAR SENHA" +
            "\n - PROFESSORES" +
            "\n - DISCIPLINAS" +
            "\n - NOTAS"),
    NAO_ENTENDI(" não entendi muito bem, mas oh! um exemplo, se for pra falar de aulas, digite aqui a palavra aula."),
    MATRICULA("\nInforme sua matrícula para iniciar o atendimento.");

    private final String descricao;

    MensagemEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

}
