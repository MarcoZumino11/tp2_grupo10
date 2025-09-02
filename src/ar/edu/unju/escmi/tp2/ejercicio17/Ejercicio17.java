package ar.edu.unju.escmi.tp2.ejercicio17;
public class Ejercicio17 {
    public static void main(String[] args) {
        // Caso 1: valores iguales dentro del rango cacheado
        Integer num1 = 50;
        Integer num2 = 50;

        System.out.println("Caso 1: num1 = 50, num2 = 50");
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

        // Caso 2: valores distintos dentro del rango cacheado
        num1 = 50;
        num2 = 80;

        System.out.println("Caso 2: num1 = 50, num2 = 80");
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
