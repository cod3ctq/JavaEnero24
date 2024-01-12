package com;

import java.util.Date;

public class Ticket {
	
	int folioOperacion;
	String direccion;
	String tipoOperacion;
	double monto;
	Date fecha;
	
	public Ticket() {
		
		
	}

	public Ticket(int folioOperacion, String direccion, String tipoOperacion, double monto, Date fecha) {
		super();
		this.folioOperacion = folioOperacion;
		this.direccion = direccion;
		this.tipoOperacion = tipoOperacion;
		this.monto = monto;
		this.fecha = fecha;
		
		
	}

	public int getFolioOperacion() {
		return folioOperacion;
	}

	public void setFolioOperacion(int folioOperacion) {
		this.folioOperacion = folioOperacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Ticket [folioOperacion=" + folioOperacion + ", direccion=" + direccion + ", tipoOperacion="
				+ tipoOperacion + ", monto=" + monto + ", fecha=" + fecha + "]";
	}

	
}
