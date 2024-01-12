package com;


//Una interface define un contrato de accionespor implementar
//SOLO HAY METODOS ABSTRACTOS EN UNA INTERFACE, ALGUNAS VECES ALGÚNA CONSTANTE PERO ES MUY RARO Y NO MUY IMPLEMENTABLE

public interface Calidad {
	
	//final static String VALOR_UNO="HOLA"; //Si bien pueden haber constrantes no son la mejor idea
	//En las interfaces si existe la multiherencia
	void evaluarProducto();
	void auditar();
	void medir();
	
}
