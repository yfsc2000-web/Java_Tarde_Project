package Lista_Senai_CTTIT.Ativ18_ModularizacaoCriacao;

import java.util.Scanner;

public class Calculadora {
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }

    // Método principal - interação com o usuário
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Calculadora ===");
        System.out.println("Escolha a operação:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");

        System.out.print("Digite o número da operação: ");
        int opcao = entrada.nextInt();

        System.out.print("Digite o primeiro número: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = entrada.nextDouble();

        double resultado;

        // Estrutura if-else para decidir a operação
        if (opcao == 1) {
            resultado = somar(a, b);
            System.out.println("Resultado: " + resultado);
        } else if (opcao == 2) {
            resultado = subtrair(a, b);
            System.out.println("Resultado: " + resultado);
        } else if (opcao == 3) {
            resultado = multiplicar(a, b);
            System.out.println("Resultado: " + resultado);
        } else if (opcao == 4) {
            resultado = dividir(a, b);
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Opção inválida!");
        }
    }
}

