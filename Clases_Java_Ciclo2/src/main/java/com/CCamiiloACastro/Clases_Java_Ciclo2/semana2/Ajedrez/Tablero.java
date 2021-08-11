package com.CCamiiloACastro.Clases_Java_Ciclo2.semana2.Ajedrez;

public class Tablero {
	Boolean vEnroque = false;
	Boolean vJaque = false;
	Boolean vJaqueMate = false;

	public Tablero() {
	}

	public Boolean enroque() {
		vEnroque = !vEnroque;
		System.out.println("Valor de Enroque: " + vEnroque);
		return vEnroque;
	}

	public Boolean jaque() {
		vJaque = !vJaque;
		System.out.println("Valor de Jaque: " + vJaque);
		return vJaque;
	}

	public Boolean jaqueMate() {
		vJaqueMate = !vJaqueMate;
		System.out.println("Valor de JaqueMate: " + vJaqueMate);
		return vJaqueMate;
	}
}