package ciclos;

	public class InversionBancaria {
	    public static void main(String[] args) {
	        double inversionInicial = 700.0;
	        double interesMensual = 0.02;
	        double objetivo = 1500.0;

	        int meses = 0;
	        double saldo = inversionInicial;

	        while (saldo < objetivo) {
	            saldo += saldo * interesMensual; // Se suma el interés mensual
	            meses++;
	        }

	        System.out.println("En " + meses + " meses, la inversión superará los $1500.");
	    }
	}

