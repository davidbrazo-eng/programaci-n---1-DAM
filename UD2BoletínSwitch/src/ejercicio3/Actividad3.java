package ejercicio3;

import java.util.Scanner;

public class Actividad3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un valor para a:");
		Integer num1 = sc.nextInt();
		System.out.println("Dime un valor para b:");
		Integer num2 = sc.nextInt();
		
		System.out.println("1. SUMAR LOS NÚMEROS.");
		System.out.println("2. RESTAR LOS NÚMEROS.");
		System.out.println("3. MULTIPLICAR LOS NÚMEROS.");
		System.out.println("4. DIVIDIR LOS NÚMEROS.");
		System.out.println("Selecciona una opción de las cuatro.");
		
		int opcion = sc.nextInt();
		
		if (opcion==1) {
			System.out.println("Resultado: " +(num1 + num2));
		} else if (opcion==2) {
			System.out.println("Resultado: " +(num1 - num2));
		} else if (opcion==3) {
			System.out.println("Resultado: " +(num1 * num2));
		} else if (opcion==4) {
			System.out.println("Resultado: " +(num1 / num2));
		} else {
			System.out.println("Opción incorrecta.");
		}

		sc.close();
	}

}
