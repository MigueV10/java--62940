package com.coderhouse.entidades;

import com.coderhouse.interfaz.SerVivoInterfaz;

public class Ave implements SerVivoInterfaz {
	
	private String nombre;

	@Override
	public void emitirSonido() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverse() {
		System.out.println();
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
