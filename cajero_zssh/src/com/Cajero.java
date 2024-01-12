package com;

import java.util.Date;
import java.util.Iterator;

public class Cajero {
	String direccion;
	Cuenta[] cuentas;
	int folio=0;
	public Cajero () {
		
	}
	
	public Cajero(String direccion, Cuenta[] cuentas) {
		super();
		this.direccion = direccion;
		this.cuentas = cuentas;
	}

	public Cajero(String direccion) {
		super();
		this.direccion = direccion;
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
		
		if(this.buscar(numCuenta)[0]!=null) {
			//System.out.println("Saldo disponble :" +(Cuenta)this.buscar(numCuenta)[0]);
			//Casteo: conversion automatica
			Cuenta c = (Cuenta) this.buscar(numCuenta)[0];
			System.out.println("Saldo disponible: "+c.getSaldoDisponible());
		}else {
			System.out.println("La cuenta no existe");
		}
	}
	
	//Retiro
	public Object[] retirar(String numCuenta,double monto) {
		
		
		Cuenta c = (Cuenta) this.buscar(numCuenta)[0];
		Ticket ticket = null;
		Object[] output = new Object[2];
		
		if(c!=null) {//Si la cuenta existe
			int index = (int) this.buscar(numCuenta)[1];
			//que me alcance
			//que noquede abajo del minimo
			//retirar
			
			if(c.getSaldoDisponible()<monto) {
				System.out.println("Fondos insuficientes");
				//Si al quitarle el monto al saldo, es menor al minimo
			}else if((c.getSaldoDisponible()- monto)<c.getMin()) { 
				System.out.println("El retido dejaria por debajo del minimo a la cuenta");
			}else  {//retiro
				c.setSaldoDisponible(c.getSaldoDisponible()-monto);
				//Reintegro del objeto al array de cuentas
				this.cuentas[index] = c;
				
				ticket = new Ticket(this.folio = folio+1, this.direccion, "Retiro", monto, new Date());
				//Empaqueto los resultados de salida
				output[0]= ticket;
				output[1]= monto;
			}
			
		}else {//si no
			System.out.println("No existe la cuenta");
		}
		
		return output;
	}
	
	
	
	
	
	
	
	//Metodo que busca la cuenta dentro del array
	//Ouput: cuenta index
	//Encapsular el metodo buscar
	public Object[] buscar(String numCuenta) {
		Cuenta cuenta = null;
		Object[] datos= new Object[2];
		
		
		//Buscar la cuenta
		for (int i = 0; i<cuentas.length; i++) {
			if(cuentas[i].getNumCuenta().equals(numCuenta)) {
				cuenta=cuentas[i];
				datos[0] = cuenta;
				datos[1] = i;
				break;
			}
		}
		
		return datos;
	}
	
	//DEPOSITAR
	public Ticket depositar(String numCuenta,double monto) {
		//Regresa un ticket
		//si no, nada, solo imprime un mensaje 
		Cuenta c = (Cuenta) this.buscar(numCuenta)[0];
		Ticket ticket = null;
		
		double nuevoSaldo;
		
		if(c!=null) {//Si la cuenta existe
			int index = (int) this.buscar(numCuenta)[1];
			
			//no pasar del maximo
			if((c.getSaldoDisponible()+monto)>c.getMax()) {
				System.out.println("El deposito supera el maximo de la cuenta");
				//Si al quitarle el monto al saldo, es menor al minimo
			//}else if((c.getSaldoDisponible()- monto)<c.getMin()) { 
				//System.out.println("El retido dejaria por debajo del minimo a la cuenta");
			}else  {//deposito
				c.setSaldoDisponible(c.getSaldoDisponible()+monto);
				nuevoSaldo= c.getSaldoDisponible();
				//Reintegro del objeto al array de cuentas
				this.cuentas[index] = c;
				
				ticket = new Ticket(this.folio = folio+1, this.direccion, "Deposito", monto, new Date());
				//Empaqueto los resultados de salida
				
				System.out.println("Nuevo saldo: "+nuevoSaldo);
				
			}
			
		}else {//si no
			System.out.println("No existe la cuenta");
		}
		
		return ticket;
	}
	
	//transferir, sacar dinero y meter en otro
	//4 validacioes
	//no dejar minimo
	//2 de depositar
	//2 de retirar
	
	
	
}
