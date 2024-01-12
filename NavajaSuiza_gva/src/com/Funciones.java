package com;

public class Funciones extends NavajaSuiza{

	FuncionCortar Blades;
	FuncionAbrir Openers;
	FuncionBTools BasicTools;
	FuncionCTools ComplexTools;
	
	
	public Funciones() {
		
	}


	public Funciones(String marca, String color, double precio, double peso, int numfunciones, FuncionCortar blades,
			FuncionAbrir openers, FuncionBTools basicTools, FuncionCTools complexTools) {
		super(marca, color, precio, peso, numfunciones);
		Blades = blades;
		Openers = openers;
		BasicTools = basicTools;
		ComplexTools = complexTools;
	}


	public FuncionCortar getBlades() {
		return Blades;
	}


	public void setBlades(FuncionCortar blades) {
		Blades = blades;
	}


	public FuncionAbrir getOpeners() {
		return Openers;
	}


	public void setOpeners(FuncionAbrir openers) {
		Openers = openers;
	}


	public FuncionBTools getBasicTools() {
		return BasicTools;
	}


	public void setBasicTools(FuncionBTools basicTools) {
		BasicTools = basicTools;
	}


	public FuncionCTools getComplexTools() {
		return ComplexTools;
	}


	public void setComplexTools(FuncionCTools complexTools) {
		ComplexTools = complexTools;
	}


	@Override
	public String toString() {
		return "Funciones [Blades=" + Blades + ", Openers=" + Openers + ", BasicTools=" + BasicTools + ", ComplexTools="
				+ ComplexTools + ", marca=" + marca + ", color=" + color + ", precio=" + precio + ", peso=" + peso
				+ ", numfunciones=" + numfunciones + "]";
	}
	
	
}
