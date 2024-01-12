package com;


// POJO: Plain Old Java Object


// Now it has become an abstract class, so in terms of behavior it is abstract,
// because it contains AT LEAST 1 abstract method. 
// But is just as any other simple class.
// Its main purpose is to extend to other classes

//     abstract    (it was added bc I'm working abstract down there)
public abstract class Empleado {
	
	String nss, horario, rfc, numEmpleado;
	
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
	
	// Metodo Abstracto
	public abstract void trabajar(); // (metodo sin cuerpo, sin implementacion)
	
	// It cannot create objects from an abstract class, it can't be instantiated.
	
	
	
	
}