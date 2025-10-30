package Lista_Senai_CTTIT.Ativ18_ModularizacaoCriacao;

import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a conversão desejada e o valor (ex: real ou dolar 100): ");
        String texto = sc.nextLine();

        String[] partes = texto.split(" ");
        String tipoConversao = partes[0];
        double desejada = Double.parseDouble(partes[1]);

        double resultado;
        if (tipoConversao.equalsIgnoreCase("real-dolar")) {
            resultado = desejada / 5.5;
            System.out.println("Valor em dólar: $" + resultado);
        } else if (tipoConversao.equalsIgnoreCase("real-euro")) {
            resultado = desejada * 5.5;
            System.out.println("Valor em real:R$" + resultado);
        } else if (tipoConversao.equalsIgnoreCase("real-euro")) {
            resultado = desejada / 6.0;
            System.out.println("Valor em euro: ¢" + resultado);
        } else if (tipoConversao.equalsIgnoreCase("euro-real")) {
            resultado = desejada * 6.0;
            System.out.println("Valor em real: R$" + resultado);
        } else {
            System.out.println("Tipo de conversão não reconhecido");

        }
    }
}
