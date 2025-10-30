package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Está com problemas no trânsito?");
        String transito = sc.nextLine();

        if (transito.equals("Estrada bloqueada")) {
            System.out.println("Recalcular rota");
        }
        else if (transito.equals("Trânsito alto")) {
            System.out.println("Rota alternativa");
        }
        else
            System.out.println("seguir normal");


    }
}
