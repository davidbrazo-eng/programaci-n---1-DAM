package ejercicio1;
import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Integer num, suma=0;
		
		System.out.println("Introduce números positivos y uno negativo para terminar: ");
		num=sc.nextInt();
		while (num>=0) {
			suma+= num;
			num=sc.nextInt();
			
		}
		System.out.println("La suma es: " +suma);
		sc.close();
	}

}
