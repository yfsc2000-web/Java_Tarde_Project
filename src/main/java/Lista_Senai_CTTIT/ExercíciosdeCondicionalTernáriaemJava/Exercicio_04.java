package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius:");
        double temperatura = sc.nextDouble();
        String resultado;
        resultado = (temperatura < 18) ? "Frio" : " Quente";
        System.out.println("Está" +resultado);
    }
}
