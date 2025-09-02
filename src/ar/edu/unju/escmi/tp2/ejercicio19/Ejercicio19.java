package ar.edu.unju.escmi.tp2.ejercicio19;

public class Ejercicio19 {

    public static void main(String[] args) {
        
        String texto1 = "Hola";
        String texto2 = "Hola";

        // String creado con constructor explícito
        String texto3 = new String("Hola");

        System.out.println("Comparación entre texto1 y texto2:");
        System.out.println("texto1 == texto2 → " + (texto1 == texto2));
        System.out.println("texto1.equals(texto2) → " + texto1.equals(texto2));

        System.out.println("\nComparación entre texto1 y texto3:");
        System.out.println("texto1 == texto3 → " + (texto1 == texto3));
        System.out.println("texto1.equals(texto3) → " + texto1.equals(texto3));
    }
}
/*
¿Por qué texto1 == texto2 devuelve true?
Porque texto1 y texto2 fuero creados con literales y java guarda los mismos en un pool de Strings para la optimizacion de memoria. Por lo tanto, si dos literales son iguales, comparten la misma referencia.

¿Por qué texto1 == texto3 devuelve false?
Porque texto3 fue creado con new String, lo que crea un nuevo objeto en memoria. Aunque el contenido es igual, la referencia es distinta.

¿Qué sucede cuando se utiliza el método equals() para comparar los valores?
Cuando se utiliza el método equals() en Java para comparar objetos, lo que se evalúa es el contenido o valor lógico de esos objetos, no si apuntan a la misma ubicación en memoria.
 */