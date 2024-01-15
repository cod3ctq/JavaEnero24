package com;

import java.util.Date;

public class Cajero {

	String direccion;
	Cuenta[] cuentas; // Simulacion de la base de datos
	int folio = 0;

	public Cajero() {
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

	// COMPORTAMIENTO

	// Consulta de saldo
	public void consultarSaldo(String numCuenta) {

//				[cuenta, 12]		
		if (this.buscar(numCuenta)[0] != null) { // Esto es para llamar al metodo buscar

			Cuenta c = (Cuenta) this.buscar(numCuenta)[0]; // se hizo un objeto manipulable
			// se hizo una cuenta c para acceder a los getters y setters
			// Casteo: conversion automatica
			System.out.println("Saldo disponible: " + c.getSaldoDisp());
			// Es un casteo, se vuelve de object a una forma especifica
			// Es un objeto de la clase cuenta
		} else {
			System.out.println("La cuenta no existe");
		}
	}

	// si el objeto no te devuelve nada, es void
	// si si, entonces es public "y el tipo de dato que quieras insertar"

	// ________________________Retirar________________________

	// para regresar 2 objetos o mas, se le pide al metodo que me regrese
	// un array de object
	public Object[] reitrar(String numCuenta, double monto) {
		// a este array (Object[]), le cabe cualquier tipo de dato
		Cuenta c = (Cuenta) this.buscar(numCuenta)[0];
		Ticket ticket = null;
		Object[] output = new Object[2];

		if (c != null) {// Si la cuenta existe

			int index = (int) this.buscar(numCuenta)[1];
			// que me alcance
			// que no quede abajo del minimo
			// Retirar si todo sale bien

			if (c.getSaldoDisp() < monto) {
				System.out.println("Fondos insuficientes");
				// Si al quitarle monto al saldo, es menor al minimo
			} else if ((c.getSaldoDisp() - monto) < c.getMin()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
			} else { // Retiro

				c.setSaldoDisp(c.getSaldoDisp() - monto);
				// Reintegro el objeto al array de cuentas
				this.cuentas[index] = c;

				ticket = new Ticket(this.folio = folio + 1, this.direccion, "RETIRO", monto, new Date());
				// Empaqueto los resultados de salida
				output[0] = ticket;
				output[1] = monto;
			}
		} else { // si no...
			System.out.println("No existe la cuenta");
		}
		return output;
	}

	// ________________________Transferir________________________

	public Object[] transferir(String numCuenta, String numCuentaDestino, double monto) {

		Cuenta c = (Cuenta) this.buscar(numCuenta)[0];
		Cuenta c2 = (Cuenta) this.buscar(numCuentaDestino)[0];
		Ticket ticket = null;
		Object[] output = new Object[2];

		if (c != null) {// si la cuenta existe
			int index = (int) this.buscar(numCuenta)[1];

			// Que exista la otra cuenta
			// Que alcance
			// que no deje debajo del limite
			// que no supere el limite de la otra cuenta
			// transferir si todo bien

			if (c2 != null) {// si la cuenta a mandar existe
				int index2 = (int) this.buscar(numCuentaDestino)[1];

				if (c.getSaldoDisp() < monto) {
					System.out.println("Supera el saldo que tiene disponible");

				} else if ((c.getSaldoDisp() - monto) < c.getMin()) {
					System.out.println("La transferencia dejaria por debajo del minimo a su cuenta");

				} else if ((c2.getSaldoDisp() + monto) > c2.getMax()) {
					System.out.println("Transferencia no exitosa, la cuenta destino excede su saldo maximo");

				} else {
					c.setSaldoDisp(c.getSaldoDisp() - monto);
					c2.setSaldoDisp(c2.getSaldoDisp() + monto);
					this.cuentas[index] = c;
					this.cuentas[index2] = c2;
					ticket = new Ticket(this.folio = folio + 1, this.direccion,
							"Transferencia a la cuenta: " + numCuentaDestino, monto, new Date());
					output[0] = ticket;
					output[1] = monto;
					System.out.println("Transferencia exitosa!");
				}
			} else {
				System.out.println("La cuenta destino no existe");
			}
		} else {
			System.out.println("La cuenta no existe");
		}
		return output;
	}

	// ________________________Depositar________________________

	public Ticket depositar(String numCuenta, double monto) {
		Cuenta c = (Cuenta) this.buscar(numCuenta)[0];
		Ticket ticket = null;

		if (c != null) {
			int index = (int) this.buscar(numCuenta)[1];
			// Que no se pase del maximo;
			// Ingresar si todo sale bien
			if ((c.getSaldoDisp() + monto) > c.getMax()) {
				System.out.println("Monto maximo de ingreso alcanzado");
			} else if (monto <= 0) {
				System.out.println("No puede ingresar cantidades negativas");
			} else {
				c.setSaldoDisp(c.getSaldoDisp() + monto);
				this.cuentas[index] = c;
				ticket = new Ticket(this.folio = folio + 1, this.direccion, "DEPOSITO", monto, new Date());

			}
		} else {
			System.out.println("La cuenta no existe");
		}
		return ticket;
	}

	public Object[] buscar(String numCuenta) {
		Object[] datos = new Object[2];
		Cuenta cuenta = null;
		// variable que solo existe aqui, se llama cuenta, y sirve para
		// guardar los datos si es que la cuenta existe.

		// Ahora buscaremos la cuenta:
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i].getNumcuenta().equals(numCuenta)) {
				cuenta = cuentas[i];
				datos[0] = cuenta;
				datos[1] = i;
				break;
			}
		}
		return datos;
	}

}
