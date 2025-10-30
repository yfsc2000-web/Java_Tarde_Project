package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantas peças produzidas por hora:");
        int producao = sc.nextInt();

        int pecas = max(producao);

        showResult(pecas);
        sc.close();

    }
    public static int max(int producao) {
        int aux;

        if (producao <= 50) {
            System.out.println("Baixo");
            aux=1;

        }
        else if (producao<= 100) {
            System.out.println("desempenho regular");
            aux=2;

    }
        else {
            System.out.println("Otimo desempenho");
            aux = 3;
        }
        return aux;

    }
    public static void showResult(int value) {
        System.out.println("bateria: "+ value);
    }
}



