package br.edu.fiap.fiapsacbot.apostila;

public enum ApostilaEnum {
    APOSTILA("Precisamos de mais informações, seguem as opções para facilitar:\n" +
            "\n- Matérias" +
            "\n- Persistence" +
            "\n- Design Thinking" +
            "\n- Java Plataform" +
            "\n- Cloud" +
            "\n- Devops" +
            "\n- Android Kotlin " +
            "\n- Swift" +
            "\n- .Net Core"),
    MATERIAS("Segue o link para download de todas as apostilas: Clique aqui."),
    PERSISTENCE("Segue o link para download da apostila de Persistence: Clique aqui."),
    DESIGN_THINKING("Segue o link para download da apostila de Design Thinking: Clique aqui."),
    JAVA_PLATFORM("Segue o link para download da apostila de Java Platform: Clique aqui."),
    CLOUD("Segue o link para download da apostila de Cloud: Clique aqui."),
    DEVOPS("Segue o link para download da apostila de Devops: Clique aqui."),
    ANDROID_KOTLIN("Segue o link para download da apostila de Android Kotlin: Clique aqui."),
    SWIFT("Segue o link para download da apostila de Swift: Clique aqui."),
    NET_CORE("Segue o link para download da apostila de .Net Core: Clique aqui.");

    private final String descricao;

    ApostilaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

}
