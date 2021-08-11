package com.CCamiiloACastro.Clases_Java_Ciclo2.semana2.Ajedrez;

public class Casilla {
	private String color;
	private Integer columna;
	private Integer fila;
	Boolean vOcupada;
	
	public Casilla(String color, Integer columna, Integer fila) {
		this.color = color;
		this.columna = columna;
		this.fila = fila;
	}
	
	public Boolean ocupada() {
		vOcupada =! vOcupada;
		System.out.println("Valor de vOcupada: " + vOcupada);
		return vOcupada;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getColumna() {
		return columna;
	}

	public void setColumna(Integer columna) {
		this.columna = columna;
	}

	public Integer getFila() {
		return fila;
	}

	public void setFila(Integer fila) {
		this.fila = fila;
	}
	
	
	
}