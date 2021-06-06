import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca la cadena para el conteo de vocales");
		
		Contador cadenita= new Contador(sc.nextLine());
		System.out.println(cadenita);
		
		
		
	}

}
