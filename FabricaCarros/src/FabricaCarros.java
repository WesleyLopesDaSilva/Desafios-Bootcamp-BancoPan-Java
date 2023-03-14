import java.util.Scanner;
public class FabricaCarros {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor do custo de fábrica? ");
        int custoFabrica = scan.nextInt();
        System.out.println("Qual o valor da porcentagem do distribuidor? ");
	    int porcentagemDistribuidor = scan.nextInt();
        System.out.println("Qual o valor do percentual dos impostos? ");
	    int PercentualImpostos = scan.nextInt();

        double custoConsumidor;
        int Distribuidor;
        int ValorImpostos;

        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        ValorImpostos = (custoFabrica * PercentualImpostos) / 100;


        custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;
 
        System.out.println("O custo final do carro é: " + custoConsumidor);

    }
}

/*
 --> Código esperado pela plataforma DIO
    
import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int custoFabrica = scan.nextInt();
    int porcentagemDistribuidor = scan.nextInt();
    int PercentualImpostos = scan.nextInt();

    int custoConsumidor;
     
    int Distribuidor;
    int ValorImpostos;
 
    // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:
 
    Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
    ValorImpostos = (custoFabrica * PercentualImpostos) / 100;
        
    custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;
    System.out.println(custoConsumidor);
	}
}

*/