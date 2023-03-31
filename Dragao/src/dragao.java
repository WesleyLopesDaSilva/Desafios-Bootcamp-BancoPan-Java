import java.util.*;
public class dragao {
    public static void main(String[] args) throws Exception {
        int casos, poderDeLuta;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de casos: ");
        casos = ler.nextInt();
        for(int i = 0; i < casos; i++){
            System.out.println("Digite o poder de luta desse Animal: ");
            poderDeLuta = ler.nextInt();
            if(poderDeLuta <= 8000){
              System.out.println("Inseto!");
            } else {
              System.out.println("Mais de 8000!");
            }
        }
    }
}

/*
--> código esperado pela DIO
import java.util.*;
public class Solution{
  public static void main(String[] args){
    int casos, poderDeLuta;
    Scanner ler = new Scanner(System.in);
    casos = ler.nextInt();
    for(int i = 0; i < casos; i++){
      poderDeLuta = ler.nextInt();
      if(poderDeLuta <= 8000){
        System.out.println("Inseto!");
      } else {
        System.out.println("Mais de 8000!");
      }
    }
  }
}
 */