package ar.edu.unju.escmi.tp2.ejercicio16;
import java.util.Scanner;
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamaño;

        do {
            System.out.print("Ingrese un número entero entre 5 y 10: ");
            tamaño = scanner.nextInt();
        } while (tamaño < 5 || tamaño > 10);

        String[] nombres = new String[tamaño];
        scanner.nextLine();

        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el nombre para la posición " + i + ": ");
            nombres[i] = scanner.nextLine();
        }

        System.out.println("\nContenido del array (orden normal):");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        System.out.println("\nContenido del array (orden inverso):");
        for (int i = tamaño - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        scanner.close();
    }
}
