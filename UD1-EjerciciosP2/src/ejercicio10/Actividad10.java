package ejercicio10;
import java.util.Scanner;

public class Actividad10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int anyo;
		System.out.println("Dime un anyo cualquiera");
		anyo = sc.nextInt();
			
		if (anyo%400==0){
			System.out.println("El anyo es bisiesto");
		}
		
		else if (anyo%4==0&anyo%100!=0){
			System.out.println("El anyo es bisiesto");
		}
		
		else {
			System.out.println("El anyo NO es bisiesto");
		}
	
		sc.close();
	}

}
