package com.jacaranda.saldo;

import java.util.Scanner;

public class Principal {
	public static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		int saldo;
		int opc;
		int reintegro;
		int ingreso;
		char salir;
		Cuenta cu1=null;
		
		//pide el saldo inicial, si es <0 lanza la excepcion y lo vuelve a pedir hasta que se introduzca un numero positivo
		
		do {
			System.out.println("Introduce el saldo inicial: ");
			saldo=Integer.parseInt(teclado.nextLine());
			try {
			cu1= new Cuenta(saldo, 0, 0);
				} catch (CuentaException e) {
					e.printStackTrace();
				}
			
		}while (saldo <0);
		
		// Se repite el menu mientras que la opcion introducida sea <5
		do {

		System.out.println("¿Que quieres realizar?: \n" 
				+ "1. Hacer un reintegro. \n"
				+ "2. Hacer un ingreso. \n"
				+ "3. Consultar el saldo y el numero de reintegros e ingresos realizados.\n"
				+ "4. Finalizar las operaciones. \n");
		opc=Integer.parseInt(teclado.nextLine());
		
		
		switch(opc){
			
		case 1:
			System.out.println("Introduce la cantidad a retirar: ");
			reintegro=Integer.parseInt(teclado.nextLine());
			//si la cantidad a retirar es la correcta realiza el metodo realizarReintegro sino lanza la excepcion
			try {
				cu1.realizarReintegro(reintegro);
			} catch (CuentaException e) {
				e.printStackTrace();
			}
			break;
			
		case 2:
			System.out.println("Introduce la cantidad a ingresar: ");
			ingreso=Integer.parseInt(teclado.nextLine());
			//si la cantidad a ingresar es la correcta realiza el metodo realizarIngreso sino lanza la excepcion 
			try {
				cu1.realizarIngreso(ingreso);
			} catch (CuentaException e) {
				e.printStackTrace();
			}
			break;
			
		case 3:
			System.out.println("Su saldo es "+ cu1.getSaldo());
			System.out.println("Numero de reintegros "+cu1.getContadorReintegro());
			System.out.println("Numero de ingresos "+ cu1.getContadorIngreso());
			break;
			
		case 4:
			System.out.println("Su saldo final es "+ cu1.getSaldo());
			System.out.println("¿Desea salir? S / N "); 
			salir= teclado.nextLine().charAt(0);
			// si es S, opc= 5 para que no se repita y se cierre el programa, sino opc=4 y el programa continuara
			if (salir == 'S') {
				opc=5;
			}else {
				opc=4;
			}
			
		}
		
	}while (opc<5);
		
	}
	

}
