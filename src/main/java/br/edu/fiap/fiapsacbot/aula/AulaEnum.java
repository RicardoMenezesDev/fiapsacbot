package br.edu.fiap.fiapsacbot.aula;

public enum AulaEnum {
	AULA("Precisamos de mais informações, seguem as opções para facilitar:\n" +
			"\n- Na semana" + 
			"\n- No final de semana" + 
			"\n- Pendentes" + 
			"\n- Professores" +
			"\n- Presença" +
			"\n- Notas"),
	FINAL_SEMANA("Haverá aula no dia 25/07/2020."),
	NOTA("Qual a matéria você gostaria de saber as notas?"),
	PENDENTES("Faltam 3 aulas para a conclusão do curso."),
	PROFESSORES("De qual professor você precisa saber?."),
	PRESENCA("Você frequentou 95% dessas aulas. Possuí 1 falta."),
	SEMANA("Haveram 2 aulas esta semana.");
	

    private final String descricao;

    AulaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

}
