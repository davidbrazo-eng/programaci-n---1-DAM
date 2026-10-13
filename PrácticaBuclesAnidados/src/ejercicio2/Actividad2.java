package ejercicio2;

import java.util.Scanner;

public class Actividad2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el número de filas");
		int filas = sc.nextInt();

		System.out.println("Introduce el número de columnas");
		int columnas = sc.nextInt();

		for (int i = 1; i <= filas; i++) {
			for (int j = 1; j <= columnas; j++) {
				if (i == 1 || i == filas || j == 1 || j == columnas) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

				
			}

			System.out.println();
		}
		sc.close();
	}
}
