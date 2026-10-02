package ejercicio5;

import java.util.Scanner;

public class Actividad5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una cantidad de segundos:");
		Integer segundos = sc.nextInt();

		Integer horas = segundos / 3600;
		segundos = segundos % 3600;

		Integer minutos = segundos / 60;
		segundos = segundos % 60;

		System.out.println(
				"Son: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");

		sc.close();
	}

}
