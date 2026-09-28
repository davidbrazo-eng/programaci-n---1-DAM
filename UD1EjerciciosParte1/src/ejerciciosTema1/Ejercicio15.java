package ejerciciosTema1;
import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		final double IVA = 0.21;
		
		System.out.println("Introduce el precio: ");
		double precio = sc.nextDouble();
		
		double precioFinal = precio + (precio * IVA);
		
		System.out.println("El precio final es: " + precioFinal + " euros.");
		
		sc.close();
	}

}
