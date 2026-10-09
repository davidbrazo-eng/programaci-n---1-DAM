package ejercicio1;
import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		System.out.println("Dime un número cualquiera:");
		Scanner sc = new Scanner (System.in);
		Integer num = sc.nextInt();
		for (int i = 1; i <=num ; i++) {
			System.out.println(i);
			
		}
		sc.close();
	}

}
