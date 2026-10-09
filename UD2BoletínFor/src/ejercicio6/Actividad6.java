package ejercicio6;
import java.util.Scanner;

public class Actividad6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Integer num = 5;
		boolean algunSuspenso= false;
		
		for (int i = 1; i <=num; i++) {
			System.out.println("Dime la nota:");
			
			Integer nota = sc.nextInt();
			
			if (nota<5) {
				
				algunSuspenso = true;
				break;
			}
			
		}
		
		System.out.println("¿Hay algún suspenso? ---> " +algunSuspenso);
		
		sc.close();
	}
}