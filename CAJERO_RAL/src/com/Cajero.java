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
 	 
 	 
 //-----------Transferir
public Ticket transferir(String numCuenta1, String numCuenta2, double monto) {
	Cuenta c1 = (Cuenta) this.buscar(numCuenta1)[0];
	Cuenta c2 = (Cuenta) this.buscar(numCuenta2)[0];
	Ticket ticket = null;
	
	if (c1 != null) { //si la cuenta existe
		int index = (int)this.buscar(numCuenta1)[1];
		if (c2 != null) {
			int index2 = (int)this.buscar(numCuenta2)[1];	
		
			
			//que c1 
			//que c1 no quede por debajo del minimo
			//que c2 no quede sobre del Max
			//depositar
		if((c1.getSaldodisponible()-monto)<c1.getMin()) {
			System.out.println("La cuenta de Origen quedaria por debajo del minimo");
		}
		if((monto+c2.getSaldodisponible())>c2.getMax()) {
			System.out.println("El deposito sobrepasa el Maximo de la cuenta Destino");
		}
			//tranferencia	
			//Saldo menos el monto es mayor al minimo		Saldo mas el monto es menor al maximo
		if((c1.getSaldodisponible()-monto)>c1.getMin() && ((c2.getSaldodisponible())+monto)<c2.getMax()) {
			
			c1.setSaldodisponible(c1.getSaldodisponible()-monto);
			c2.setSaldodisponible(c2.getSaldodisponible()+monto);
			
			this.cuentas[index]=c1;
			this.cuentas[index2]=c2;
			ticket = new Ticket(this.folio = folio +1, this.direccion, "Transferencia", monto, new Date());
			
			}	
		   }
		else {//si no existe
			System.out.println("No Existe la cuenta "+ c2);
		}
	}
		else {//si no existe
			System.out.println("No Existe la cuenta "+ c1);
		}
	
		
		return ticket;
		
		
	
	
}
 	 
}
