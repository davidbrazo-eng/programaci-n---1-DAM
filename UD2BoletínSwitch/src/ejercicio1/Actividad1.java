package ejercicio1;
import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una nota:");
		Integer nota = sc.nextInt();
		
		if (nota >= 0 && nota<=4) {
			System.out.println("Insuficiente");
		} else if (nota==5) {
			System.out.println("Suficiente");
		} else if (nota==6) {
			System.out.println("Bien");
		} else if (nota>6 && nota<9) {
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}
		
		sc.close();
	}

}
