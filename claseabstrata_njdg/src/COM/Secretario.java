package COM;


//en las interfaces si existe la multi herencia



public class Secretario extends Empleado implements Calidad,Contabilidad {
	
	//Comportamiento forma 2 : Metodo heredado y sobre escrito 
	@Override
	public void trabajar() {
		 
		System.out.println("Atender llamdas, organizar docs, agendar citas");
		
	}

	//Comportamiento forma 3 : metodos implementados
	@Override
	public void evaluarProducto() {
	
		
	}

	@Override
	public void auditar() {
	
		
	}

	@Override
	public void medir() {
		
		
	}

	@Override
	public void administrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generarDeclaraciones() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcularNomina() {
		// TODO Auto-generated method stub
		
	}


	
}
