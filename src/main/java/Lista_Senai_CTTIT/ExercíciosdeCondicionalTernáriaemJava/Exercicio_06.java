package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua nota:");
        double nota = sc.nextDouble();
        String resultado;
        resultado = (nota >7) ? "Aprovado" : "Reprovado";
        System.out.println("Você está:" +resultado);
    }
}
