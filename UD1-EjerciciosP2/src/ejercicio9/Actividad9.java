package ejercicio9;

import java.util.Scanner;

public class Actividad9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos litros contiene el depósito?");
		Double litros = sc.nextDouble();

		System.out.println("¿Cuántos litros caben de máximo?");
		Double capacidad = sc.nextDouble();

		int botellasCompletas = (int) Math.floor(litros / capacidad);

		System.out.println("Se pueden llenar " + botellasCompletas + " botellas completas");

		sc.close();
	}

}
