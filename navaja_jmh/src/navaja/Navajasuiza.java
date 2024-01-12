package navaja;

public class Navajasuiza {
	
	int nherramientas;
	double tamaño;
	String matmango;
	String matherramientas;
	double precio;
	String marca;
	
	public Navajasuiza () {
		
	}
	
	public Navajasuiza(int nherramientas, double tamaño, String matmango, String matherramientas, double precio,
			String marca) {
		super();
		this.nherramientas = nherramientas;
		this.tamaño = tamaño;
		this.matmango = matmango;
		this.matherramientas = matherramientas;
		this.precio = precio;
		this.marca = marca;
	}

	public int getNherramientas() {
		return nherramientas;
	}

	public void setNherramientas(int nherramientas) {
		this.nherramientas = nherramientas;
	}

	public double isTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getMatmango() {
		return matmango;
	}

	public void setMatmango(String matmango) {
		this.matmango = matmango;
	}

	public String getMatherramientas() {
		return matherramientas;
	}

	public void setMatherramientas(String matherramientas) {
		this.matherramientas = matherramientas;
	}

	public double isPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Navajasuiza [nherramientas=" + nherramientas + ", tamaño=" + tamaño + ", matmango=" + matmango
				+ ", matherramientas=" + matherramientas + ", precio=" + precio + ", marca=" + marca + "]";
	}

	
	
	
	

}
