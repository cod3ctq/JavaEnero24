package com;

import java.util.Date;

/**
 * 
 */
public class TicketTransferencia extends Ticket{

	String cuentaP;
	double montoTransferido;
	String cuentaS;
	
	
	public TicketTransferencia(int folioOperacion, String direccion, String tipoOperacion, double monto, Date fecha,
			String cuentaP, double montoTransferido, String cuentaS) {
		super(folioOperacion, direccion, tipoOperacion, monto, fecha);
		this.cuentaP = cuentaP;
		this.montoTransferido = montoTransferido;
		this.cuentaS = cuentaS;
	}


	public String getCuentaP() {
		return cuentaP;
	}


	public void setCuentaP(String cuentaP) {
		this.cuentaP = cuentaP;
	}


	public double getMontoTransferido() {
		return montoTransferido;
	}


	public void setMontoTransferido(double montoTransferido) {
		this.montoTransferido = montoTransferido;
	}


	public String getCuentaS() {
		return cuentaS;
	}


	public void setCuentaS(String cuentaS) {
		this.cuentaS = cuentaS;
	}


	@Override
	public String toString() {
		return "TicketTransferencia [cuentaP=" + cuentaP + ", montoTransferido=" + montoTransferido + ", cuentaS="
				+ cuentaS + ", folioOperacion=" + folioOperacion + ", direccion=" + direccion + ", tipoOperacion="
				+ tipoOperacion + ", monto=" + monto + ", fecha=" + fecha + "]";
	}
	
	
	
	
	
	
}
