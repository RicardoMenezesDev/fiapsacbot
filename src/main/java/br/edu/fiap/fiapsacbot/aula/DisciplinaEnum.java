package br.edu.fiap.fiapsacbot.aula;

public enum DisciplinaEnum {

    DISCIPLINA("Escolha um dos serviços disponíveis::\n" +
            "\n- Concluída" +
            "\n- Pendente" +
            "\n- Reprovada" +
            "\n- Aprovada"),
    CONCLUIDA("Segue abaixo uma lista das disciplinas concluídas:" +
            "\n- Persistence" +
            "\n- Design Thinking" +
            "\n- Java Plataform" ),
    REPROVADAS("Você não possui reprovação em nenhuma disciplina."),
    APROVADAS("Segue abaixo uma lista das disciplinas concluídas:" +
            "\n- Cloud" +
            "\n- Devops" ),
    PENDENTE("Segue abaixo uma lista das disciplinas concluídas:" +
            "\n- Persistence" +
            "\n- Design Thinking" +
            "\n- Java Plataform" +
            "\n- Android Kotlin " +
            "\n- Swift" +
            "\n- .Net Core" );

    private final String descricao;

    DisciplinaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
