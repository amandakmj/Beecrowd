import java.util.Locale;
import java.util.Scanner;

public class Intervalo1037{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A;
        A = sc.nextDouble();

        if (A < 0.0 || A > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (A <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (A <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (A <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}

        sc.close();
    }
}
