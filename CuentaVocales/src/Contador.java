
public class Contador {
	
	
	private String cadena;
	
	public Contador(String cadena) {
		super();
		this.cadena = cadena;
	}

	
	public String numVocales(String cadena) {
		int conteo=0;
		for(int x=0;x<this.cadena.length();x++) {
			 if ((this.cadena.charAt(x)=='a') || (this.cadena.charAt(x)=='e') || (this.cadena.charAt(x)=='i') || (this.cadena.charAt(x)=='o') || (this.cadena.charAt(x)=='u')){ 
			    conteo++;
			  }
		}
		System.out.println();
		return"        y tiene "+conteo+" vocales";
	}
	

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}


	@Override
	public String toString() {
		return "La cadena es=     " + cadena+ numVocales(this.cadena) ;
	}
}
