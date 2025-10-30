package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a carga:");
        int carga = sc.nextInt();

        if (carga <=500) {
            System.out.println("Permitido");
        }
        else if (carga <=1000) {
            System.out.println("Alerta");

        }
        else{
            System.out.println("Proibido");
    }
}
    }