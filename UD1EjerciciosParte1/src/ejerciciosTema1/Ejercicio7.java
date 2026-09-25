package ejerciciosTema1;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce tu nombre.");
		String n = sc.next();
		
		System.out.println("Introduce tu dirección.");
		String d = sc.next();
		
		System.out.println("Introduce tu número de teléfono.");
		Integer teléfono=sc.nextInt();
		
		System.out.println("Nombre: " +n);
		System.out.println("Direccón: " +d);
		System.out.println("Teléfono: " +teléfono);
		
	sc.close();
	}

}
