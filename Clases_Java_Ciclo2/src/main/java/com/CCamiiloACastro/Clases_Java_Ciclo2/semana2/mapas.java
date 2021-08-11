package com.CCamiiloACastro.Clases_Java_Ciclo2.semana2;

import java.util.HashMap;
import java.util.Map;

/*
 * Los mapas permiten establecer una correspondencia entre pares de objetos: uno  que
 * actua como clave y otr valor asociado a esa clave
 *Un diccionario es un mapa entre cadenas de texto: la palabra que buscamos en el 
 *diccionario actúa como clave y sus significado como valor asociado 
 */

// class CoordenadaAjedrez{
//	private String letra;
//	private Integer numero;
//	
//	public CoordenadaAjedrez(String letra, Integer numero) {
//		this.letra = letra;
//		this.numero = numero;
//	}
//}
//
//class PiezaAjedrez{
//	private String nombre;
//	private String color;
//
//	public PiezaAjedrez(String nombre, String color) {
//		this.nombre = nombre;
//		this.color = color;
//	}
//	
//	
//}

public class mapas {
    public static void main( String[] args ) {
    	
    	/*Implentaciones
    	 * Hashtable: Es una estructura de datos que utiliza una función hash, ya no es usado
    	 * HashMap: Almacena para clave / valor en una tabla hash, y no estan ordenados de 
    	 * ninguna manera
    	 * LinkedHashMap: Agrega una lista vinculada a la estructrura del HashMap 
    	 * TreeMap: Es implemntado como una arbol Rojo - Negro, un tipo de arbol binario de 
    	 * busqueda equilibrada
    	 */
		
    	System.out.println( "Crear Lista" );
        //Map<CoordenadaAjedrez, PiezaAjedrez> damero = new HashMap<>();
        Map<String, String> mapaEjemplo = new HashMap<>(); 
        //var damero = new HashMap<CoordenadaAjedrez, PiezaAjedrez>();
        //CoordenadaAjedrez pa = new CoordenadaAjedrez("A",3);
        //System.out.println("damero-> "+ damero.containsKey(pa));
        System.out.println( "Añadir elemento" );
        mapaEjemplo.put("clave1","valor1");
        mapaEjemplo.put("clave2","valor2");
        mapaEjemplo.put("clave3","valor3");
        mapaEjemplo.put("clave4","valor4");
        mapaEjemplo.put("clave5","valor5");
        mapaEjemplo.put("clave6","valor6");
        
        System.out.println( "tamaño: " + mapaEjemplo.size());
        
        System.out.println("Mapaejemplo-> "+ mapaEjemplo.containsKey("ssd"));
        System.out.println("Mapaejemplo-> "+ mapaEjemplo.containsKey("clave1"));
        
        System.out.println("Mapaejemplo-> "+ mapaEjemplo.containsValue("jhg"));
        System.out.println("Mapaejemplo-> "+ mapaEjemplo.containsValue("valor1"));
        
        System.out.println("Mapaejemplo "+ mapaEjemplo);
        
        System.out.println( "eliminar objetos de una lista" );
        System.out.println("Mapaejemplo remove -> " + mapaEjemplo.remove("clave1"));
        System.out.println("Mapaejemplo removido" + mapaEjemplo);
        
        
        System.out.println( "esta vacia? -> " + mapaEjemplo.isEmpty ());
        System.out.println( "" );
        
        System.out.println( "Recorrer el conjunto" );
        var claveRecorrer = mapaEjemplo.keySet();
        
        for(String clave : claveRecorrer) {
        	String valor = mapaEjemplo.get(clave);
        	System.out.println(clave + " -> " + valor );
        }

    }
}