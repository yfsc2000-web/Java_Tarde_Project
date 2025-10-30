package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        String resultado;
        resultado = (idade > 18) ? "maior de idade" : "menor de idade";
        System.out.println("Você tem " +idade+" anos, e é " +resultado);
    }
}
