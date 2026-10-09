package ejercicio8;
import java.util.Scanner;

public class Actividad8 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce A: ");
	        int A = sc.nextInt();

	        System.out.print("Introduce B: ");
	        int B = sc.nextInt();

	        if (A < B) {
	            for (int i = A; i <= B; i++) {
	                System.out.println(i);
	            }
	        } else {
	            for (int i = B; i <= A; i++) {
	                System.out.println(i);
	            }
	        }
	        
	        sc.close();
	    }
	}
