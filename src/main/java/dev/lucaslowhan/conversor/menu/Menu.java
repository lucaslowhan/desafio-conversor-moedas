package dev.lucaslowhan.conversor.menu;

import dev.lucaslowhan.conversor.domain.Conversion;
import dev.lucaslowhan.conversor.domain.ConversorService;
import dev.lucaslowhan.conversor.domain.FileGenerator;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public int option;
    public String currencyA;
    public String currencyB;
    public double value;
    public void startMenu() throws IOException {
        Conversion conversion;
        FileGenerator fileGenerator = new FileGenerator();
        Scanner sc = new Scanner(System.in);
        System.out.println("--- CONVERSOR DE MOEDAS ---");
        System.out.println("--- ESCOLHA UMA OPÇÃO   ---");
        System.out.println("1- Dolar para Real");
        System.out.println("2- Real para Dolar");
        System.out.println("3- Dolar para Peso Argentino");
        System.out.println("4- Peso Argentino para Dolar");
        System.out.println("5- Real para Peso Argentino");
        System.out.println("6- Peso Argentino para Real");
        System.out.println("0- SAIR");
        option = sc.nextInt();
        switch (option){
            case 1:
                currencyA = "USD";
                currencyB = "BRL";
                System.out.println("Digite em dolares, quanto deseja converter para reais: ");
                value = sc.nextDouble();
                conversion = new ConversorService().conversorService(currencyA,currencyB,value);
                System.out.println("O valor USD " + value + " convertido para real é: BRL " + conversion.conversion_result() );
                fileGenerator.saveJsonFile(conversion);
                break;
            case 2:
                currencyA = "BRL";
                currencyB = "USD";
                System.out.println("Digite em reais, quanto deseja converter para dolares:");
                value = sc.nextDouble();
                conversion = new ConversorService().conversorService(currencyA,currencyB,value);
                System.out.println("O valor BRL " + value + " convertido para real é: USD " + conversion.conversion_result() );
                fileGenerator.saveJsonFile(conversion);
                break;
            case 3:
                currencyA = "USD";
                currencyB = "ARS";
                System.out.println("Digite em Dolares, quanto deseja converter para Pesos argentinos: ");
                value = sc.nextDouble();
                conversion = new ConversorService().conversorService(currencyA,currencyB,value);
                System.out.println("O valor USD " + value + " convertido para real é: ARS " + conversion.conversion_result() );
                fileGenerator.saveJsonFile(conversion);
                break;
            case 4:
                currencyA = "ARS";
                currencyB = "USD";
                System.out.println("Digite em Pesos Argentinos, quanto deseja converter para Dolares:");
                value = sc.nextDouble();
                conversion = new ConversorService().conversorService(currencyA,currencyB,value);
                System.out.println("O valor ARS " + value + " convertido para real é: USD " + conversion.conversion_result() );
                fileGenerator.saveJsonFile(conversion);
                break;
            case 5:
                currencyA = "BRL";
                currencyB = "ARS";
                System.out.println("Digite em Reais, quanto deseja converter para Pesos Argentinos: ");
                value = sc.nextDouble();
                conversion = new ConversorService().conversorService(currencyA,currencyB,value);
                System.out.println("O valor BRL " + value + " convertido para real é: ARS " + conversion.conversion_result() );
                fileGenerator.saveJsonFile(conversion);
                break;
            case 6:
                currencyA = "ARS";
                currencyB = "BRL";
                System.out.println("Digite em Pesos Argentinos, quanto deseja converter para Reais:");
                value = sc.nextDouble();
                conversion = new ConversorService().conversorService(currencyA,currencyB,value);
                System.out.println("O valor ARS " + value + " convertido para real é: BRL " + conversion.conversion_result() );
                fileGenerator.saveJsonFile(conversion);
                break;
            default:
                System.out.println("Opção incorreta");
                break;
            case 0:
                System.out.println("SAINDO...");
        }

    }
}
