package ejercicio01;
import java.util.Scanner;

public class Actividad01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime un número: ");
		Integer numero = sc.nextInt();
		
		if (numero%2==0) {
			System.out.println("El número introducido es par.");
			
		}
		else {
			System.out.println("El número introducido es impar.");
		}
		
		sc.close();
	}

}
