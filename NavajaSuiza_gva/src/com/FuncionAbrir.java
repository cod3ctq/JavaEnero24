package com;

public class FuncionAbrir {
	boolean SacaCorchos, Abrelatas, Destapador;
	public FuncionAbrir(){
		
	}
	public FuncionAbrir(boolean sacaCorchos, boolean abrelatas, boolean destapador) {
		SacaCorchos = sacaCorchos;
		Abrelatas = abrelatas;
		Destapador = destapador;
	}
	public boolean isSacaCorchos() {
		return SacaCorchos;
	}
	public void setSacaCorchos(boolean sacaCorchos) {
		SacaCorchos = sacaCorchos;
	}
	public boolean isAbrelatas() {
		return Abrelatas;
	}
	public void setAbrelatas(boolean abrelatas) {
		Abrelatas = abrelatas;
	}
	public boolean isDestapador() {
		return Destapador;
	}
	public void setDestapador(boolean destapador) {
		Destapador = destapador;
	}
	@Override
	public String toString() {
		return "FuncionAbrir [SacaCorchos=" + SacaCorchos + ", Abrelatas=" + Abrelatas + ", Destapador=" + Destapador
				+ "]";
	}
	
	
	

}
