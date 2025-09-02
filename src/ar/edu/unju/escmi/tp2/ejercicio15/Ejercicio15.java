package ar.edu.unju.escmi.tp2.ejercicio15;
import java.util.Scanner;
public class Ejercicio15 {
   public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        int tamaño;

        do {
            System.out.print("Ingrese un número entero (tamaño del array) entre 3 y 10: ");
            tamaño = scanner.nextInt();
        } while (tamaño < 3 || tamaño > 10);

     
        int[] numeros = new int[tamaño];

        
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el número para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        int suma = 0;
        System.out.println("\nContenido del array:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
            suma += numeros[i];
        }

        System.out.println("Suma total de los valores: " + suma);
        scanner.close();
    
  }
}
