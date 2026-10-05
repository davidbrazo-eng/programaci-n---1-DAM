package ejercicio1;
import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime la base del rectángulo");
		double base = sc.nextDouble();
		System.out.println("El perímetro del rectángulo es de: " +base*4);
		
		System.out.println("Dime la altura del rectángulo");
		double altura = sc.nextDouble();
		System.out.println("El área del rectángulo es de: " +(base*altura));
		
	sc.close();
	}

}
