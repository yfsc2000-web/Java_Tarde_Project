package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário:");
        double salario = sc.nextDouble();
        String resultado;
        resultado = (salario > 5.000) ? " 20%" : "10%";
        System.out.println("O imposto será de:" +resultado);
    }
}
