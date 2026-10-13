package ejercicio5;
import java.util.Scanner;

public class Actividad5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime la altura del triángulo");
		int altura = sc.nextInt();
		
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura ; j++) {
				if (j>=altura-1-i) {
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
