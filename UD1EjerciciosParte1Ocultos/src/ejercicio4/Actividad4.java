package ejercicio4;
import java.util.Scanner;

public class Actividad4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime un valor para x:");
		Integer x = sc.nextInt();
		System.out.println("Dime un valor:");
		Integer a = sc.nextInt();
		System.out.println("Dime un segundo valor:");
		Integer b = sc.nextInt();
		System.out.println("Dime un tercer valor:");
		Integer c = sc.nextInt();
		
		Integer y = a*x*x+b*x+c;
		
		System.out.println("El valor total de y es: " +y);
		
	sc.close();	
	}

}
