package com;

public class Navajasuiza_ral extends Filero_ral {
	
	Desarmador_ral des;
	Herramientas tools;
	public Navajasuiza_ral(String meterial, boolean filodeamboslados, double largo, Desarmador_ral des,
			Herramientas tools) {
		super(meterial, filodeamboslados, largo);
		this.des = des;
		this.tools = tools;
	}
	public Desarmador_ral getDes() {
		return des;
	}
	public void setDes(Desarmador_ral des) {
		this.des = des;
	}
	public Herramientas getTools() {
		return tools;
	}
	public void setTools(Herramientas tools) {
		this.tools = tools;
	}
	@Override
	public String toString() {
		return "Navajasuiza_ral [des=" + des + ", tools=" + tools + ", meterial=" + meterial + ", filodeamboslados="
				+ filodeamboslados + ", largo=" + largo + "]";
	}
	
	
	

}
