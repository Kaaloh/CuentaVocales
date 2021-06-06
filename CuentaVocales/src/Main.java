/**
 * Olvidé mencionar un punto del ejercicio, lo de los integrantes del grupo(solo soy Carlos Guijarro)
 */
import java.util.*;
public class Main {

	/**
	 * 
	 * @param args
	 * importamos el Scanner y creamos uno
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		/**
		 * Ahora pido que se ponga una cadena y después crea un objeto Contador con la cadena que has puesto, y lo imprimo
		 * incluí en el toString el metodo que cuenta las vocales de forma que nos de tanto la cadena como las vocales que tiene directamente
		 */
		
		
		System.out.println("Introduzca la cadena para el conteo de vocales");
		
		Contador cadenita= new Contador(sc.nextLine());
		System.out.println(cadenita);
		
		
		
	}

}
