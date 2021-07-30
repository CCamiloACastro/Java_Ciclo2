package com.CCamiiloACastro.Clases_Java_Ciclo2.Semana1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Ejercicio2 
{
    public static void main( String[] args )
    {
    	var sc = new Scanner (System.in);
    	
    	System.out.println("Introduce un número entero:");
    	Integer numero = sc.nextInt();
    	
    	
        System.out.println("El numero tiene "+numeroDigitos(numero)+" digitos");
        
    }
    public static Integer numeroDigitos(Integer numero) {
    	var cifras = 0;
    	while (numero != 0) {
    		numero /= 10;
    		//System.out.println(numero);
    		cifras++;
    		//System.out.println(cifras);
    	}
    	return cifras;
    }
}
