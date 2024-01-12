package com;

public class Cajero {
	
	String direccion;
	Cuenta[] cuentas;
	int folio = 0;
	
	public Cajero() {
			
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

// COMPORTAMIENTO
     public void consultarsSaldo(String numCuenta ) {
    	 //
    	 if(this.buscar(numCuenta)[0]!=null) {
    		 //casteo:conversion automatica
    		 Cuenta c = (Cuenta) this.buscar(numCuenta)[0];
    		 System.out.println("Saldo disponible: "+c.getSaldoDisponible());

    	 }else {
    		 System.out.println("La cuenta no existe");
    	 }
     }
     
// RETIRAR
     public Object[] retirar(String numeroCuenta, double monto) {
    	
     Cuenta c = (Cuenta) this.buscar(numeroCuenta)[0];
     Ticket ticket = null;
     Object[] output = new objet
      
     if(c!=null) { //si la cuenta si existe
    	 
    	 //que me alcance
    	 //que no quede abajo del minimo
    	 //retirar
    	 
    	 if (c.getSaldoDisponible()<monto) {//si la cuenta existe
    		 int index = this.buscar(numeroCuenta)[1];
    		 
    		 System.out.println("Fondos insuficientes");
    		 //Si al quitarle al monto al saldo, es menor al minimo
    	 }else if (c.getSaldoDisponible() - monto)<c.getMin()) {
    		 System.out.println("El retiro dejaria por debajo del minimo de la cuenta");
    	 }else { //Retiro
    		 
    		 c.setSaldoDisponible(c.getSaldoDisponible()-monto);
    		 //Reintegro el objeto al array de cuentas
    		 this.cuentas[index] = c;
    		 
    		 ticket = new ticket(this.folio = folio1, this.direccion, "RETIRO", monto, new Date())
    		 
    	 }
    	 
    	 return null;
     }else { //si no...
    	 System.out.println("No existe la cuenta");
     }
     return null;
     }

//Metodo que busca la cuenta dentro del array
      public Cuenta buscar(String numCuenta) {
	  Cuenta cuenta = null;
	  
	  //Busca la cuenta
	  for (int i = 0; i < cuentas.length; i++) {
		  
		  if(cuentas[i].getNumCuenta().equals(numCuenta)) {
			  cuenta =cuentas[i];
			  break;
		  }
	   }
	  return cuenta; 
      }
      
      
}