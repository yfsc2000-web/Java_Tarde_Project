package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercico_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a velocidade?");
        int itens = 35;

        if (itens <= 20) {
            System.out.println("Velocidade: Lenta");

        } else if (itens <= 50) {
            System.out.println("Velocidade: Média");

        } else {
            System.out.println("Velocidade: Rápida");
        }
    }
}
