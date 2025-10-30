package Lista_Senai_CTTIT.Ativ18_ModularizacaoCriacao;

import java.util.Scanner;

public class ValidadorSenha {
    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser não-negativo.");
        }

        long resultado = 1;
        int contador = numero;

        while (contador > 1) {
            resultado *= contador;
            contador--;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = sc.nextInt();

        try {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
