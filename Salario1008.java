import java.util.Scanner;
import java.util.Locale;

public class Salario1008 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, quanth;
        double valorh, salario;
        n = sc.nextInt();
        quanth = sc.nextInt();
        valorh = sc.nextDouble();
        salario = quanth * valorh;

        System.out.println("NUMBER = " + n);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();

    }
}
