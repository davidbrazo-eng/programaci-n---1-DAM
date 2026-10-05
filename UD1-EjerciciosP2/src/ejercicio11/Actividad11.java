package ejercicio11;

import java.util.Scanner;

public class Actividad11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		Integer edad = sc.nextInt();

		System.out.println("¿Tiene permiso de cinducir? (true/false)");
		boolean tienePermiso = sc.nextBoolean();

		System.out.println("¿Tiene alguna sanción para conducir? (true/false?");
		boolean tieneSanción = sc.nextBoolean();

		boolean puedeAlquilar = edad >= 18 && tienePermiso && !tieneSanción;

		System.out.println(puedeAlquilar);
		sc.close();
	}

}
