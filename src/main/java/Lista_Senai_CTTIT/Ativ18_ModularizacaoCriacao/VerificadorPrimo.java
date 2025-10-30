package Lista_Senai_CTTIT.Ativ18_ModularizacaoCriacao;

import java.util.Scanner;

public class VerificadorPrimo {
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) { // Testa divisores até a raiz quadrada
            if (numero % i == 0) {
                return false; // Encontrou divisor, não é primo
            }
        }

        return true; // Não encontrou divisor, é primo
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro para verificar se é primo: ");
        int numero = sc.nextInt();

        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

    }
}
