package ejerciciosTema1;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		System.out.println("¿Qué edad tienes?");
		Scanner sc = new Scanner (System.in) ;
		byte edad= sc.nextByte();
		System.out.println("El año que viene tendré " + (edad + 1)+ " años.");
		sc.close(); 
		
	}
}
