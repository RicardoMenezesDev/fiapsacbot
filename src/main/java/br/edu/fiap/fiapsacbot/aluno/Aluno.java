package br.edu.fiap.fiapsacbot.aluno;

public class Aluno {
	private Long userIdChat;
	private String nome;
	private Integer numeroInteracoesInsucesso;
	private String ultimaRespostaFiap;
	
	public Aluno() {}
	
	public Aluno(Long userIdChat, String nome, Integer numeroInteracoesInsucesso, String ultimaRespostaFiap) {
		this.userIdChat = userIdChat;
		this.nome = nome;
		this.numeroInteracoesInsucesso = numeroInteracoesInsucesso;
		this.ultimaRespostaFiap = ultimaRespostaFiap;
	}

	public Long getUserIdChat() {
		return userIdChat;
	}

	public void setUserIdChat(Long userIdChat) {
		this.userIdChat = userIdChat;
	}	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroInteracoesInsucesso() {
		return numeroInteracoesInsucesso;
	}

	public void setNumeroInteracoesInsucesso(Integer numeroInteracoes) {
		this.numeroInteracoesInsucesso = numeroInteracoes;
	}

	public String getUltimaRespostaFiap() {
		return ultimaRespostaFiap;
	}

	public void setUltimaRespostaFiap(String ultimaRespostaFiap) {
		this.ultimaRespostaFiap = ultimaRespostaFiap;
	}

}
