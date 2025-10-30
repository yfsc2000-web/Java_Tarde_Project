package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercico_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a velocidade?");
        int itens = 35;

        int velocidade = max(itens);
        showResults(velocidade);

        sc.close();
    }

    public static int max(int itens) {
        int aux;
        if (itens <= 20) {
            System.out.println("Velocidade: Lenta");
            aux = 1;
        } else if (itens <= 50) {
            System.out.println("Velocidade: Média");
            aux = 2;
        } else {
            System.out.println("Velocidade: Rápida");
            aux = 3;
        }
        return aux;
    }

    public static void showResults (int value) {
        System.out.println("velocidade:" +value);

    }
}
