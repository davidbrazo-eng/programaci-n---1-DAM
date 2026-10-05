package ejercicio02;

public class Actividad02 {
	public static void main(String[] args) {
		Integer x = 5;
		Integer y = 20;
		Integer z = 23;
		Integer mayor = 0;

		if (x > y) {
			if (x > z) {
				mayor = x;

			} else {
				mayor = z;

			}

		} else {
			if (z > y) {
				mayor = z;

			} else {
				mayor = y;

			}
		}
		
		System.out.println("El mayor es: " + mayor);
	}
}
