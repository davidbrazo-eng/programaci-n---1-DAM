package ejercicio15;
import java.util.Scanner;

public class Actividad15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime a:");
		Integer a = sc.nextInt();
		System.out.println("Dime b:");
		Integer b = sc.nextInt();
		System.out.println("Dime c:");
		Integer c = sc.nextInt();
		
		System.out.println("El primer resultado posible es: " +(a+b*c));
		System.out.println("El segundo resultado posible es: " +((a+b)*c));
		
		/* En la expresión "a + b * c", la multiplicación tiene mayor 
         * precedencia que la suma. Por lo tanto, Java calcula 
         * primero el producto "b * c" y al resultado le suma "a".
         * 
         * En la expresión "(a + b) * c", los paréntesis alteran el orden 
         * natural de prioridad, obligando a Java a evaluar primero la suma "a + b" 
         * y luego multiplicar la suma obtenida por "c".
         */
		
		sc.close();
	}

}
