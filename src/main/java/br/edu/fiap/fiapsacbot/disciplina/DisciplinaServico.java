package br.edu.fiap.fiapsacbot.disciplina;

public class DisciplinaServico {
    public String respostaAulasFiap(String pergunta) {
        switch (pergunta) {
            case "disciplina.concluida":
                return DisciplinaEnum.CONCLUIDA.getDescricao();
            case "disciplina.pendente":
                return DisciplinaEnum.PENDENTE.getDescricao();
            case "disciplina.reprovado":
                return DisciplinaEnum.REPROVADAS.getDescricao();
            case "disciplina.aprovado":
                return DisciplinaEnum.APROVADAS.getDescricao();
            default:
                return DisciplinaEnum.DISCIPLINA.getDescricao();
        }
    }
}
