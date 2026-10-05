package ejercicio5;
import java.util.Scanner;

public class Actividad5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime un numero: ");
		
		double numero = sc.nextDouble();
		
		System.out.println("Su valor absoluto es: " + Math.abs(numero));
		System.out.println("Su raiz cuadrada es: " + Math.sqrt(numero));
		
		sc.close();
	}

}
