package com;

public class Humano {
	String nombre;
	int edad;
	boolean alto;
	boolean bronceado;
	boolean guapo;
	
 public Humano()
 {
	 
 }
	
	public Humano(String nombre, int edad, boolean alto, boolean bronceado, boolean guapo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.alto = alto;
		this.bronceado = bronceado;
		this.guapo = guapo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isAlto() {
		return alto;
	}
	public void setAlto(boolean alto) {
		this.alto = alto;
	}
	public boolean isBronceado() {
		return bronceado;
	}
	public void setBronceado(boolean bronceado) {
		this.bronceado = bronceado;
	}
	public boolean isGuapo() {
		return guapo;
	}
	public void setGuapo(boolean guapo) {
		this.guapo = guapo;
	}
	@Override
	public String toString() {
		return "Humano [nombre=" + nombre + ", edad=" + edad + ", alto=" + alto + ", bronceado=" + bronceado
				+ ", guapo=" + guapo + "]";
	}
	
	
	
	
	
	
}
