package ejercicio4;
import java.util.Scanner;

public class Actividad4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime la altura del triángulo");
		int altura = sc.nextInt();
		
		for (int i = altura ; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
