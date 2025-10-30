package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código da peça (A, R, T, M): ");
        int codigo = sc.nextInt();
        String estadoPeca;
        if (codigo ==1) {
            estadoPeca = "Aprovado";
        } else if (codigo == 2) {
            estadoPeca = "Reprovado";
        } else if (codigo == 3){
            estadoPeca = "Retrabalho";
        } else if (codigo == 4) {
            estadoPeca = "Analise manual";
        } else {
            estadoPeca = "Código inválido";
        }
        System.out.println("O estado da peça é: " +estadoPeca);



    }
}
