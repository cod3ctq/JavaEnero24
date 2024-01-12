package navaja;

public class Navajapersonalizada extends Navajasuiza {

	Grabado grabado;
	String color;

	public Navajapersonalizada() {

	}

	public Navajapersonalizada(int nherramientas, double tamaño, String matmango, String matherramientas, double precio,
			String marca, Grabado grabado, String color) {
		super(nherramientas, tamaño, matmango, matherramientas, precio, marca);
		this.grabado = grabado;
		this.color = color;
	}

	public Grabado getGrabado() {
		return grabado;
	}

	public void setGrabado(Grabado grabado) {
		this.grabado = grabado;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Navajapersonalizada [grabado=" + grabado + ", color=" + color + ", nherramientas=" + nherramientas
				+ ", tamaño=" + tamaño + ", matmango=" + matmango + ", matherramientas=" + matherramientas + ", precio="
				+ precio + ", marca=" + marca + "]";
	}

}
