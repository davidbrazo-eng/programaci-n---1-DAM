package ejerciciosTema1;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime un número");
		double número1 = sc.nextDouble();
		
		System.out.println("Dime un segundo número");
		double número2 = sc.nextDouble();
		
		System.out.println("La suma de ambos es de: " +(número1 + número2));
		System.out.println("La resta de ambos dos es de: " +(número1 - número2));
		System.out.println("La multiplicación de ambos números es de: "+(número1 * número2));
		System.out.println("La división de ambos números es de: " +(número1 + número2) / 2.0);
		
		sc.close();
	}

}
