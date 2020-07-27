package br.edu.fiap.fiapsacbot.aula;

public enum AulaEnum {
	AULA("Precisamos de mais informa��es, seguem as op��es para facilitar:\n" +
			"\n- Na semana" + 
			"\n- No final de semana" + 
			"\n- Pendentes" + 
			"\n- Professores" +
			"\n- Presen�a" +
			"\n- Notas"),
	FINAL_SEMANA("Haver� aula no dia 25/07/2020."),
	NOTA("Qual a mat�ria voc� gostaria de saber as notas?"),
	PENDENTES("Faltam 3 aulas para a conclus�o do curso."),
	PROFESSORES("De qual professor voc� precisa saber?."),
	PRESENCA("Voc� frequentou 95% dessas aulas. Possu� 1 falta."),
	SEMANA("Haveram 2 aulas esta semana.");
	

    private final String descricao;

    AulaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

}
