package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto há no estoque:");
        int estoque = sc.nextInt();

        if (estoque <= 10) {
            System.out.println("Reabastecer urgente");
        }
        else if (estoque >= 30) {
            System.out.println("Normal");
        }
        else
            System.out.println("alerta");
    }
}
