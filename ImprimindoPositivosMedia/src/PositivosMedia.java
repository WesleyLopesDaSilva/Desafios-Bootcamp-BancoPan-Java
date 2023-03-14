import java.io.IOException;
import java.util.Scanner;

public class PositivosMedia {
    public static void main(String[] args) throws IOException {
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

/*
    Versão correta para a plataforma DIO:(a única diferença é que não tem o campo para a inserção dos dados...)
    
import java.io.IOException;
import java.util.Scanner;

public class DIO {
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    int cont = 0;
    double media = 0;
    double x = 0;
    for (int i = 1; i < 7; i++) {
      double num = leitor.nextDouble();

      if(num >= 0){
        cont++;
        x = x + num;
      }
    }

    media = x / cont;
    System.out.println(cont + " valores positivos");
    System.out.println(String.format("%.1f", media));
  }
}
 */