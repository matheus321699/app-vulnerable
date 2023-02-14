package com.github.matheus321699.fornecedor.domain;

public class TrianguloEquilatero {

	private double catetoOposto;
	private double catetoAdjacente;
	private double hipotenusa;
	
	public TrianguloEquilatero() {
		
	}
	
	public TrianguloEquilatero(double catetoOposto, double catetoAdjacente, double hipotenusa) {
		super();
		this.catetoOposto = catetoOposto;
		this.catetoAdjacente = catetoAdjacente;
		this.hipotenusa = hipotenusa;
	}

	public double getCatetoOposto() {
		return catetoOposto;
	}
	public void setCatetoOposto(double catetoOposto) {
		this.catetoOposto = catetoOposto;
	}
	public double getCatetoAdjacente() {
		return catetoAdjacente;
	}
	public void setCatetoAdjacente(double catetoAdjacente) {
		this.catetoAdjacente = catetoAdjacente;
	}
	public double getHipotenusa() {
		return hipotenusa;
	}
	public void setHipotenusa(double hipotenusa) {
		this.hipotenusa = hipotenusa;
	}
	
	
	
	
}
