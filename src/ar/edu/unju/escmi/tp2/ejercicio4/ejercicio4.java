package ar.edu.unju.escmi.tp2.ejercicio4;

public class ejercicio4 {
public static void main(String[] args) {
      // Declarar variable
        int num = 3;
        
        // Calculo de la formula (num * (num + 1) / 2)^2
        int resultado = (int) Math.pow((num * (num + 1)) / 2, 2);
        
        // Mostrar resultado
        System.out.println("El resultado para num = " + num + " es: " + resultado);
}
}
