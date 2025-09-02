package ar.edu.unju.escmi.tp2.ejercicio3;

public class ejercicio3 {
public static void main(String[] args) {
     // Constantes
        final int CODIGO_POSTAL_JUJUY = 4600;
        final double PI = 3.1415926535;
        final int DIAS_SEMANA = 7;
        final int MESES_ANO = 12;

        // Mostrar en consola
        System.out.println("Codigo postal de Jujuy: " + CODIGO_POSTAL_JUJUY);
        System.out.println("Valor de PI: " + PI);
        System.out.println("Cantidad de dias de la semana: " + DIAS_SEMANA);
        System.out.println("Cantidad de meses en un año: " + MESES_ANO);
}
}
//¿Es necesario usar static?
// No, no es estrictamente necesario si las constantes se declaran dentro del método main, como en el ejercicio de arriba.