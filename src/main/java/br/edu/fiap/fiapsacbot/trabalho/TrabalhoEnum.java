package br.edu.fiap.fiapsacbot.trabalho;

public enum TrabalhoEnum {

    TRABALHO("Escolha um dos serviços disponíveis:\n" +
            "\n- Entregues" +
            "\n- Notas" +
            "\n- Datas"),
    ENTREGUES("Você realizou a entrega dos trabalhos abaixo:" +
            "\n Java Plataform - Trabalho 01, Trabalho 02" +
            "\n Persistense - Trabalho 01" +
            "\n Design Thinking - Trabalho 01"),
    NOTA("Segue as notas dos trabalhos entregues:" +
            "\n Java Plataform - Trabalho 01 (7,5), Trabalho 02 (7,0)" +
            "\n Persistense - Trabalho 01 (8,0) " +
            "\n Design Thinking - Trabalho 01 (9,5)"),
    DATAS("Segue as datas para os próximos trabalhos"+
            "\n Java Plataform - Trabalho 03 - 28/07/2020" +
            "\n Persistense - Trabalho 02 - 08/08/2020, Trabalho 03 - 20/08/2020 " +
            "\n Design Thinking - Trabalho 02 28/07/2020");

    private final String descricao;

    TrabalhoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
