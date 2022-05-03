package com.jacaranda.rectangulo;

public class Rectangulo {
	int longitud;
	int ancho;

	public Rectangulo(int longitud, int ancho) throws RectanguloException {
		super();
		setLongitud(longitud); //para que pase por la excepciones
		setAncho(ancho);
	}
		
//si la longitud es <0 o longitud es >20 salta la excepción, sino se asigna como longitud

	public void setLongitud(int longitud) throws RectanguloException { 
		if (longitud <0 || longitud >20) {
		throw new RectanguloException("Error");
	} else {
		this.longitud = longitud;
		}
	}

	
//si el ancho es <0 o el ancho es >20 salta la excepción, sino se asigna como ancho
	
	public void setAncho(int ancho) throws RectanguloException { 
		if(ancho <0 || ancho >20) {
		throw new RectanguloException("Error");
		} else {
			this.ancho = ancho;
		}
		
	}	
	
	
//metodo para que calcule el area 
	
	public int calcularArea(int longitud, int ancho){ 
		int area;
		area= longitud *ancho ;
		
		return area;
	}
	
//metodo para que calcule el perimetro 
			
	public int calcularPerimetro(int longitud, int ancho){ 
		int perimetro;
		perimetro= 2*(longitud*ancho) ;
		
		return perimetro;
	
	}

	
}
