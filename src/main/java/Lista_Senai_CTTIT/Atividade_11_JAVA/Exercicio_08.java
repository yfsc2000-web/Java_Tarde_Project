package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quanto há de material em %:");
        int porcentagem = sc.nextInt();

        if (porcentagem < 20) {
            System.out.println("Trocar");
    }
        else
            System.out.println("Continuar");
}
    }
