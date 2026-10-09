package ejercicio3;
import java.util.Scanner;

public class Actividad3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Double num = sc.nextDouble();
		
		for (int i = 1; i <=3.0; i++) {
			System.out.println("Dime un número:");
			num+=sc.nextInt();
		}
		
		Double media = num/3;
		System.out.println("La media de los 3 números es: " +media);
		
		
		sc.close();
	}

}
