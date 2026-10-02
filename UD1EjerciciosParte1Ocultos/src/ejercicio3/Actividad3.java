package ejercicio3;
import java.util.Scanner;

public class Actividad3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime un número:");
		Integer numero1 = sc.nextInt();
		System.out.println("Dime un segundo número:");
		Integer numero2 = sc.nextInt();
		
		Integer cantidad = numero2 - (numero1 %numero2);
		
		System.out.println("Al número 1 hay que sumarle: " +cantidad);
		
		sc.close();
	}

}
