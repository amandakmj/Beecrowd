import java.util.Scanner;

public class TempodeJogo1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hI, hF, duracao;

        hI = sc.nextInt();
        hF = sc.nextInt();

        if (hI < hF){
            duracao = hF - hI;
        }
        else{
            duracao = 24 - hI + hF;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
    
}
