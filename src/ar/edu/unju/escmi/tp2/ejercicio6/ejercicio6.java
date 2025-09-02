package ar.edu.unju.escmi.tp2.ejercicio6;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
               // Crear scanner para leer desde consola
        Scanner sc = new Scanner(System.in);
        
        // Pedir el radio (tipo byte)
        System.out.print("Ingrese el valor del radio del circulo: ");
        byte radio = sc.nextByte();
        
        // Calcular el area usando la formula: PI * r^2
        double area = Math.PI * Math.pow(radio, 2);
        
        // Mostrar resultado
        System.out.println("El area del circulo con radio " + radio + " es: " + area);
        
        sc.close(); // cerrar el scanner
    }

}
