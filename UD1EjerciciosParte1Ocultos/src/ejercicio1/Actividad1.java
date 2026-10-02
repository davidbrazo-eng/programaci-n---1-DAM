package ejercicio1;

import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número:");
		Double numero = sc.nextDouble();

		Integer resultado = (int) (numero + 0.5);

		System.out.println("El resultado redondeado es: " + resultado);

		sc.close();
	}

}
