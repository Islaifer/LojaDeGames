package model;

public class Balanco {
	private long id;
	private Entrada entrada;
	private Saida saida;
	private double valorEntrada;
	private double valorSaida;
	private double ganho;
	
	public Balanco(long id, Entrada entrada, Saida saida) {
		this.id = id;
		this.entrada = entrada;
		this.saida = saida;
		this.valorEntrada = entrada.getValor();
		this.valorSaida = saida.getValor();
		this.ganho = valorSaida - valorEntrada;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Entrada getEntrada() {
		return entrada;
	}

	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}

	public Saida getSaida() {
		return saida;
	}

	public void setSaida(Saida saida) {
		this.saida = saida;
	}

	public double getValorEntrada() {
		return valorEntrada;
	}

	public double getValorSaida() {
		return valorSaida;
	}

	public double getGanho() {
		return ganho;
	}
	
	
}
