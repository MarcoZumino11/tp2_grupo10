package ar.edu.unju.escmi.tp2.ejercicio7;

public class ejercicio7 {
    public static void main(String[] args) {
          int a = 30;
        double b = 1.5;

        System.out.println("a++ = " + (a++)); // usa a, luego incrementa
        System.out.println("a = " + a);       // ahora a ya se incremento

        System.out.println("--a = " + (--a)); // primero decrementa, luego usa

        System.out.println("++b = " + (++b)); // primero incrementa, luego usa
        System.out.println("b-- = " + (b--)); // usa b, luego decrementa
        System.out.println("b = " + b);       // ya decrementado
    }

}
