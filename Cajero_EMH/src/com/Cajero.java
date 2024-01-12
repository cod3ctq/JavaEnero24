package com;

import java.util.Date;
import java.util.Iterator;

public class Cajero {
	
	String direccion;
	Cuenta[] cuentas;
	int folio = 0;
	
	public Cajero () {
		
	}

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
		
		if(this.buscar(numCuenta)[0]!=null) {
			//Casteo: conversion automatica 
			Cuenta c = (Cuenta) this.buscar(numCuenta)[0];	
			
			System.out.println("Saldo disponible: "+c.getSaldoDisponible());
		}
		else {
			System.out.println("La cuenta no existe");
		}
		
	}
	
	//RetirarSaldo
	public Object[] retirar(String numeroCuenta, double monto) {
		
		Cuenta c = (Cuenta) this.buscar(numeroCuenta)[0];
		Ticket ticket = null;
		Object[] output = new Object[2];
		
		if (c != null) { //Si la cuenta existe
			int index = (int) this.buscar(numeroCuenta)[1];
			//Validaciones minimo, minimo de saldo y dinero a retirar
			if(c.getSaldoDisponible()<monto) {
				System.out.println("No mames pa, no traes lana");
			}
			else if ((c.getSaldoDisponible() - monto)<c.getMin()) {
				System.out.println("El retiro dejaria por deeebajo del minimo a la cuenta");
			}
			else {
				System.out.println("Ese es mi niño, toma tu dinero");
				c.setSaldoDisponible(c.getSaldoDisponible()-monto);
				
				//Reintegro el objeto al array de cuentas
				this.cuentas[index] = c;
				
				
				ticket = new Ticket(this.folio = folio +1, this.direccion, "RETIRO", monto, new Date());
				
				//Empaquetar los resultados de salida 
				output[0] = ticket;
				output[1] = monto;
				
			}
			
		}
		else {
			System.out.println("No existe la cuenta");
		}
		
		return output;
	}
	
	
	//Merodo que busca la cuenta dentro del array
	public Object[] buscar(String numCuenta) {
		
		Object[] datos = new Object[2];
		Cuenta cuenta = null;
		
		//Busca la cuenta
		for (int i = 0; i < cuentas.length; i++) {
			
			if (cuentas[i].getNumCuenta().equals(numCuenta)){
				cuenta = cuentas [i];
				datos[0] = cuenta;
				datos[1] = i;
				break;
			}
		}
		
		
		return datos;
	}
	
	
	public Ticket depositar(String numCuenta, double monto) {
		
		Cuenta c = (Cuenta) this.buscar(numCuenta)[0];
		Ticket ticket = null;
		
		if (c != null) { //Si la cuenta existe
			System.out.println("La cuenta existe en la validacion de depositar");
			System.out.println(c);
			
			int index = (int) this.buscar(numCuenta)[1];
			if((c.getSaldoDisponible() + monto) > c.getMax()) {
				
				System.out.println("Que crees apa, lo que ingresaste es mayor a tu saldo maximo permitido");
				System.out.println("Saldo disponible "+c.getSaldoDisponible());
				System.out.println("Saldo maximo: "+ c.getMax());
				System.out.println("Su saldo con el monto que esta ingresando es de "+(c.getSaldoDisponible() + monto)+" y supera el monto maximo");
			}
			else {
				c.setSaldoDisponible(c.getSaldoDisponible()+monto);
				System.out.println("Si se pudo padre. Tu nuevo saldo es de: $"+c.getSaldoDisponible());
				ticket = new Ticket(this.folio = folio +1, this.direccion, "DEPOSITO", monto, new Date());
				//System.out.println(ticket);
			}
			
			
		}
		else {
			System.out.println("No existe la cuenta");
		}

		
		return ticket;
	}
	

}
