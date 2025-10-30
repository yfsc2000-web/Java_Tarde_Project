package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de particulas:");
        int ar = sc.nextInt();

        if (ar<=50) {
            System.out.println("Bom");
        } else if (ar<=100) {
            System.out.println("moderado");
        }
        else if (ar>200) {
            System.out.println("Crítico");
        } else {
            System.out.println("ruim");
        }

    }
}

