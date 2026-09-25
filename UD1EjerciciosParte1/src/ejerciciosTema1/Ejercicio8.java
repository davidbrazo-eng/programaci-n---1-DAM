package ejerciciosTema1;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int edad;
		System.out.println("Introduce una edad");

		edad = sc.nextInt();
		if (edad>=18) {
			System.out.println("Hola David, tienes " +(edad)+ " años, ¡qué mayor eres!.");
		}
		
		else {
			System.out.println("Hola David, tienes " +(edad)+ " años, ¡todavía eres menor!.");
		}
			
		sc.close();
		}
	}
