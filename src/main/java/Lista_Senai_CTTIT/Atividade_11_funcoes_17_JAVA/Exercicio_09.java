package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o índice de defeito do lote?");
        int porcentagem = sc.nextInt();

        int defeito = max(porcentagem);

        showResult(defeito);
        sc.close();
    }

    public static int max(int porcentagem) {
        int aux;

        if (porcentagem>10) {
            System.out.println("alerta");
            aux=1;
        }
        else
            System.out.println("Lote aprovado");
        aux=2;
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("porcentagem: " + value);
    }
}
