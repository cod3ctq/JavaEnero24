package com;

//POJO: Plain Old Java Object

//Clasel del tipo abstracta
public abstract class Empleado {
	
	String nss;
	String horario;
	String rfc;
	String numEmpleado;
	
	
	public Empleado() {
		
	}


	public Empleado(String nss, String horario, String rfc, String numEmpleado) {
		super();
		this.nss = nss;
		this.horario = horario;
		this.rfc = rfc;
		this.numEmpleado = numEmpleado;
	}


	public String getNss() {
		return nss;
	}


	public void setNss(String nss) {
		this.nss = nss;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	public String getRfc() {
		return rfc;
	}


	public void setRfc(String rfc) {
		this.rfc = rfc;
	}


	public String getNumEmpleado() {
		return numEmpleado;
	}


	public void setNumEmpleado(String numEmpleado) {
		this.numEmpleado = numEmpleado;
	}


	@Override
	public String toString() {
		return "Empleado [nss=" + nss + ", horario=" + horario + ", rfc=" + rfc + ", numEmpleado=" + numEmpleado + "]";
	}
	
	//Metodo abstracto
	public abstract void trabajar();

}
