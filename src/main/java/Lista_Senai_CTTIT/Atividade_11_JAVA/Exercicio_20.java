package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o horário:");
        int hora = sc.nextInt();
        if (hora<=12) {
            System.out.println("manhã");
        }
        else if (hora>=18) {
            System.out.println("noite");
        }
        else
            System.out.println("tarde");
    }
}
