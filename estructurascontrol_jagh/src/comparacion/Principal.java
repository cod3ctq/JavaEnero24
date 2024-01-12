package comparacion;

public class Principal {

	
	  public static void main(String[] args) { 
		String mensaje="anita lava la tina".replace(" "," ");
		System.out.println(mensaje);
		String inverso="";
		//construir la cadena inversa
		for (int i = mensaje.length()-1; i>=0 ; i-- ){
			//                         'a'   17
			System.out.println(mensaje.charAt(i));
			//                         'n'    16
			inverso = inverso + mensaje.charAt(i);	
		}
		System.out.println(inverso);
		if(mensaje.equals(inverso)) {
		 System.out.println("SI");
		}else {
			System.out.println("No");
		}
	}
}
