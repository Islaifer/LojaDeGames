package model;

public class Saida {
	private long id;
	private Produto produto;
	private Cliente cliente;
	private String nomeProduto;
	private String nomeCliente;
	private double valor;
	private int qntd;
	
	public Saida(long id, Produto produto, Cliente cliente, double valor, int qntd) {
		this.id = id;
		this.produto = produto;
		this.cliente = cliente;
		this.valor = valor;
		this.qntd = qntd;
		this.nomeCliente = cliente.getNome();
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQntd() {
		return qntd;
	}

	public void setQntd(int qntd) {
		this.qntd = qntd;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
}
