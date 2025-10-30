package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a intensidade elétrica:");
        int intensidade = sc.nextInt();

        if (intensidade <100) {
            System.out.println("Fraca");
        }
        else if (intensidade >200) {
            System.out.println("Forte");
        }
        else
            System.out.println("Média");
    }
}
