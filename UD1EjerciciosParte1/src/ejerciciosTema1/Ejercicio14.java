package ejerciciosTema1;
import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime la nota del primer trimestre:");
		Integer primerTrimestre = sc.nextInt();
		
		System.out.println("Dime la nota del segundo trimestre:");
		Integer segundoTrimestre = sc.nextInt();
		
		System.out.println("Dime la nota del tercer trimestre: ");
		Integer tercerTrimestre = sc.nextInt();
		
		System.out.println("La nota media del curso en el boletin es: " + (primerTrimestre+segundoTrimestre+tercerTrimestre) / 3);
		
		sc.close();
	}

}
