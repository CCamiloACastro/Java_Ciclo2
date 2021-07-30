package com.CCamiiloACastro.Clases_Java_Ciclo2.Semana1;

import java.util.Scanner;

public class Ejercicio4{
	
	public static void main(String[] arg) {
		var sc = new Scanner (System.in);
		//Integer dia = 14, mes=12, año= 1975;
		
		System.out.println("Digita tu día de nacimiento");
		Integer dia = sc.nextInt();
		System.out.println("Digita el numero del mes de nacimiento");
		Integer mes = sc.nextInt();
		System.out.println("Digita el año de tu nacimiento");
		Integer año = sc.nextInt();
		
		Integer suma = dia+mes+año;
		String sumastr = suma.toString();
		System.out.println("Tu número de la suerte es: " + divisorDigitos(suma));
	
	}
	public static Integer divisorDigitos(Integer numero) {
		Integer numero2 = 0;
		numero2 += numero/1000;
		numero = numero - ((numero/1000)*1000);
		numero2 += numero/100;
		numero = numero - ((numero/100)*100);
		numero2 += numero/10;
		numero = numero - ((numero/10)*10);
		numero2 += numero;
		return numero2;
		
		
	}
}