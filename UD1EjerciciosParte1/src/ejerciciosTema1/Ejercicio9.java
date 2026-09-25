package ejerciciosTema1;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una edad");
		byte edad = sc.nextByte();
		
		 Boolean b=edad >=18;
		 
		 System.out.println("¿Mayor de edad? -->" +b);
		
	sc.close();
	}
}
