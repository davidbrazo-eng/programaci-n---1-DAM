package ejercicio7;

import java.util.Scanner;

public class Actividad7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime una altura");
		int n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n-1; j++) {
				System.out.println(" ");
			}
			
		}
		
		for (int j = 0; j <= 2*i; i++) {
			
		}
		
		sc.close();
	}

}
