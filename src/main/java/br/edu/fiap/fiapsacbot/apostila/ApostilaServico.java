package br.edu.fiap.fiapsacbot.apostila;

public class ApostilaServico {

    public String respostaApostilaFiap(String pergunta) {
        switch (pergunta) {
            case "apostila.materias":
                return ApostilaEnum.MATERIAS.getDescricao();
            case "apostila.persistence":
                return ApostilaEnum.PERSISTENCE.getDescricao();
            case "apostila.designthinking":
                return ApostilaEnum.DESIGN_THINKING.getDescricao();
            case "apostila.javaplatform":
                return ApostilaEnum.JAVA_PLATFORM.getDescricao();
            case "apostila.cloud":
                return ApostilaEnum.CLOUD.getDescricao();
            case "apostila.devops":
                return ApostilaEnum.DEVOPS.getDescricao();
            case "apostila.androidkotlin":
                return ApostilaEnum.ANDROID_KOTLIN.getDescricao();
            case "apostila.swift":
                return ApostilaEnum.SWIFT.getDescricao();
            case "apostila.netcore":
                return ApostilaEnum.NET_CORE.getDescricao();
            default:
                return ApostilaEnum.APOSTILA.getDescricao();
        }
    }
}