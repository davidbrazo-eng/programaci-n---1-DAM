package ejercicio1;
import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce las filas");
		int filas = sc.nextInt();
		
		System.out.println("Introduce las columnas");
		int columnas = sc.nextInt();
		
		for (int i = 1; i <= filas; i++) {
			for (int j = 1; j <= columnas; j++) {
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
