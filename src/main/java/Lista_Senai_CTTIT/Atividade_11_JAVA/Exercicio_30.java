package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_30 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Qual a temperatura?");
        int temperatura = sc.nextInt();

        if (temperatura<=80) {
            System.out.println("Desligar os servidores");
        }
        else if (temperatura>=60) {
            System.out.println("normal");
        }
        else
            System.out.println("Resfriamento extra'");
    }
}
