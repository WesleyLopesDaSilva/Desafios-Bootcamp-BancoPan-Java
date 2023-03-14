import java.io.IOException;
import java.util.Scanner;

public class PositivosMedia {
    public static void main(String[] args) throws Exception {
        // System.out.println("Teste!");
        Scanner leitor = new Scanner(System.in);

        int cont = 0;
        double media = 0;
        double x = 0;
        for (int i = 1; i < 7; i++) {
            System.out.println("Digite um valor: ");
            double num = leitor.nextDouble();

            if (num >= 0) {
                cont++;
                x = x + num;
            }
        }

        media = x / cont;
        System.out.println("valores positivos: " + cont);
        System.out.println(String.format("Média: %.1f", media));
    }
}