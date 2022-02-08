package model;

import java.sql.Date;

public class Destino {
	private Integer idDestino;
	private String nomeDestino;
	private double precoDestino;

	public Integer getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(Integer idDestino) {
		this.idDestino = idDestino;
	}

	public String getNomeDestino() {
		return nomeDestino;
	}

	public void setNomeDestino(String nomeDestino) {
		this.nomeDestino = nomeDestino;
	}

	public double getPrecoDestino() {
		return precoDestino;
	}

	public void setPrecoDestino(double precoDestino) {
		this.precoDestino = precoDestino;
	}

	public Destino(String nomeDestino, double precoDestino) {
		super();
		this.nomeDestino = nomeDestino;
		this.precoDestino = precoDestino;
	}

	public Destino() {

	}

}