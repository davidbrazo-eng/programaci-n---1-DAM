package ejercicio08;
import java.util.Scanner;

public class Actividad08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime a:");
		Integer a = sc.nextInt();
		System.out.println("Dime b:");
		Integer b = sc.nextInt();
		System.out.println("Dime c:");
		Integer c = sc.nextInt();
		
		boolean res = false;
		
		if (a+b==c || a+c==b || b+c==a) {
			
		}
		else {
			System.out.println(res);
		}
		
		sc.close();
	}

}
