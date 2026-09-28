package ejerciciosTema1;
import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Introduce los kilos de manzanas: ");
		        double manzanas = sc.nextDouble();

		        System.out.print("Introduce los kilos de peras: ");
		        double peras = sc.nextDouble();

		        double totalManzanas = manzanas * 2.35;
		        double totalPeras = peras * 1.95;

		        double total = totalManzanas + totalPeras;

		        System.out.println("El importe total es: " + total + " euros");
		        
		     sc.close();
	}

}
