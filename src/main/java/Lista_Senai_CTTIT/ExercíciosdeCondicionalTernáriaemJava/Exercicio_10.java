package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = sc.nextInt();
        if (numero % 3 == 0) {
            System.out.println("O número " + numero + " é divisível por 3.");
        } else {
            System.out.println("O número " + numero + " não é divisível por 3.");
        }
    }
}
