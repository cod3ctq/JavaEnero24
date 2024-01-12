package com;

public class FuncionCortar {
	boolean HojaBloq, HojaPeq, Punzon;
	public FuncionCortar() {
		
	}
	public FuncionCortar(boolean hojaBloq, boolean hojaPeq, boolean punzon) {
		HojaBloq = hojaBloq;
		HojaPeq = hojaPeq;
		Punzon = punzon;
	}
	public boolean isHojaBloq() {
		return HojaBloq;
	}
	public void setHojaBloq(boolean hojaBloq) {
		HojaBloq = hojaBloq;
	}
	public boolean isHojaPeq() {
		return HojaPeq;
	}
	public void setHojaPeq(boolean hojaPeq) {
		HojaPeq = hojaPeq;
	}
	public boolean isPunzon() {
		return Punzon;
	}
	public void setPunzon(boolean punzon) {
		Punzon = punzon;
	}
	@Override
	public String toString() {
		return "FuncionCortar [HojaBloq=" + HojaBloq + ", HojaPeq=" + HojaPeq + ", Punzon=" + Punzon + "]";
	}
	
	
	
	
	

}
