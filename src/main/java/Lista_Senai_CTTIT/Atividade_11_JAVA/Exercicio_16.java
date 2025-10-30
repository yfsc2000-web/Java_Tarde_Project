package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nível do defeito (alto, médio, baixo): ");
        String nivelDefeito = sc.nextLine();

        if (nivelDefeito.equals("alto")) {
            System.out.println("Defeito visível");
        } else if (nivelDefeito.equals("médio")) {
            System.out.println("Defeito microscópico");
        } else {
            System.out.println("Defeito ausente");
    }
}
    }