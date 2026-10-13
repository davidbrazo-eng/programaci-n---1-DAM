package ejercicio6;

import java.util.Scanner;

public class Actividad6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime una altura");
		int altura = sc.nextInt();

		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura; j++) {
				if (j >= i) {
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
