package ejercicio2;
import java.util.Scanner;

public class Actividad2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime un número:");
		Integer numero = sc.nextInt();
		Integer cantidad = 7 - (numero % 7);
		
		System.out.println("Hay que sumarle: " +cantidad);
		
		sc.close();
	}

}
