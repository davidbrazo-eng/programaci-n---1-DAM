package ejercicio4;

import java.util.Scanner;

public class Actividad4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer suma = 0;

		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				suma += i;
			}
		}
		System.out.println(suma);
		sc.close();
	}
}
