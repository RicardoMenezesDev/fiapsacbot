package br.edu.fiap.fiapsacbot.servico;

public class DicionarioSinonimos {

    public DicionarioSinonimos() {
    }

    public String sinonimoPalavra(String palavraOrigem) {
        //region Aula
        if (palavraOrigem.equals("classe") || palavraOrigem.equals("classes") || palavraOrigem.equals("col") || palavraOrigem.equals("colegio")
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
        //endregion

        //region Trabalho
        if (palavraOrigem.equals("tarefa") || palavraOrigem.equals("atividade") || palavraOrigem.equals("exercício")
                || palavraOrigem.equals("exercicio") || palavraOrigem.equals("exames")) {
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
        //endregion

        //region Boleto
        if (palavraOrigem.equals("fatura") || palavraOrigem.equals("boleto")) {
            return "boleto";
        }

        if (palavraOrigem.equals("pagos")) {
            return "boletos.pagos";
        }
        //endregion

        //region Disciplina
        if (palavraOrigem.equals("cadeira") || palavraOrigem.equals("disciplina")) {
            return "disciplina";
        }

        if (palavraOrigem.equals("concluida") || palavraOrigem.equals("concluída")) {
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
        //endregion

        //region Apostila
        if (palavraOrigem.equals("apostila") || palavraOrigem.equals("apostilas") ||
                palavraOrigem.equals("livro") || palavraOrigem.equals("livros") ||
                palavraOrigem.equals("material"))
            return "apostila";

        if (palavraOrigem.contains("mat")) {
            return "apostila.materias";
        }

        if (palavraOrigem.equals("persistence")) {
            return "apostila.persistence";
        }

        if (palavraOrigem.equals("design") || palavraOrigem.equals("designthinking")) {
            return "apostila.designthinking";
        }

        if (palavraOrigem.equals("java") || palavraOrigem.equals("javaplatform")) {
            return "apostila.javaplatform";
        }

        if (palavraOrigem.equals("cloud")) {
            return "apostila.cloud";
        }

        if (palavraOrigem.equals("devops")) {
            return "apostila.devops";
        }

        if (palavraOrigem.equals("android") || palavraOrigem.equals("androidkotlin")) {
            return "apostila.androidkotlin";
        }

        if (palavraOrigem.equals("swift")) {
            return "apostila.swift";
        }

        if (palavraOrigem.equals("net") || palavraOrigem.equals(".net") ||
                palavraOrigem.equals("netcore") || palavraOrigem.equals(".netcore") ||
                palavraOrigem.equals(".") || palavraOrigem.equals("dot") ||
                palavraOrigem.equals("dotnet") || palavraOrigem.equals("dotnetcore")) {
            return "apostila.netcore";
        }
        //endregion

        return palavraOrigem;
    }
}
