package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quanto há de material em %:");
        int porcentagem = sc.nextInt();

        int material = max(porcentagem);

        showResult(material);
        sc.close();
    }

    public static int max(int porcentagem) {
        int aux;

        if (porcentagem < 20) {
            System.out.println("Trocar");
            aux = 1;
        } else
            System.out.println("Continuar");
        aux = 2;

        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Material: " + value);

    }
}

