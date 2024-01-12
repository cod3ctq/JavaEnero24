package com;

public class Herramientas {

	boolean tijeras;
	boolean sacacorchos;
	
	int navajassecundarias;

	public Herramientas(boolean tijeras, boolean sacacorchos, int navajassecundarias) {
		super();
		this.tijeras = tijeras;
		this.sacacorchos = sacacorchos;
		this.navajassecundarias = navajassecundarias;
	}

	public boolean isTijeras() {
		return tijeras;
	}

	public void setTijeras(boolean tijeras) {
		this.tijeras = tijeras;
	}

	public boolean isSacacorchos() {
		return sacacorchos;
	}

	public void setSacacorchos(boolean sacacorchos) {
		this.sacacorchos = sacacorchos;
	}

	public int getNavajassecundarias() {
		return navajassecundarias;
	}

	public void setNavajassecundarias(int navajassecundarias) {
		this.navajassecundarias = navajassecundarias;
	}

	@Override
	public String toString() {
		return "Herramientas [tijeras=" + tijeras + ", sacacorchos=" + sacacorchos + ", navajassecundarias="
				+ navajassecundarias + "]";
	}
	
	
	
}
