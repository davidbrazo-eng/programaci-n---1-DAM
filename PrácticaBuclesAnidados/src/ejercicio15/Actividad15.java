package ejercicio15;

import java.util.Scanner;

public class Actividad15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número");
		int n = sc.nextInt();

		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print("#");

				} else {
					System.out.print("*");

				}

			}

			System.out.println();
		}

		sc.close();
	}

}
