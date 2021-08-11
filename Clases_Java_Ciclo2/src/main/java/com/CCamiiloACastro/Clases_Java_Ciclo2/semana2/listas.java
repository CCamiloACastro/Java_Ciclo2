package com.CCamiiloACastro.Clases_Java_Ciclo2.semana2;

import java.util.List;
import java.util.ArrayList;

/*
 * Llamamos lista a cualquier colección de datos ordenados por posición, como en un array
 */
public class listas {
    public static void main( String[] args ) {
    	
    	/*Implementaciones
    	 * ArrayList: Guarda una lista de elementos en un array de tamaño
    	 * dinamico
    	 * LinkedList: Permite inserción y borrado de elementos de la lista
    	 * Vector: Aumenta o reduce su tamaño de forma dinamica
    	 * Stack: Representa una pila de objetos de ultimo en entrar, primero
    	 * en salir (LIFO)
    	 */
    	
        System.out.println( "Crear Lista" );
        List<Integer> listaEnteros = new ArrayList<>();
        //var listaEnteros = new ArrayList<Integer>();
        
        System.out.println( "Añadir elemento" );
        listaEnteros.add(4);
        listaEnteros.add(5);
        listaEnteros.add(7);
        listaEnteros.add(2,6);//agrega 6 entre 5 y 7
        
        System.out.println(listaEnteros);
        
        System.out.println( "tamaño: " + listaEnteros.size());      
        
        System.out.println( "¿Esta en la lista el 7 y el 8?-> " 
        		+ listaEnteros.contains(7) 
        		+ " "
        		+ listaEnteros.contains(8));
        
        System.out.println( "Posicion de un objeto, 6, 10, 4: ->" 
        		+ listaEnteros.indexOf(6)
        		+ " "
        		+ listaEnteros.indexOf(10)
		        + " "
				+ listaEnteros.indexOf(4));
        
        var primero = listaEnteros.get(0);
        var ultimo = listaEnteros.get(listaEnteros.size() -1 );
        System.out.println( "obtener elementos de una lista (primero y ultimo) " 
        		+ primero
        		+ " "
        		+ ultimo);
        
        System.out.println( "eliminar objetos de una lista" );
        System.out.println( "lista antes de eliminar objeto: " + listaEnteros );
        listaEnteros.remove(1);
        System.out.println( "lista con elemnto con 1 eliminado" + listaEnteros);
        
        System.out.println( "esta vacia? -> " + listaEnteros.isEmpty ());
        System.out.println( "" );
        System.out.println( "Recorrer la lista" );

        System.out.println( "Bucle convencional" );
        for (int i=0; i < listaEnteros.size (); i++) {
        	System.out.println(listaEnteros.get (i));
        }
        
        System.out.println( "ForEach" );
        for (Integer entero: listaEnteros) {
        	System.out.println(entero);
        }
        
        System.out.println( "iterador" );
        var iterador = listaEnteros.iterator();
        while(iterador.hasNext()) {
        	//System.out.println(iterador.hasNext());
        	Integer entero = iterador.next();
        	//System.out.println(iterador.next());
        	System.out.println(entero);
        }
        
        System.out.println( "forEach" );
        listaEnteros.forEach((entero) -> { 
        	System.out.println(entero);
        	});
        listaEnteros.forEach(System.out::println);
        
        System.out.println( "Stream Foreach" );
        listaEnteros.stream().forEach((entero) -> { 
        	System.out.println(entero);
        });
        listaEnteros.stream().forEach(System.out::println);
        
        System.out.println( "Ahora la lista esta vacia: ");
        listaEnteros.clear();
        System.out.println( "lista vacia: " + listaEnteros);
        
    }
}
