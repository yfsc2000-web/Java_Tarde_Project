package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura:");
        int temperatura= sc.nextInt();

        if (temperatura < 0) {
            System.out.println("Alerta congelamento");
    }
        else if (temperatura <40) {
            System.out.println("Normal");
        }
        else
            System.out.println("Alerta superaquecimento");
    }

}
