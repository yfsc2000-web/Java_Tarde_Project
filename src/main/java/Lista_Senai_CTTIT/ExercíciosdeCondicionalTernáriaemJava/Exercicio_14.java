package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota:");
        int nota = sc.nextInt();
        String resultado;
        resultado= (nota > 7)? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }

}
