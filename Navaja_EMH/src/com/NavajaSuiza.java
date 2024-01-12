package com;

public class NavajaSuiza extends Navaja {
	
	
	public NavajaSuiza () {
		
	}
	
	Desarmador desarm;

	public NavajaSuiza(String tamaño, String material, boolean filo, Desarmador desarm) {
		super(tamaño, material, filo);
		this.desarm = desarm;
	}

	public Desarmador getDesarm() {
		return desarm;
	}

	public void setDesarm(Desarmador desarm) {
		this.desarm = desarm;
	}

	@Override
	public String toString() {
		return "NavajaSuiza [desarm=" + desarm + ", tamaño=" + tamaño + ", material=" + material + ", filo=" + filo
				+ "]";
	}
	
	
	
	

}
