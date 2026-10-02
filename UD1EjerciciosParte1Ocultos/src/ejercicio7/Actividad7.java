package ejercicio7;

import java.util.Scanner;

public class Actividad7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número de entradas infantiles:");
		Double infantil = sc.nextDouble();
		System.out.println("Dime un número de entradas adultas:");
		Double adultas = sc.nextDouble();

		Double inf = 15.50 * infantil;
		Double ad = 20 * adultas;
		Double total = sc.nextDouble();
		total = total >= 100 ? 0.95 * (inf + ad) : total;
		
		System.out.println("El importe total de las entradas es: " +total);

		sc.close();
	}

}
