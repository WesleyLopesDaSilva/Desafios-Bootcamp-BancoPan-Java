import java.io.IOException;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número para ver o resultado: ");
        int N = leitor.nextInt();
        int proximo, anterior = 0, atual = 1;
        if (N ==1) {
            System.out.println(anterior);
        } else if(N >= 2) {
            System.out.print(anterior);
            for(int i =2; i <= N; i++){
                proximo = anterior + atual;
                anterior = atual; 
                atual =  proximo;
                System.out.print( " " + anterior);
            }  
        }
    }
}
/*
--> Código aceito pela plataforma DIO
import java.io.IOException;
import java.util.Scanner;
public class Teste {
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    int N = leitor.nextInt();
    int proximo, anterior = 0, atual = 1;
    if (N ==1) {
      System.out.println(anterior);
    } else if(N >= 2) {
      System.out.print(anterior);
      for(int i =2; i <= N; i++){
        proximo = anterior + atual;
        anterior = atual; 
        atual =  proximo;
        System.out.print( " " + anterior);
      }  
    }
  }
}
*/