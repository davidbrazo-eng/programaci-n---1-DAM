package ejercicio13;
import java.util.Scanner;

public class Actividad13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime una cantidad de dinero:");
		double cantidad = sc.nextDouble();
		
		int euros = (int) cantidad;
		
		int centimos = (int) Math.round((cantidad - euros)*100);
		
		System.out.println("Euros enteros: " +euros+ " €.");
		System.out.println("Céntimos: " +centimos+ " cts.");
		
		sc.close();
	}

}
