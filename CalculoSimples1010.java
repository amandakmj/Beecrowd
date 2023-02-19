import java.util.Scanner;
import java.util.Locale;

public class CalculoSimples1010 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, n1, cod2, n2;
        double valor1, valor2, total;

        cod1 = sc.nextInt();
        n1 = sc.nextInt();
        valor1 = sc.nextDouble();

        cod2 = sc.nextInt();
        n2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total = n1 * valor1 + n2 * valor2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}
