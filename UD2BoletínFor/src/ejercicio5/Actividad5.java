package ejercicio5;

import java.util.Scanner;

public class Actividad5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		Long res = 1L;
				
		for (int i = 1; i <= num; i++) {
			res = res * i;
		}

		System.out.println(res);

		sc.close();
	}

}
