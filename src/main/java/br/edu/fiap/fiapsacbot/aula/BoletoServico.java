package br.edu.fiap.fiapsacbot.aula;

public class BoletoServico {
    public String respostaAulasFiap(String pergunta) {
        switch (pergunta) {
            case "aula.pagos":
                return BoletoEnum.PAGOS.getDescricao();
            default:
                return BoletoEnum.BOLETO.getDescricao();
        }
    }
}
