package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        if (idade > 18) {
            System.out.println("Maior de idade");
        }
        else if (idade < 18) {
            System.out.println("Menor de idade");
    }
}
}
