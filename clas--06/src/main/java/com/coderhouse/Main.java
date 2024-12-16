package com.coderhouse;

import com.coderhouse.entidades.Ave;
import com.coderhouse.entidades.Perro;

public class Main {

	public static void main(String[] args) {
		Perro miPerro = new Perro();
		
		miPerro.setNombre("Firulay");
		
		miPerro.comer();
		miPerro.emitirSonido();
		miPerro.estaVivo();
		System.out.println("El perro "+ miPerro.getNombre()+"esta vivo?: "+miPerro.estaVivo());
		
		Ave miAve = new Ave();
		
		miAve.comer();
		miAve.emitirSonido();
		miAve.estaVivo();
	
	}

}
