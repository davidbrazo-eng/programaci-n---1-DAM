package ejercicio3;
import java.util.Scanner;
public class Actividad3 {
	/*Una tienda aplica un descuento fijo del 15% y, 
	 * posteriormente, un IVA del 21%. 
	 * Declara ambos porcentajes como constantes. 
	 * Pide el precio inicial al usuario, calcula el precio final y
	 *  muéstralo redondeado a dos cifras decimales utilizando
	 *   Math.round().
	 */

	public static void main(String[] args) {
		
		double DESCUENTO = 0.15;
		double IVA = 0.21;
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el precio inicial del producto");
		double precioInicial = sc.nextDouble();
		
		double precioConDescuento = precioInicial * (1 - DESCUENTO);
		double precioFinalSinRedondear = precioConDescuento * (1 + IVA);
		
		double precioFinal = Math.round (precioFinalSinRedondear * 100.0) / 100.0;
		
		System.out.println("El precio final con el 15% de descuento y el 21% de IVA es de: " + precioFinal + " €.");
		
		sc.close();
	}

}
