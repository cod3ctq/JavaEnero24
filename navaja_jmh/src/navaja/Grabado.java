package navaja;

public class Grabado {
	
	String tipoLetra;
	int tamañoLetra;
	String conversionLetra;
	
	public Grabado () {
		
	}

	public Grabado(String tipoLetra, int tamañoLetra, String conversionLetra) {
		super();
		this.tipoLetra = tipoLetra;
		this.tamañoLetra = tamañoLetra;
		this.conversionLetra = conversionLetra;
	}

	public String getTipoLetra() {
		return tipoLetra;
	}

	public void setTipoLetra(String tipoLetra) {
		this.tipoLetra = tipoLetra;
	}

	public int getTamañoLetra() {
		return tamañoLetra;
	}

	public void setTamañoLetra(int tamañoLetra) {
		this.tamañoLetra = tamañoLetra;
	}

	public String getConversionLetra() {
		return conversionLetra;
	}

	public void setConversionLetra(String conversionLetra) {
		this.conversionLetra = conversionLetra;
	}

	@Override
	public String toString() {
		return "Grabado [tipoLetra=" + tipoLetra + ", tamañoLetra=" + tamañoLetra + ", conversionLetra="
				+ conversionLetra + "]";
	}
	
	

}
