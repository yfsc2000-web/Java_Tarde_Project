package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantas peças produzidas por hora:");
        int producao = sc.nextInt();

        if (producao < 50) {
            System.out.println("Baixo");

        }
        else if (producao<= 100) {
            System.out.println("desempenho regular");

    }
        else
            System.out.println("Otimo desempenho");
    }
}



