package com;

import java.util.Date;

public class Cajero {

	String direccion;
	Cuenta[] cuentas;
	 int folio;
	private String numCuenta; 



	public Cajero(String direccion) {
		super();
		this.direccion = direccion;
	
	}

	
	
	public Cajero(String direccion, Cuenta[] cuentas) {
		super();
		this.direccion = direccion;
		this.cuentas = cuentas;
	}



	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cajero [direccion=" + direccion + "]";
	}
	
	
	//COMPORTAMIENTO
	public void consultarSaldo(String numCuenta) {
		//     [cuenta,12]
		if(this.buscar(numCuenta)[0]!=null) {
			//Casteo: conversion automatica
		    Cuenta c =(Cuenta) this.buscar(numCuenta)[0];
			
		    System.out.println("Saldo disponible: "+c.getSaldoDisponible());
		}else {
			System.out.println("La cuenta no existe");
		}
	}
	
	//Retirar
	public Object[]retirar(String numeroCuenta, double monto){
		 Cuenta c =(Cuenta) this.buscar(numeroCuenta)[0];
		Ticket ticket = null;
		Object[] output = new Object[2];
		 if(c!=null) {//Si la cuenta existe
			int index = (int) this.buscar(numeroCuenta)[1];
			//que me alcance
			//que no quede abajo del minimo
			//retirar
			if(c.getSaldoDisponible()<monto) {
				System.out.println("Fondos Insuficientes");
			//Si al quitarle el monto al salfo, es menor al minimo
			}else if((c.getSaldoDisponible() - monto)<c.getMin()) {
			System.out.println("El retiro dejaria por debajo del minimo a la cuetna");
			}else { //Retiro
				                         //1600 - 2500 = 13500
				c.setSaldoDisponible(c.getSaldoDisponible()-monto);
				//Reintegro el objeto al array de cuentas
				this.cuentas[index] = c;
				ticket = new Ticket(this.folio = folio+1, this.direccion, "RETIRO", monto, new Date());
				//Empaquet los resultados de salida
				output[0] = ticket;
				output[1] = monto;
			}
		}else { //si no...
			System.out.println("No existe la cuenta");
		}
		 return output;
	}
	
	
	
	
	//Metodo que busca la cuenta dentro del array
	//Output: cuenta, index
	public Object[] buscar(String numCuenta) {
		
		Object[] datos = new Object[2];
		Cuenta cuenta = null;
		
		//Buscar la cuenta
		for (int i = 0; i < this.cuentas.length; i++) {
			
			if(cuentas[i].getNumCuenta().equals(numCuenta)) {
				cuenta =cuentas[i];
				datos[0] =cuenta;
				datos[1] = i;
				break;
			}
		}
	return datos;	
	}
//DEPOSITAR
	
	public Ticket depositar(String numCuenta, double monto) {

Cuenta c = (Cuenta)this.buscar(numCuenta)[0];
Ticket ticket = null;
Object[] output = new Object[2];
if(c!=null) {
	int index = (int)this.buscar(numCuenta)[1];
	if(c.getSaldoDisponible()<monto) {
		System.out.println("Monto Minimo a depositar");
	}else if((c.getSaldoDisponible() - monto)<c.getMin()) {
		System.out.println("Saldo Maximo a depositar");
	}else {
		c.setSaldoDisponible(c.getSaldoDisponible()-monto);
		this.cuentas[index] = c;
		ticket = new Ticket(this.folio = folio+1, this.direccion, "RETIRO", monto, new Date());
		output[0] = ticket;
		output[1] = monto;
	}
}else { //si no...
	System.out.println("No existe la cuenta");
}
 return ticket;
		
		
			
	}
}
