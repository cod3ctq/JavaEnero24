package ciclos;


	public class CalculoInteresCompuesto {

	    public static void main(String[] args) {
	        // Definir variables
	        double principal = 1000.0; // Cantidad inicial
	        double tasaInteresMensual = 0.02; // Tasa de interés mensual (2% en decimal)
	        int periodos = 12; // Número de periodos (meses en un año)

	        // Calcular el monto final con interés compuesto
	        double montoFinal = principal * Math.pow(1 + tasaInteresMensual, periodos);

	        // Mostrar el resultado
	        System.out.println("El monto final después de un año será: $" + montoFinal);
	    }
	}

