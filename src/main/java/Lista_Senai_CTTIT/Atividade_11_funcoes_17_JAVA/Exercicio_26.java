package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Qual a quantidade de tinta");
        int tinta = sc.nextInt();

        if (tinta <=15){
            System.out.println("Parar");
        }
        else if (tinta>=50) {
            System.out.println("Continuar");

        }
        else
            System.out.println("Alerta");
    }
}
