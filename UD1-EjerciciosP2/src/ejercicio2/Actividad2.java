package ejercicio2;
import java.util.Scanner;

public class Actividad2 {
	/*Diseña una aplicación que pida una cantidad entera de segundos y 
	 * la convierta en horas y minutos. 
	 * Para realizar la descomposición utiliza los operadores / y %.
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime una cantidad de segundos");
		Integer segundos = sc.nextInt();
		System.out.println(+segundos+" segundos son " +segundos/(60*60)+ " horas.");
		
		System.out.println(+segundos+" segundos son "+segundos/60+ " minutos.");
		
	sc.close();	
		
	}

}
