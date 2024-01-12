package COM;

public class Principal {

	public static void main(String[] args) {
		 //crear cuentas 
		                    //          SD       MAX     MIN
		Cuenta c1 = new Cuenta ("001", 300.00, 1000.00, 100.00);
		Cuenta c2 = new Cuenta ("002", 750.00, 2000.00, 500.00);
		Cuenta c3 = new Cuenta ("003", 2000.00, 8000.00, 500.00);
		Cuenta c4 = new Cuenta ("004", 1500.00, 5000.00, 300.00);
		Cuenta c5 = new Cuenta ("005", 2500.00, 15000.00, 1000.00);
		
		//Crear el array
		Cuenta[] db = new Cuenta[5];
		//Crear las cuentas al array
		
		db[0] = c1;
		db[1] = c2;
		db[2] = c3;
		db[3] = c4;
		db[4] = c5;
	
		cajero cajero1 = new cajero("Av. Juarez 3240", db);
		
		//cajero1.consultarSaldo("008");
//		Object[] datos = cajero1.retirar("002", 100.00);
//		
//		System.out.println(datos[0]);
//		System.out.println(datos[1]);

		//deposito
		
		
		Object[] datos = cajero1.depositar("002", 100000.00);
		if(datos[0]!=null) {
			System.out.println(datos[0]);
		}
		
		//trans ferir
		
		
	}

}
