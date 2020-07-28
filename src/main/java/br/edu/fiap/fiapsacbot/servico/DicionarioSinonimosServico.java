package br.edu.fiap.fiapsacbot.servico;

public class DicionarioSinonimosServico {

	public DicionarioSinonimosServico() {
	}

	public String sinonimoPalavra(String palavraOrigem) {
		if (palavraOrigem.equals("classe") || palavraOrigem.equals("classes") || palavraOrigem.equals("colégio") || palavraOrigem.equals("colegio")
				|| palavraOrigem.equals("escola") || palavraOrigem.equals("sala") || palavraOrigem.equals("turma")
				|| palavraOrigem.equals("curso")|| palavraOrigem.equals("cursos")|| palavraOrigem.equals("aulas")) {
			return "aula";
		}
		
		if (palavraOrigem.equals("na semana")) {
			return "aula.semana";
		}
		
		if (palavraOrigem.equals("no final de semana")) {
			return "aula.final-semana";
		}
		
		if (palavraOrigem.equals("pendentes")) {
			return "aula.pendentes";
		}				
	
		if (palavraOrigem.equals("professores")) {
			return "aula.professores";
		}
		
		if (palavraOrigem.equals("rafael matsuyama")) {
			return "aula.professores.rafael";
		}		
		
		if (palavraOrigem.equals("presença")) {
			return "aula.presenca";
		}		

		if (palavraOrigem.equals("notas")) {
			return "aula.notas";
		}
		
		if (palavraOrigem.equals("javaplataform")) {
			return "aulas.notas.javaplataform";
		}
		
		if(palavraOrigem.equals("grades de aulas") || 
				palavraOrigem.equals("grade de aulas") || 
				palavraOrigem.equals("calendario de aulas") ||
				palavraOrigem.equals("calendário de aulas") ||
				palavraOrigem.equals("calendario de aula") ||
				palavraOrigem.equals("calendário de aula") ) {
			return "calendario.aula";
		}
		
		if(palavraOrigem.equals("matérias") || palavraOrigem.equals("materias")) {
			return "calendario.aula.materias";
		}
		
		if(palavraOrigem.equals("professor")) {
			return "calendario.aula.professor";
		}
		
		return palavraOrigem;
	}
}
