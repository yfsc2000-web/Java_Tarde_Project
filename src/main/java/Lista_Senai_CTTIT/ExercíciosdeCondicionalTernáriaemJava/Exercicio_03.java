package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        String resultado;
        resultado = (idade>16) ? "Você pode votar" : "Você não pode votar";
        System.out.println("Sua idade é:" +idade+ "," +resultado);
    }
}
