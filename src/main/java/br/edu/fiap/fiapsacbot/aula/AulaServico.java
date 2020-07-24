package br.edu.fiap.fiapsacbot.aula;

public class AulaServico {
	
	public String respostaAulasFiap(String pergunta) {
		switch (pergunta) {
		case "aula.semana":
			return AulaEnum.SEMANA.getDescricao();
		case "aula.final-semana":
			return AulaEnum.FINAL_SEMANA.getDescricao();
		case "aula.pendentes":
			return AulaEnum.PENDENTES.getDescricao();
		case "aula.professores":
			return AulaEnum.PROFESSORES.getDescricao();
		case "aula.presenca":
			return AulaEnum.PRESENCA.getDescricao();
		case "aula.notas":
			return AulaEnum.NOTA.getDescricao();
		default:
			return AulaEnum.AULA.getDescricao();
		}
	}
}
