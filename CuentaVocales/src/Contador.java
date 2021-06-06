
public class Contador {
	
	/**
	 * @author Carlos
	 * 
	 * a continuacion he creado el atributo cadena, un String y he creado el constructor con �ste, y m�s adelante estan los getters y setters
	 * Tambi�n esta el toString
	 * 
	 */
	
	private String cadena; 
	
	/**
	 * 
	 * @param cadena
	 */
	
	public Contador(String cadena) {
		super();
		this.cadena = cadena;
	}

	/**
	 * 
	 * @param cadena
	 * @return
	 */
	
	public String numVocales(String cadena) {
		int conteo=0;
		for(int i=0;i<this.cadena.length();i++) {
			 if ((this.cadena.charAt(i)=='a') || (this.cadena.charAt(i)=='e') || (this.cadena.charAt(i)=='i') || (this.cadena.charAt(i)=='o') || (this.cadena.charAt(i)=='u')){ 
			    conteo++;
			  }
		}
		System.out.println();
		return"        y tiene "+conteo+" vocales";
	}
	/**
	 * Funciona con un FOR que va recorriendo cada caracter de la cadena, y si un caracter es A,E,I,O,U el conteo sumar� 1 hasta terminar
	 * luego est� el return que devuelve el numero de vocales de la cadena que hemos dado
	 * @return
	 */
	

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}


	/**
	 * en el toString he colocado el metodo numVocales, as� te devuelve la cadena y adem�s tambien el numero de vocales de la cadena
	 */
	@Override
	public String toString() {
		return "La cadena es=     " + cadena+ numVocales(this.cadena) ;
	}
}
