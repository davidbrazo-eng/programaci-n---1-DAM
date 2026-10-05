package ejercicio7;
import java.util.Random;

public class Actividad7 {
	 public static void main(String[] args) {

	        Random random = new Random();

	        int numero = random.nextInt(100) + 1;
	        double real = random.nextDouble();
	        boolean booleano = random.nextBoolean();

	        System.out.println("Número entero: " + numero);
	        System.out.println("Número real: " + real);
	        System.out.println("Booleano: " + booleano);
	    }

}
