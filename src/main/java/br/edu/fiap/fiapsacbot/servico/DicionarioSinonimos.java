package br.edu.fiap.fiapsacbot.servico;

public class DicionarioSinonimos {

    public DicionarioSinonimos() {
    }

    public String sinonimoPalavra(String palavraOrigem) {
        if (palavraOrigem.equals("classe") || palavraOrigem.equals("colégio") || palavraOrigem.equals("colegio") || palavraOrigem.equals("escola")
                || palavraOrigem.equals("sala") || palavraOrigem.equals("turma") || palavraOrigem.equals("curso")) {
            return "aula";
        }
        return palavraOrigem;
    }
}
