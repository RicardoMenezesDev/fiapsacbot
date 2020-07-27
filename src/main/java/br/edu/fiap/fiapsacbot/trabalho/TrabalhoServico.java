package br.edu.fiap.fiapsacbot.trabalho;

public class TrabalhoServico {

    public String respostaAulasFiap(String pergunta) {
        switch (pergunta) {
            case "trabalho.entregues":
                return TrabalhoEnum.ENTREGUES.getDescricao();
            case "trabalho.notas":
                return TrabalhoEnum.NOTA.getDescricao();
            case "trabalho.datas":
                return TrabalhoEnum.DATAS.getDescricao();
            default:
                return TrabalhoEnum.TRABALHO.getDescricao();
        }
    }
}
