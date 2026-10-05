package ejercicio07;
import java.util.Scanner;

public class Actividad07 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Jugador 1 (P = Piedra, A = Papel, T = Tijera): ");
        char j1 = scanner.next().charAt(0);

        System.out.print("Jugador 2 (P = Piedra, A = Papel, T = Tijera): ");
        char j2 = scanner.next().charAt(0);

        if (j1 == j2) {
            System.out.println("Empate");
        } else if ((j1 == 'P' && j2 == 'T') || 
                   (j1 == 'A' && j2 == 'P') || 
                   (j1 == 'T' && j2 == 'A')) {
            System.out.println("Ha ganado el Jugador 1");
        } else {
            System.out.println("Ha ganado el Jugador 2");
        }

        scanner.close();
    }
}
