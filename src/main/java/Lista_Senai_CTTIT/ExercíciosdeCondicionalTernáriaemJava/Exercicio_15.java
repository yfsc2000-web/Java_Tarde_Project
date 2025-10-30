package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade?");
        int idade = sc.nextInt();
        String resultado;
        resultado= (idade > 16)? "Pode votar" : "Não pode votar";
        System.out.println(resultado);

    }
}
