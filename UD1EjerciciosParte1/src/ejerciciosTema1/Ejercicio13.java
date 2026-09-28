package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Está lloviendo? (true/false): ");
        boolean llueve = sc.nextBoolean();

        System.out.print("¿Has terminado las tareas? (true/false): ");
        boolean tareas = sc.nextBoolean();

        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean biblioteca = sc.nextBoolean();

        boolean permiso = (!llueve && tareas) || biblioteca;

        System.out.println("¿Puedes salir a la calle? " + permiso);

       sc.close();
	}
}