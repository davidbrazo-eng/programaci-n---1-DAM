package ejercicio7;
import java.util.Scanner;

public class Actividad7 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce un numero: ");
	        int num = sc.nextInt();

	        boolean primo = true;

	        for (int i = 2; i < num; i++) {
	            if (num % i == 0) {
	                primo = false;
	            }
	        }

	        if (num < 2) {
	            primo = false;
	        }

	        if (primo) {
	            System.out.println("Es primo");
	        } else {
	            System.out.println("No es primo");
	        }
	        
	        sc.close();
	    }
	}