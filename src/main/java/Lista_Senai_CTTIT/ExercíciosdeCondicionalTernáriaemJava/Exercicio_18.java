package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = sc.nextInt();
        String resultado;
        resultado = (n1>n2) ? "O primeiro numéro é maior" : "O segundo número é menor";
        System.out.println(resultado);
        resultado = (n2==n1) ? "Valores iguais" : "Valores incompativeis ";
        System.out.println(resultado);

    }
}
