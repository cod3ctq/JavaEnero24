package COM;

import java.util.Date;

public class cajero {
	
	String direccion;
	Cuenta[] cuentas;
	int folio =0;
	
	
	public cajero() {
		
		
	}

	public cajero(String direccion) {
		super();
		this.direccion = direccion;
	}
	
	

	public cajero(String direccion, Cuenta[] cuentas) {
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
		return "cajero [direccion=" + direccion + "]";
	}
	
	//COMPORTAMIENTO
	public  void consultarSaldo(String numCuenta) {
		//      [cuenta,12]
		if(this.buscar(numCuenta)[0]!=null) {
			
			Cuenta c = (Cuenta) this.buscar(numCuenta)[0];
			System.out.println("Saldo disponoble: "+c.getSaldoDisponible());
			
		}else {
			System.out.println("la cuenta no existe");
		}
		 
	}
    
	//Retirar
	public Object[] retirar(String numeroCuenta, double monto) {
		
		Cuenta c = (Cuenta) this.buscar(numeroCuenta)[0];
		Ticket ticket = null;
		Object[] output = new Object[2];
				
		if(c!=null) {//si la cuenta si existe 
			int index = (int) this.buscar(numeroCuenta)[1];
			//que me alcace
			//que no quede abajo del minimo 
			//retirar 			
			if(c.getSaldoDisponible()<monto) {
				System.out.println("fondos insuficientes");
				//si al quitarle el monto al saldo, es menor al mismo
			}else if ((c.getSaldoDisponible()-monto)<c.getMin()) {
				System.out.println("el retiro dejaria por debajo del minimo a la cuenta");
			}else {//Retiro
				                  //  1600 - 2500 = 13500
				c.setSaldoDisponible(c.getSaldoDisponible()-monto);
				//Reintegro el Objeto al array de cuentas 
				this.cuentas[index] = c;			
				ticket = new Ticket(this.folio = folio+1, this.direccion, "RETIRO", monto, new Date());
				//Empaqueto los resultados de salida 
				output[0] = ticket;
				output[1] = monto;						
			}		
		}else {//si no ...
			System.out.println("No existe la cuenta");
		}
		
		return output;	
	} 
	
	//metodo que busca la cuenta dentro del array
	public Object[] buscar(String numCuenta) {
		
		Object[] datos = new Object[2];
		Cuenta cuenta = null;
		
		//Buscar la cuenta 
		for (int i = 0; i < cuentas.length; i++) {			
			if(cuentas[i].getNumCuenta().equals(numCuenta)) {
				cuenta =cuentas[i];
				datos[0] = cuenta;
				datos [1]= i;		
				break;		
			}		
		}
     	return datos;
	}
	
	//Deposito
	public Object[]  depositar(String numeroCuenta, double monto) {
	
		Cuenta c = (Cuenta) this.buscar(numeroCuenta)[0];
		Ticket ticket = null;
		Object[] output =new Object[2];
				
		
		if(c!=null) {//si la cuenta si existe 
			int index = (int) this.buscar(numeroCuenta)[1];
			//que el deposito no sea mayor al maximo 
			//que el doposito mas el slado actual no sobre pase al maximo  
			//depositar 			
			if(c.getSaldoDisponible()>monto) {
				System.out.println("El deposito es mayor al maximo ");
				//sumarle al  monto al saldo, es mayor al maximo 
			}else if ((c.getSaldoDisponible()+monto)<c.getMax()) {
				System.out.println("el retiro dejaria por sobre del max a la cuenta");
			}else {//deposito
				                  //  1600 - 2500 = 13500
				c.setSaldoDisponible(c.getSaldoDisponible()+monto);
				//Reintegro el Objeto al array de cuentas 
				this.cuentas[index] = c;			
				ticket = new Ticket(this.folio = folio+1, this.direccion, "DEPOSITO", monto, new Date());
				//Empaqueto los resultados de salida 
				output[0] = ticket;					
		}		
		}else {//si no ...
			System.out.println("No existe la cuenta");
		}
		
		return output;	
		
			
		}	
	}
	


