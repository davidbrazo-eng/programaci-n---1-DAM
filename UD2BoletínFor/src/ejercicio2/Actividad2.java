package ejercicio2;
import java.util.Scanner;

public class Actividad2 {
	public static void main(String[] args) {
		System.out.println("Introduce un número cualquiera:");
		Scanner sc = new Scanner (System.in);
		Integer num = sc.nextInt();
		Integer j = 0;
		
		for (int i = 1; i <=num; i++) {
			if (i%3==0) {
				j += 1;
				
			}
				
		}
		
		System.out.println(j);
		
		sc.close();
	}

}
