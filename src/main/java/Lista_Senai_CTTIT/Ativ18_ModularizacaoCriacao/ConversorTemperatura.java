package Lista_Senai_CTTIT.Ativ18_ModularizacaoCriacao;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a temperatura?");
        double temperatura = sc.nextDouble();
        System.out.println("Qual a conversão?");
        String conversao = sc.next();
        if (conversao.equalsIgnoreCase("fahrenheit")){
            double fahrenheit =(temperatura * 9 / 5) + 32;
            System.out.println("Temperatura em Celsius: " + fahrenheit);
    }
    else if (conversao.equalsIgnoreCase("Celcius")) {
        double Celsius = (temperatura  - 32) * 5 / 9;
            System.out.println("Temperatura em fahrenheit: " +Celsius);
        }
        else {
            System.out.println("Conversão inválida! Use 'fahrenheit' ou 'celsius'.");
        }




    }
}

