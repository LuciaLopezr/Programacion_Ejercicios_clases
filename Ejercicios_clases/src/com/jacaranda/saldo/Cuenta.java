package com.jacaranda.saldo;

public class Cuenta {
	int saldo;
	int reintegro;
	int ingreso;
	int contadorIngreso=0; 
	int contadorReintegro=0;
	
	public Cuenta(int saldo, int reintegro, int ingreso) throws CuentaException {
		super();
		setSaldo(saldo);
		setReintegro(reintegro);
		setIngreso(ingreso);
	}
	
	public int getSaldo() {
		return this.saldo;
	}

//Si el saldo introducido es <0 lanza la excepcion, sino lo asigna
	public void setSaldo(int saldo) throws CuentaException {
		if (saldo < 0) {
			throw new CuentaException("Error");
		}else {
			}this.saldo = saldo;
		
	}

	public void setReintegro(int reintegro) {
			this.reintegro = reintegro;
			}
		

//He creado los get de contador de ingreso y contador de reintegro para que los devuelva en el principal 
	public int getContadorIngreso() {
		return contadorIngreso;
	}

	public int getContadorReintegro() {
		return contadorReintegro;
	}

	public void setIngreso(int ingreso) {
			this.ingreso = ingreso;
			}
		
	
//metodo para realizar el ingreso se encarga de comprobar si el ingreso < 0 salta la excepción, sino se asigna 
//como ingreso, por lo que suma el saldo + el ingreso introducido y cuenta las veces que se realiza un ingreso
//mediante el contador

	public  int realizarIngreso(int ingreso) throws CuentaException{
		if (ingreso < 0) {
			throw new CuentaException("Error");
		}else {
			this.ingreso = ingreso;
			}this.saldo += ingreso;
			this.contadorIngreso+=1;
		
		return this.saldo;
	}


//metodo para realizar el reintegro, se encarga de comprobar si el reintegro > saldo o el reintegro es menor que 0, 
//salta la excepción, sino se le asigna como reintegro, por lo que resta el saldo - el reintegro introducido y 
//cuenta las veces que se realiza un reintegro mediante el contador

	public  int realizarReintegro(int reintegro) throws CuentaException{
		if (reintegro > this.saldo ||reintegro <0) {
			throw new CuentaException("Error");
		}else {
			this.reintegro = reintegro;
			}this.saldo -= reintegro;
		this.contadorReintegro+=1;

		return  this.saldo;
	}

	
}
