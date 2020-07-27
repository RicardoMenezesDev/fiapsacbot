package br.edu.fiap.fiapsacbot.aula.calendario;

public enum AulaCalendarioEnum {
	CALENDARIO_PERGUNTA("De qual mat�ria/professor?"),
	CALENDARIO_MATERIA("Segue o calend�rio de aulas para essa mat�ria:" +
			"\n Segunda-feira: 27/07/2020 " +
			"\n Quarta-feira: 29/07/2020 " +
			"\n S�bado: 01/08/2020 "),
	CALENDARIO_PROFESSOR("Segue o calend�rio de aulas para esse professor:" +
			"\n Segunda-feira: 27/07/2020 " +
			"\n Quarta-feira: 29/07/2020 " +
			"\n S�bado: 01/08/2020 ");

    private final String descricao;

    AulaCalendarioEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

}
