package ar.edu.unju.escmi.tp2.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número para la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nContenido del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + " -> Valor: " + numeros[i]);
        }

        sc.close();

    }

}
