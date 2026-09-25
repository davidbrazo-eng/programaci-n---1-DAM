package ejerciciosTema1;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime un número");
		double par = sc.nextDouble();
		
		if (par%2==0) {
			
			System.out.println("El número introducido es par");
		}
		
		else {
			System.out.println("El número introducido es impar");
		}
		
		sc.close();
		System.out.println("holaaa");
	}

}
