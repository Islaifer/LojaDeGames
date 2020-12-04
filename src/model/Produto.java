package model;

public class Produto {
	private long id;
	private String nome;
	private String tipoGame;
	
	public Produto(long id, String nome, String tipoGame) {
		this.nome = nome;
		this.tipoGame = tipoGame;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoGame() {
		return tipoGame;
	}

	public void setTipoGame(String tipoGame) {
		this.tipoGame = tipoGame;
	}
}
