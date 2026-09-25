package ejerciciosTema1;
import java.util.Scanner ;

public class ejercicio3 {

	public static void main(String[] args) {
		System.out.println("¿En qué año estamos?");
		Scanner sc = new Scanner (System.in) ;
		double año = sc.nextDouble() ;		
		System.out.println("¿En qué año naciste?");
		double nacimiento = sc.nextDouble();
		
			System.out.println("Por lo tanto tengo " +(año - nacimiento)+ " años");
		sc.close();
	}
}
