package com;

import java.util.Date;

public class Ticket {
	
	int foliooperacion;
	String direccion;
	String tipoOperacion;
	double monto;
	Date fecha;
	
	public Ticket () {
		
	}

	public Ticket(int foliooperacion, String direccion, String tipoOperacion, double monto, Date fecha) {
		super();
		this.foliooperacion = foliooperacion;
		this.direccion = direccion;
		this.tipoOperacion = tipoOperacion;
		this.monto = monto;
		this.fecha = fecha;
	}

	public int getFoliooperacion() {
		return foliooperacion;
	}

	public void setFoliooperacion(int foliooperacion) {
		this.foliooperacion = foliooperacion;
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
		return "Ticket [foliooperacion=" + foliooperacion + ", direccion=" + direccion + ", tipoOperacion="
				+ tipoOperacion + ", monto=" + monto + ", fecha=" + fecha + "]";
	}

	
	
	
}
