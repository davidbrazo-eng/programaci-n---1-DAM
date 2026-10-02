package ejercicio6;

import java.util.Scanner;

public class Actividad6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la primera medida:");
		Double mm = sc.nextDouble();
		System.out.println("Dime la segunda medida:");
		Double cm = sc.nextDouble();
		System.out.println("Dime la tercera medida:");
		Double m = sc.nextDouble();

		Double suma = (mm / 10) + cm + (m * 100);

		System.out.println("La sumas es: " + suma + " cm.");

		sc.close();
	}

}
