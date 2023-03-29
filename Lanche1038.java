import java.util.Scanner;

public class Lanche1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, quant;
        double valor;
        codigo = sc.nextInt();
        quant = sc.nextInt();

        if(codigo == 1){
            valor = quant * 4.00;
        }
        else if (codigo == 2){
            valor = quant * 4.50;
        }
        else if (codigo == 3){
            valor = quant * 5.00;
        }
        else if (codigo == 4){
            valor = quant * 2.00;
        }
        else {
            valor = quant * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", valor);

        sc.close();
    }
}
