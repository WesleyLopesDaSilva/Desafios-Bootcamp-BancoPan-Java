import java.util.Scanner;
public class somaHcomN {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número de termos: ");
        int n = input.nextInt();

        double h = 0.0;

        for (int i = 1; i <= n; i++) {
            h += 1.0 / i;
        }
        
        int somaArredondada = Math.round((float) h);
        System.out.println("A soma é: " + somaArredondada);

        //System.out.printf("O valor de H com %d termos é %.2f\n", n, somaArredondada);

        input.close();
        
    }
}

/*
--> Código esperado pela plataforma DIO

import java.util.Scanner;

public class Main {
  public static void main(String[] Args) {
    double h = 0;
    Scanner sc = new Scanner(System.in);
    
    double n = sc.nextDouble();
     
        

    for (int i = 1; i <= n; i++) {
      h += 1.0 / i;
      //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
           
    }
    
    int somaArredondada = Math.round((float) h);
    System.out.println(somaArredondada);
    //System.out.printf("O valor de H com %d termos é %.2f\n", n, somaArredondada);
    //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
   
       
   }
}

 */