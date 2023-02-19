import java.util.Scanner;
import java.util.Locale;

public class Area1012 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, triang, circ, trap, quad, ret;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triang = a * c / 2.0;
        circ = 3.14159 * c * c;
        trap = (a + b) / 2.0 * c;
        quad = b * b;
        ret = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triang);
        System.out.printf("CIRCULO: %.3f%n", circ);
        System.out.printf("TRAPEZIO: %.3f%n", trap);
        System.out.printf("QUADRADO: %.3f%n", quad);
        System.out.printf("RETANGULO: %.3f%n", ret);

        sc.close();

    }
}
