package ejercicio14;
import java.util.Scanner;

public class Actividad14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int puntos = 100;
		int vidas = 3;
		
		puntos += 50;
		puntos -= 20;
		vidas ++;
		vidas--;
		
		System.out.println("Estado final");
		System.out.println("Puntos: " +puntos);
		System.out.println("Vidas: " +vidas);
		
		sc.close();
	}

}
