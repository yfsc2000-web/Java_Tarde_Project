package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nível do defeito (alto, médio, baixo): ");
        String nivelDefeito = sc.nextLine();

        int defeituoso = max(nivelDefeito);

        showResult(defeituoso);

        sc.close();

    }

    public static int max(String nivelDefeito) {
        int aux;
        if (nivelDefeito.equals("alto")) {
            System.out.println("Defeito visível");
            aux = 1;
        } else if (nivelDefeito.equals("médio")) {
            System.out.println("Defeito microscópico");
            aux = 2;
        } else {
            System.out.println("Defeito ausente");
            aux = 3;
    }
        return aux;
}

    public static void showResult(int value) {
        System.out.println("defeituoso:" +value);

    }
    }