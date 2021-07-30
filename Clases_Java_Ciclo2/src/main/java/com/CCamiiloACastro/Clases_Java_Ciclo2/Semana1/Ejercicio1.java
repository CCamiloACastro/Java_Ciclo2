package com.CCamiiloACastro.Clases_Java_Ciclo2.Semana1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Ejercicio1 
{
    public static void main( String[] args )
    {
    	var sc = new Scanner (System.in);
    	
    	System.out.println("Dime tu nombre:");
    	var nombre = sc.nextLine();
    	//var nombre = "Camilin";
        System.out.println(saludo(nombre));
        
    }
    public static String saludo(String nombre) {
    	return "Hola " + nombre + "!!! Como vas?";
    }
}
