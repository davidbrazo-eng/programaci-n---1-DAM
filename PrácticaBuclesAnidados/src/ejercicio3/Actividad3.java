package ejercicio3;
import java.util.Scanner;

public class Actividad3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime la altura del árbol");
		int altura = sc.nextInt();
		
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
