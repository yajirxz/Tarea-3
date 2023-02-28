package src;

import java.util.Scanner;
public class Gato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa exactamente 9 caracteres (X, 0, _):");
        String entrada = scanner.nextLine().toUpperCase();

        // checa que se hayan ingresado los 9 caracteres
        if (entrada.length() != 9) {
            System.out.println("ERROR, se debe ingresar exactamente 9 caracteres.");
            return;
        }

        // Validar que solo haya caracteres permitidos
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (c != 'X' && c != 'O' && c != '_') {
                System.out.println("Solo se deben ingresar los siguientes caracteres: X, O, _");
                return;
            }
        }

        // Se imprime el juego del gato
        System.out.println(" ----------- ");
        System.out.println(" | " + entrada.charAt(0) + "  " + entrada.charAt(1) + "  " + entrada.charAt(2) + " | ");
        System.out.println(" | " + entrada.charAt(3) + "  " + entrada.charAt(4) + "  " + entrada.charAt(5) + " | ");
        System.out.println(" | " + entrada.charAt(6) + "  " + entrada.charAt(7) + "  " + entrada.charAt(8) + " | ");
        System.out.println(" ----------- ");
    }
}
