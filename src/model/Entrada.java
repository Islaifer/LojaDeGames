package model;

public class Entrada {
	private long id;
	private Produto produto;
	private String nomeProduto;
	private int qntd;
	private double valor;
	
	public Entrada(long id, Produto produto, int qntd, double valor) {
		this.id = id;
		this.produto = produto;
		this.qntd = qntd;
		this.valor = valor;
		this.nomeProduto = produto.getNome();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQntd() {
		return qntd;
	}

	public void setQntd(int qntd) {
		this.qntd = qntd;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}
}
