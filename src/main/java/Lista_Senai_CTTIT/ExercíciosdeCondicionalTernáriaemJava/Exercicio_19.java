package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas:");
        Double valorPorHora = sc.nextDouble();
        double horasTrabalhadas = sc.nextDouble();
        double salario = horasTrabalhadas * valorPorHora;
        String resultado = salario > 2000 ? "Salário bom" : "Salário ruim";
        System.out.println("Seu salário é: R$ " + salario);
        System.out.println(resultado);
    }
}
