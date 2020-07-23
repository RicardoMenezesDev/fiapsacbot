package br.edu.fiap.fiapsacbot.configuracao;

public enum TelegramEnum {

	USUARIO("fiapsac_bot"),
	TOKEN("1301863895:AAHQqRxWkm_4PY_u-y-azynePh2S6KJ0Cwo");
	
	private String descricao;
	
	TelegramEnum(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
