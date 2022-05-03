package com.jacaranda.rectangulo;

import java.util.Scanner;

public class Main {
	public static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		int longitud;
		int ancho;
		
		//pedir valores 
		System.out.println("Introduce la longitud del rectangulo: ");
		longitud=Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduce el ancho del rectangulo: ");
		ancho=Integer.parseInt(teclado.nextLine());
		
		// si esta correcto lo crea para calcular el area y el perimetro sino salta la excepción
		try {
			Rectangulo re1= new Rectangulo(longitud, ancho);
			System.out.println("El area del rectangulo es "+re1.calcularArea(longitud,ancho));
			System.out.println("El perimetro del rectangulo es "+re1.calcularPerimetro(longitud,ancho));
			
		} catch (RectanguloException e) {
			e.printStackTrace();
		}
		
	}

	
	
	
	
} 
