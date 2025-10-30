package Lista_Senai_CTTIT.Ativ18_ModularizacaoCriacao;

import java.util.Scanner;

public class ClassificadorIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade <=12) {
            System.out.println("Classificação infantil");
        } else if (idade <= 17) {
            System.out.println("Classificação adolescente");
        }
        else if (idade <= 59) {
            System.out.println("Classificação adulto");
        } else {
            System.out.println("Classificação idoso");
    }
}
    }
