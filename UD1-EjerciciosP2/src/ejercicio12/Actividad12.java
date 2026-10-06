package ejercicio12;
import java.util.Scanner;

public class Actividad12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("¿Qué edad tienes?");
		int edad = sc.nextInt();
		
		double precio = (edad<18) ? 6.50 : 9.50;
		
		System.out.println("La entrada cuesta " +precio+ " euros.");
		
		sc.close();
	}

}
