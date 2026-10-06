package ejercicio04;
import java.util.Scanner;

public class Actividad04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número decimal:");
		double decimal = sc.nextDouble();
		
		if (decimal > -1 && decimal < 1 && decimal != 0) {
			System.out.println("El número " +decimal+ " es un número casi-cero.");
			
		} else {
			System.out.println("El número " +decimal+ " NO es un número casi-cero.");
		}
		
		sc.close();
	}

}
