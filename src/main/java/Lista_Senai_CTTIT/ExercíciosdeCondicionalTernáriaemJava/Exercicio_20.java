package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite um número;");
        int numero = sc.nextInt();
        String resultado = (numero % 2 == 0) ? "par" : "ímpar";
        System.out.println(" o número é" + resultado);

}
    }
