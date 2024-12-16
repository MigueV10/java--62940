package com.coderhouse;

public class Clase02 {

	public static void main(String[] args) {
		// EVALUE DOS NUMEROS CUALQUIERAS
/*
		int numeroA=1;
		int numeroB=2;
		
		if(numeroA > numeroB) {//CONDICION puede ser true o false si esto se ejecuta 
			System.out.println("el numero "+numeroA+"es mayor que "+numeroB);
		}else {
			System.out.println("el numero"+numeroA+"es menor que "+numeroB);   
		}
		System.out.println("SI LLEGAMOS HASTA ACA, ES POR QUE SE EJCUTO EL IF");
	//CALCULADORA 
	float numeroA = 1.5f;
	float numeroB =5.0f;
	
	float resultado = numeroA/numeroB;
	
	if(numeroB != 0) {
		System.out.println("El resultado es: "+resultado);
		}else {
			System.out.println("Error, no se puede dividir por cero!");
		}
	
		
		int ingreseUnNumero=0;
		
		if(ingreseUnNumero > 0) {
			System.out.println("EL numero ingresado es positivo");
		}else if (ingreseUnNumero < 0){
			System.out.println("EL numero ingresado es negativo");
		}else if(ingreseUnNumero == 0){
			System.out.println("ELnumero ingresado es CERO");
		}else {
			System.err.println("EL DATO INGRESADO NO ES UN NUMERO");
		}
		int diaDeLaSemana = -1;
		
		if(diaDeLaSemana == 1) {
			System.out.println("El dia Actual es Lunes");
		}else if(diaDeLaSemana==2) {
			System.out.println("El dia Actual es Martes ");
		}else if(diaDeLaSemana==3) {
			System.out.println("El dia Actual es Miercoles");
		}else if(diaDeLaSemana==4) {
			System.out.println("El dia Actual es Jueves");
		}else if(diaDeLaSemana==5) {
			System.out.println("El dia Actual es Viernes");
		}else if(diaDeLaSemana==6) {
			System.out.println("El dia Actual es Sabado");
		}else {
			System.out.println("EL dia ingresado es incorrecto.!");
		}
			
		
		int ingresaSuEdad = 18;
		if(ingresaSuEdad >=18 && ingresaSuEdad <=100) {
			System.out.println("usted puede ingresar!!");
		}else if (ingresaSuEdad > 0 && ingresaSuEdad <18){
			System.err.println("UD. es menor de edad y nno puede entrar");
		}else {
			System.err.println("Ud. Ingreso una edad incorrecta. O es muy viejo para tomar!");
		}

		
		int diaDeLaSemana=12;
		String nomDia=null;
		
		switch(diaDeLaSemana) {
		case 1:
			nomDia="Lunes";
			break;
		case 2:
			nomDia="Martes";
			break;
		case 3:
			nomDia="Miercoles";
			break;
		case 4:
			nomDia="Jueves";
			break;
		case 5:
			nomDia="Viernes";
			break;
		case 6:
			nomDia="Sabado";
			break;
		case 7:
			nomDia="Domingo";
			break;
			default:
				nomDia="Dia incorrecto";
				break;
		}
		System.out.println("El dia de la semana correspondiente al numero "
		+ diaDeLaSemana + " es el " + nomDia);
		
		
		String dia = "martes";
		switch(dia.toLowerCase()) {
		case "Lunes":
			System.out.println("Hoy es " + dia);
			break;
		case "martes":
			System.out.println("Hoy es " + dia);
			break;
		case "Miercoles":
			System.out.println("Hoy es " + dia);
			break;
		case "Jueves":
			System.out.println("Hoy es " + dia);
			break;
		case "Viernes":
			System.out.println("Hoy es " + dia);
			break;
		case "Sabado":
			System.out.println("Hoy es " + dia);
			break;
		case "domingo":
			System.out.println("Hoy es " + dia);
			break;
			default:
				System.out.println("El dia ingresado fue: "+ dia +
						" y es incorrecto");
						
		
		//OPERADOR TERNARIO
		
		int numeroA =10;
		int numeroB = 2;
		
		boolean condicion = numeroA > numeroB; //esto puede ser true o false
		
		String resultado = condicion 
		? "el numero "+numeroA+"es mayor que "+numeroB 
		: "el numero "+numeroA+"es mayor que "+numeroB;
		
		System.out.println(resultado);
		*/
		
		//double random = 0.0d;
		int random = 0;
		//random=Math.random();
		//System.out.println(random);
		
		int minimo = 1;
		int maximo = 100;// de 1 a 100
		
		int rango = maximo-minimo + 1;
		
		random = ( int ) (Math.random() * rango) + minimo;
		System.out.println(random);
		
		
		
	}
}
