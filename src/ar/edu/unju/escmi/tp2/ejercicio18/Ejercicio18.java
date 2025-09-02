package ar.edu.unju.escmi.tp2.ejercicio18;

public class Ejercicio18 {

    public static void main(String[] args) {
         // Caso 1: valores iguales fuera del rango cacheado
        Integer num1 = 1000;
        Integer num2 = 1000;

        System.out.println("Caso 1: num1 = 1000, num2 = 1000");
        System.out.println("Referencia de num1 es: " + System.identityHashCode(num1));
        System.out.println("Referencia de num2 es: " + System.identityHashCode(num2));

        if (num1 == num2) {
            System.out.println("Las referencias son iguales");
        } else {
            System.out.println("Las referencias son distintas");
        }

        if (num1.equals(num2)) {
            System.out.println("Los valores son iguales");
        } else {
            System.out.println("Los valores son distintos");
        }

        System.out.println("\n-----------------------------\n");

        // Caso 2: valores distintos fuera del rango cacheado
        num1 = 1000;
        num2 = 3000;

        System.out.println("Caso 2: num1 = 1000, num2 = 3000");
        System.out.println("Referencia de num1 es: " + System.identityHashCode(num1));
        System.out.println("Referencia de num2 es: " + System.identityHashCode(num2));

        if (num1 == num2) {
            System.out.println("Las referencias son iguales");
        } else {
            System.out.println("Las referencias son distintas");
        }

        if (num1.equals(num2)) {
            System.out.println("Los valores son iguales");
        } else {
            System.out.println("Los valores son distintos");
        }
    }
}
