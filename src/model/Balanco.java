package model;

import java.util.List;

public class Balanco {
	private long id;
	private List<Entrada> entradas;
	private List<Saida> saidas;
	private double valorEntrada;
	private double valorSaida;
	private double ganho;
	
	public Balanco(long id, List<Entrada> entradas, List<Saida> saidas) {
		this.id = id;
		this.entradas = entradas;
		this.saidas = saidas;
		this.valorEntrada = 0;
		this.valorSaida = 0;
		this.ganho = valorSaida - valorEntrada;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Entrada> getEntrada() {
		return entradas;
	}

	public void setEntrada(List<Entrada> entradas) {
		this.entradas = entradas;
	}

	public List<Saida> getSaida() {
		return saidas;
	}

	public void setSaida(List<Saida> saidas) {
		this.saidas = saidas;
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
