package ejercicio06;
import java.util.Scanner;

public class Actividad06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número entre 0 y 99999:");
		Integer numero = sc.nextInt();
	
		if (numero < 0 || numero > 99999) {
			System.out.println("El número está fuera del rango comprendido entre 0 y 99999.");
			
		} else if (numero<10) {
			System.out.println("El número tiene una cifra.");
			
		} else if (numero<100) {
			System.out.println("El número tiene dos cifras.");
		} else if (numero<1000) {
			System.out.println("El número tiene tres cifras.");
		} else if (numero < 10000) {
			System.out.println("El número tiene cuatro cifras.");
		} else {
			System.out.println("El número tiene cinco cifras.");
		}
			
 		
		sc.close();
	}

}
