package br.edu.fiap.fiapsacbot.servico;

public class DicionarioSinonimos {

    public DicionarioSinonimos() {
    }

    public String sinonimoPalavra(String palavraOrigem) {
        if (palavraOrigem.equals("classe") || palavraOrigem.equals("classes") || palavraOrigem.equals("colégio") || palavraOrigem.equals("colegio")
                || palavraOrigem.equals("escola") || palavraOrigem.equals("sala") || palavraOrigem.equals("turma")
                || palavraOrigem.equals("curso") || palavraOrigem.equals("cursos") || palavraOrigem.equals("aulas")) {
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

        if (palavraOrigem.equals("presença")) {
            return "aula.presenca";
        }

        if (palavraOrigem.equals("notas")) {
            return "aula.notas";
        }

        return palavraOrigem;
    }
}
