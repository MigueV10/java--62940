package com.coderhouse;

import com.coderhouse.objetos.Perro;

public class Clase04 {

	public static void main(String[] args) {
		

		Perro primerPerro = new Perro();
		
		primerPerro.setNombre("Firulay");
		primerPerro.setColor("Gris");
		primerPerro.setRaza("Caniche");
		primerPerro.setTamanio("Chico");
		primerPerro.setEdad(3);
		
		System.out.println(primerPerro.getNombre());
		System.out.println(primerPerro.getRaza());
		System.out.println(primerPerro.getColor());
		System.out.println(primerPerro.getTamanio());
		System.out.println(primerPerro.getEdad());
		
	}

	
	
}