package com;

public class FuncionCTools {
	boolean PelaCables, Pinzas, SierraMadera, Lupa, BrujulaCRegla;
	public FuncionCTools() {
		
	}
	public FuncionCTools(boolean pelaCables, boolean pinzas, boolean sierraMadera, boolean lupa,
			boolean brujulaCRegla) {
		PelaCables = pelaCables;
		Pinzas = pinzas;
		SierraMadera = sierraMadera;
		Lupa = lupa;
		BrujulaCRegla = brujulaCRegla;
	}
	public boolean isPelaCables() {
		return PelaCables;
	}
	public void setPelaCables(boolean pelaCables) {
		PelaCables = pelaCables;
	}
	public boolean isPinzas() {
		return Pinzas;
	}
	public void setPinzas(boolean pinzas) {
		Pinzas = pinzas;
	}
	public boolean isSierraMadera() {
		return SierraMadera;
	}
	public void setSierraMadera(boolean sierraMadera) {
		SierraMadera = sierraMadera;
	}
	public boolean isLupa() {
		return Lupa;
	}
	public void setLupa(boolean lupa) {
		Lupa = lupa;
	}
	public boolean isBrujulaCRegla() {
		return BrujulaCRegla;
	}
	public void setBrujulaCRegla(boolean brujulaCRegla) {
		BrujulaCRegla = brujulaCRegla;
	}
	@Override
	public String toString() {
		return "FuncionCTools [PelaCables=" + PelaCables + ", Pinzas=" + Pinzas + ", SierraMadera=" + SierraMadera
				+ ", Lupa=" + Lupa + ", BrujulaCRegla=" + BrujulaCRegla + "]";
	}
	
	
	
	

}
