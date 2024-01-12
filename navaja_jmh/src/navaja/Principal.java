package navaja;


public class Principal {
	
	public static void main (String[]args) {
		

		
		Navajasuiza nav = new Navajasuiza();
		
		Grabado grab = new Grabado ("Cursiva", 12, "mayusculas");
		Navajapersonalizada per = new Navajapersonalizada(30, 11.0, "madera", "acero", 500.0, "vic", grab, "dorado");
		
		System.out.println(per);
	}

}
