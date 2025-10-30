package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário:");
        int salario = sc.nextInt();
        String resultado;
        resultado = (salario > 3000) ? "Salário alto" : "Salário baixo";
        System.out.println(resultado);
    }
}
