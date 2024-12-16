package com.coderhouse.arrays;

import java.util.Arrays;

public class ArraysClase03 {

	public static void main(String[] args) {
		int [] numerosEnteros = new int[6];
		
		numerosEnteros[0]=10;//estoy guardando en la posicion 0 el numero 10
		
		numerosEnteros[1]=5;
		numerosEnteros[2]=3;
		numerosEnteros[3]=12;
		numerosEnteros[4]=9;
		numerosEnteros[5]=13;
		//numerosEnteros[6]=34;
		
		System.out.println("El array numerosEnteros tiene"
				+ numerosEnteros.length + "Elementos!");
		
		
		//System.out.println("el elemnto con indice 0 es:" +numerosEnteros[0]);
		//System.out.println("el elemnto con indice 1 es:" +numerosEnteros[1]);
		//System.out.println("el elemnto con indice 2 es:" +numerosEnteros[2]);
		//System.out.println("el elemnto con indice 3 es:" +numerosEnteros[3]);
		//System.out.println("el elemnto con indice 4 es:" +numerosEnteros[4]);
		//System.out.println("el elemnto con indice 5 es:" +numerosEnteros[5]);
		
		System.out.println(Arrays.toString(numerosEnteros));
		
	}

}
