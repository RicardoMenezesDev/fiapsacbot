package br.edu.fiap.fiapsacbot.servico;

public class DicionarioSinonimos {

    public DicionarioSinonimos() {
    }

    public String sinonimoPalavra(String palavraOrigem) {
        if (palavraOrigem.equals("classe") || palavraOrigem.equals("classes") || palavraOrigem.equals("col�gio") || palavraOrigem.equals("colegio")
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

        if (palavraOrigem.equals("presen�a")) {
            return "aula.presenca";
        }

        if (palavraOrigem.equals("notas")) {
            return "aula.notas";
        }

        if (palavraOrigem.equals("tarefa") || palavraOrigem.equals("atividade") || palavraOrigem.equals("exercício")
                || palavraOrigem.equals("exames")) {
            return "trabalhos";
        }

        if (palavraOrigem.equals("entregues")) {
            return "trabalho.entregues";
        }

        if (palavraOrigem.equals("notas")) {
            return "trabalho.notas";
        }

        if (palavraOrigem.equals("datas")) {
            return "trabalho.datas";
        }

        if (palavraOrigem.equals("tarefa") || palavraOrigem.equals("atividade") || palavraOrigem.equals("exercício")
                || palavraOrigem.equals("exame")) {
            return "trabalho";
        }

        if (palavraOrigem.equals("entregues")) {
            return "trabalho.entregues";
        }

        if (palavraOrigem.equals("notas")) {
            return "trabalho.notas";
        }

        if (palavraOrigem.equals("datas")) {
            return "trabalho.datas";
        }

        if (palavraOrigem.equals("fatura") || palavraOrigem.equals("boleto")) {
            return "boleto";
        }

        if (palavraOrigem.equals("pagos")) {
            return "boletos.pagos";
        }

        if (palavraOrigem.equals("cadeira") || palavraOrigem.equals("disciplina")) {
            return "disciplina";
        }

        if (palavraOrigem.equals("concluida")) {
            return "disciplina.concluida";
        }

        if (palavraOrigem.equals("pendente")) {
            return "disciplina.pendente";
        }

        if (palavraOrigem.equals("reprovado")) {
            return "disciplina.reprovado";
        }

        if (palavraOrigem.equals("aprovado")) {
            return "disciplina.aprovado";
        }


        return palavraOrigem;
    }
}
