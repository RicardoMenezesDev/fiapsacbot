package br.edu.fiap.fiapsacbot.aula.calendario;

public class AulaCalendarioServico {

	public String respostaAulasCalendarioFiap(String pergunta) {
		switch (pergunta) {
		case "calendario.aula":
			return AulaCalendarioEnum.CALENDARIO_PERGUNTA.getDescricao();
		case "calendario.aula.materias":
			return AulaCalendarioEnum.CALENDARIO_MATERIA.getDescricao();
		case "calendario.aula.professor":
			return AulaCalendarioEnum.CALENDARIO_PROFESSOR.getDescricao();
		default:
			return AulaCalendarioEnum.CALENDARIO_PERGUNTA.getDescricao();
		}
	}
}
