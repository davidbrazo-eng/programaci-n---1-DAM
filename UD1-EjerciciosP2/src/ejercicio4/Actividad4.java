package ejercicio4;
import java.util.Scanner;

public class Actividad4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime un número real: ");
		
		double numero = sc.nextDouble();
		
		System.out.println("Entero inferior: " + Math.floor(numero));
		System.out.println("Entero superior: " + Math.ceil(numero));
		System.out.println("Entero mas cercano: " + Math.round(numero));
		
		sc.close();
		
	}
}
