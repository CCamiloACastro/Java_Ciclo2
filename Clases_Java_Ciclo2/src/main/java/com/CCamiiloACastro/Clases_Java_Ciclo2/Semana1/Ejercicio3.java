package com.CCamiiloACastro.Clases_Java_Ciclo2.Semana1;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main (String [] args ) {
		
		var sc = new Scanner (System.in);
		
		Integer a = 2;
    	Integer b = 0;
    	//Estructura del condicional
    	// si a == 4 entonces b = a+5 sino 6-a
    	b = a == 4 ? a+5 : 6-a;
    	System.out.println(a);
    	System.out.println(b);
    	
    	System.out.println("Introduce un número entero:");
    	Integer numero = sc.nextInt();
    	
    	String mensaje = numero % 2 == 0 ? "El " + numero + " es par" : "El " + numero + " es impar";
    	System.out.println(mensaje);    	
	}
}