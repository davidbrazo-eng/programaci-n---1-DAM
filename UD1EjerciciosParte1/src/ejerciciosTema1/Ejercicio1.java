package ejerciciosTema1;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime un numero");
		Double numero= sc.nextDouble();
		System.out.println("Ha escrito " + numero);
		sc.close();
	}
}
