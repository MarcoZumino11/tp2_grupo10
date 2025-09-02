package ar.edu.unju.escmi.tp2.ejercicio5;

public class ejercicio5 {
    public static void main(String[] args) {
          // Variables iniciales
        int a = 8;
        int b = 3;
        int c = -5;
        
        // Expresiones
        int resA = a + b + c;
        int resB = 2 * b + 3 * (a - c);
        double resC = (double) a / b;  // casteo a double
        int resD = a % b;
        double resE = (double) a / c;  // casteo a double
        int resF = a % c;
        double resG = (double) (a * b) / c;  // casteo para decimales
        double resH = (double) a * (b / (double) c);  // cuidado: b/c casteado
        int resI = (a * c) % b;
        int resJ = a * (c % b);
        int resK = (3 * a - 2 * b) % (2 * a - c);
        int resL = 2 * (a / 5 + (4 - b * 3)) % (a + c - 2);
        double resM = ((a - 3 * b) % (c + 2 * a)) / (double) (a - c);
        int resN = a - b - c * 2;
        
        // Mostrar resultados
        System.out.println("a) " + resA);
        System.out.println("b) " + resB);
        System.out.println("c) " + resC);
        System.out.println("d) " + resD);
        System.out.println("e) " + resE);
        System.out.println("f) " + resF);
        System.out.println("g) " + resG);
        System.out.println("h) " + resH);
        System.out.println("i) " + resI);
        System.out.println("j) " + resJ);
        System.out.println("k) " + resK);
        System.out.println("l) " + resL);
        System.out.println("m) " + resM);
        System.out.println("n) " + resN);
    }

}
