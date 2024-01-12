package COM;

public class ClasePrueba {

	
	private int atributoA;
	protected String atributoB;
	public double calorC;
	
	public ClasePrueba() {
		
	}

	public ClasePrueba(int atributoA, String atributoB, double calorC) {
		this.atributoA = atributoA;
		this.atributoB = atributoB;
		this.calorC = calorC;
	}

	public int getAtributoA() {
		return atributoA;
	}

	public void setAtributoA(int atributoA) {
		this.atributoA = atributoA;
	}

	public String getAtributoB() {
		return atributoB;
	}

	public void setAtributoB(String atributoB) {
		this.atributoB = atributoB;
	}

	public double getCalorC() {
		return calorC;
	}

	public void setCalorC(double calorC) {
		this.calorC = calorC;
	}
	
	
}
