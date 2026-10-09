package ejercicio4;

import java.util.Scanner;

public class Actividad4While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer suma = 0;
		Integer impares = 0;
		Integer num = 1;

		while (impares < 10) {
			if (num % 2 != 0) {
				suma += num;
				impares++;
			}

			num++;

		}

		System.out.println(suma);

		sc.close();
	}
}