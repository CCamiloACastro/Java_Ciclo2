package com.CCamiiloACastro.Clases_Java_Ciclo2.semana2;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 * La cola (Queue) se utiliza para insertar elemntos al final de la cola y los eliminan desde el
 * el principio de la cola
 * El Deque representa una cola de dos extreos, es decir, una cola en la que puede agregar y 
 * eliminar elementos de ambos extremos
 */
public class colasqueue {
    public static void main( String[] args ) {
    	
    	/*Implentaciones
    	 * PriorityQueue: Implementación del algoritmo de cola
    	 * LinkedList: Permite inserción y borrado de elemntos la lsta, implmenta la interface Deque
    	 * ArrayDeque: Proporiciona una forma de aplicar array de tamaño dinámico, además de la 
    	 * implementación de la interfaz Deque
    	 * 
    	 */
		
    	System.out.println( "Crear Lista" );
    	Queue<Integer> colaEnteros = new PriorityQueue<>();
        //var colaEnteros = new LinkedList<Integer>();
        
        System.out.println( "Añadir elemento" );
        colaEnteros.add(4);
        colaEnteros.add(5);
        colaEnteros.add(7);
        colaEnteros.add(6);
        
        System.out.println(colaEnteros);
        
        System.out.println( "tamaño: " + colaEnteros.size());      
        
        System.out.println(colaEnteros);
        System.out.println( "Obtener elemntos de una cola" + colaEnteros.poll());
        System.out.println(colaEnteros);
        System.out.println( "Obtener elemntos de una cola" + colaEnteros.remove());
        System.out.println(colaEnteros);
        
        System.out.println("Obtener el primer elemento de la cola" 
        		+ colaEnteros.peek()
        		+ " "
        		+ colaEnteros.element());
        
        System.out.println( "¿Esta en la lista el 7 y el 8?-> " 
        		+ colaEnteros.contains(7) 
        		+ " "
        		+ colaEnteros.contains(8));
        
        
        System.out.println( "eliminar objetos de una lista" );
        System.out.println( "lista antes de eliminar objeto: " + colaEnteros );
        colaEnteros.remove(7);
        System.out.println( "lista con elemnto con 1 eliminado" + colaEnteros);
        
        System.out.println( "esta vacia? -> " + colaEnteros.isEmpty ());
        System.out.println( "" );
        System.out.println( "Recorrer la lista" );
        for (Integer entero: colaEnteros) {
        	System.out.println(entero);
        }

    }
}