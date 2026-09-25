package ejerciciosTema1;
import java.util.Scanner ;

public class ejercicio4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime la primera nota");
		int nota1 = sc.nextInt();
		
		System.out.println("Dime la segunda nota");
		int nota2 = sc.nextInt();
		
		System.out.println("La nota media es de: " +(nota1 + nota2) / 2.0);
		
		sc.close();
		
	}

}
