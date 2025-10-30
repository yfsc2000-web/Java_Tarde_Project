package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();
        String resultado;
        resultado = numero > 0 ? "Positivo" : (numero < 0 ? "Negativo" : "Zero");
        System.out.println(resultado);
    }
}
