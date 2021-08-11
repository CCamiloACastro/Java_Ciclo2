package com.CCamiiloACastro.Clases_Java_Ciclo2.semana2;

import java.util.Set;
import java.util.HashSet;

/*
 * Llamamos conjunto a cualquier colección de objetos de la misma clase sin ningún orden particular
 * Cada elemento sólo aparece una vez, a diferencia de una lista donde podia repetirse
 */
public class conjuntos {
    public static void main( String[] args ) {
    	
    	/*Implentaciones
    	 * HashSet: Usa tablas has para acelerar la busqueda, adicion y elminacion de elementos
    	 * LinkedHashSet: Es una version ordenada de hashSet que mantiene una lista doblemente
    	 * vinculada en todos los elementos
    	 * TreeSet: Usa un arbol binario para acelerar la busqueda, adición y elminación de
    	 * elemntos
    	 */
		
    	System.out.println( "Crear Lista" );
        Set<Integer> conjuntoEnteros = new HashSet<>();
        //var conjuntoEnteros = new HashSet<Integer>();
        
        System.out.println( "Añadir elemento" );
        conjuntoEnteros.add(4);
        conjuntoEnteros.add(5);
        conjuntoEnteros.add(7);
        conjuntoEnteros.add(4);//retorna false porque ya esta
        
        System.out.println(conjuntoEnteros);
        
        System.out.println( "tamaño: " + conjuntoEnteros.size());      
        
        System.out.println( "¿Esta en la lista el 7 y el 8?-> " 
        		+ conjuntoEnteros.contains(7) 
        		+ " "
        		+ conjuntoEnteros.contains(8));
        
        
        System.out.println( "eliminar objetos de una lista" );
        System.out.println( "lista antes de eliminar objeto: " + conjuntoEnteros );
        conjuntoEnteros.remove(7);
        System.out.println( "lista con elemnto con 1 eliminado" + conjuntoEnteros);
        
        System.out.println( "esta vacia? -> " + conjuntoEnteros.isEmpty ());
        System.out.println( "" );
        System.out.println( "Recorrer la lista" );
        for (Integer entero: conjuntoEnteros) {
        	System.out.println(entero);
        }

    }
}