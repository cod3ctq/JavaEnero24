package com;

import java.util.Date;

public class Cajero {
	
String direccion;
Cuenta [] cuentas;
int folio = 0;

public Cajero() {
	
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
public void consultarSaldo(String numCuenta){
	//[cuenta,12]
	if(this.buscar(numCuenta)[0]!=null) {
		Cuenta c = (Cuenta) this.buscar(numCuenta)[0];
		System.out.println("saldo disponible: "+ c.getSaldodisponible());
	}
	else {
		System.err.println("La cuenta no existe");
	}
}
//Retirar
public Object [] retirar (String numCuenta, double monto) {
	Ticket ticket = null;
	Object [] output = new Object[2];
	
	Cuenta c = (Cuenta) this.buscar(numCuenta)[0];
	
	if (c!=null) { //si la cuenta existe
		int index = (int)this.buscar(numCuenta)[1];
		//que alcance
		//que no quede bajo del minimo
		//retirar
		if(c.getSaldodisponible()<monto) {
			System.out.println("A caso crees que somos ricos!?");
			
			//Si al quitarle el monto al saldo es menor al minimo
		}else if((c.getSaldodisponible() -monto)<c.getMin()) {
			System.out.println("El retiro dejaria por debajo del minimo la cuenta");
		}else { //REtiro
									//16000 - 2500 = 13500
			c.setSaldodisponible(c.getSaldodisponible()-monto);
			//Reintegrar el obeto al array de cuentas
			this.cuentas[index] = c;
			ticket = new Ticket(this.folio = folio +1, this.direccion, "Retiro", monto, new Date());
			output [0]= ticket;
			output [1]= monto;
		}		
	}else {//si no existe
		System.out.println("No Existe la cuenta");
	}
	
	return output;
  }




//busca la cuenta dentro del array
//output: cuenta, index
public Object [] buscar (String numcuenta) {
	
	Object[] datos = new Object [2];
	Cuenta cuenta = null;
	
//busca la cuenta

	for (int i = 0; i < cuentas.length; i++) {
		if (cuentas[i].getNumcuenta().equals(numcuenta)) {
			cuenta = cuentas[i];
			datos[0]= cuenta;
			datos[1]= i;
			break;
		}
	}
	return datos;
}
//Depositar---------

 	 public Ticket depositar(String numCuenta, double monto) {
 		Cuenta c = (Cuenta) this.buscar(numCuenta)[0];
 		Ticket ticket = null;
 		
 		if (c!=null) { //si la cuenta existe
 			int index = (int)this.buscar(numCuenta)[1];
 			//que alcance
 			//que no quede sobre del Max
 			//depositar
 			if(monto>c.getMax()) {
 				System.out.println("El deposito sobrepasa el Max");
 				
 				//Si al quitarle el monto al saldo es mayor al minimo
 			}else if(monto+(c.getSaldodisponible())>c.getMax()) {
 				System.out.println("El deposito dejaria por sobre del Max la cuenta");
 			}else { //deposito
 													//16000 - 2500 = 13500
 				c.setSaldodisponible(c.getSaldodisponible()+monto);
 				//Reintegrar el obeto al array de cuentas
 				this.cuentas[index] = c;
 				ticket = new Ticket(this.folio = folio +1, this.direccion, "Deposito", monto, new Date());
// 				output [0]= ticket;
// 				output [1]= monto;
 			}		
 		}else {//si no existe
 			System.out.println("No Existe la cuenta");
 		}
 		
 		return ticket;
 	  
 		
 	 }
}
