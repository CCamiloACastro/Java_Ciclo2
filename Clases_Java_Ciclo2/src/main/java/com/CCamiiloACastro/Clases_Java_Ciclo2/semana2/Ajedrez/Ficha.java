package com.CCamiiloACastro.Clases_Java_Ciclo2.semana2.Ajedrez;

public abstract class Ficha {
	private String color = "Sin color asignado";
	Boolean comer = false;
	Boolean mover = false;

	
	public Ficha(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		color = color.toUpperCase();
		this.color = color;
	}

	public Boolean comer() {
		// Que tenga sentido
		comer = !comer;
		return comer;
	}

	public Boolean mover() {
		mover = !mover;
		return mover;
	}

}