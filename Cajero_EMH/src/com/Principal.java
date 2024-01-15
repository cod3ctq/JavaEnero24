package com;

public class Principal {
	
	public static void main(String[] args) {
												//MAX		MIN
		Cuenta c1 = new Cuenta("001", 4500.00, 10000.00, 100.00);
		Cuenta c2 = new Cuenta("002", 750.00, 5000.00, 500.00);
		Cuenta c3 = new Cuenta("003", 2000.00, 8000.00, 500.00);
		Cuenta c4 = new Cuenta("004", 1500.00, 5000.00, 300.00);
		Cuenta c5 = new Cuenta("005", 2500.00, 15000.00, 1000.00);
		
		Cuenta[] db = new Cuenta[5];
		
		db[0] = c1;
		db[1] = c2;
		db[2] = c3;
		db[3] = c4;
		db[4] = c5;
		
		Cajero cajero1 = new Cajero("AV. Juarez 3240", db);
		
		System.out.println("RESULTADO EN BASE ANTES DE OPERACIONES *****************");
		cajero1.consultarSaldo("001");
		cajero1.consultarSaldo("002");
//		Object[] datos = cajero1.retirar("002", 100.00);
//		
//		System.out.println(datos[0]);
//		System.out.println(datos[1]); 
//		
//		
		
		
		
//		cajero1.depositar("001", 1000);
		
		
		
//		Ticket ticket = cajero1.depositar("001", 1000);
//		System.out.println(ticket);
//		cajero1.consultarSaldo("001");
		
		
		
		TicketTransferencia ticketTransferencia = cajero1.transferir("001","002",4000.0);
		System.out.println(ticketTransferencia);
		//System.out.println("Se realiza correctamente ");
		
		
		System.out.println("RESULTADO EN BASE DESPUES DE OPERACIONES *****************");
		cajero1.consultarSaldo("001");
		cajero1.consultarSaldo("002");

		
	}

}
