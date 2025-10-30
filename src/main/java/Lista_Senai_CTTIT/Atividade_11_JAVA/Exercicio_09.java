package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o índice de defeito do lote?");
        int porcentagem = sc.nextInt();

        if (porcentagem>10) {
            System.out.println("alerta");
        }
        else
            System.out.println("Lote aprovado");
    }
}
