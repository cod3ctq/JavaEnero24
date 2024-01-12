package com;

public class Desarmador_ral {

	boolean desarmadorplano;
	boolean desarmadorcruz;
	

	public Desarmador_ral(boolean desarmadorplano, boolean desarmadorcruz) {
		super();
		this.desarmadorplano = desarmadorplano;
		this.desarmadorcruz = desarmadorcruz;
	}


	public boolean isDesarmadorplano() {
		return desarmadorplano;
	}


	public void setDesarmadorplano(boolean desarmadorplano) {
		this.desarmadorplano = desarmadorplano;
	}


	public boolean isDesarmadorcruz() {
		return desarmadorcruz;
	}


	public void setDesarmadorcruz(boolean desarmadorcruz) {
		this.desarmadorcruz = desarmadorcruz;
	}


	@Override
	public String toString() {
		return "Desarmador_ral [desarmadorplano=" + desarmadorplano + ", desarmadorcruz=" + desarmadorcruz + "]";
	}
	
	
	
	}
