package Lista_Senai_CTTIT.Ativ18_ModularizacaoCriacao;

import java.util.Scanner;

public class CalculadoraMedia {
    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 0 || notas[i] > 10) { // Verificação de nota válida
                System.out.println("Nota inválida encontrada: " + notas[i] + ". Deve estar entre 0 e 10.");
                continue; // Ignora notas inválidas
            }
            soma += notas[i];
        }

        return soma / notas.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas notas você deseja informar? ");
        int quantidade = sc.nextInt();

        if (quantidade <= 0) {
            System.out.println("Número de notas inválido.");
            return;
        }

        double[] notas = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            if (notas[i] < 0 || notas[i] > 10) {
                System.out.println("Nota inválida! Deve estar entre 0 e 10.");
            }
        }

        double media = calcularMedia(notas);
        System.out.println("A média das notas é: " + media);
    }
}
