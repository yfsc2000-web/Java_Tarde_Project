package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O robô A esta funcionando?");
        String roboA = sc.nextLine();
        System.out.println("O robô B esta funcionando?");
        String roboB = sc.nextLine();
        if (roboB.equals("nao") && roboB.equals("nao")) {
            System.out.println("Parar a linha");
        }
        else if (roboA.equals("nao")&& roboA.equals("nao")) {

            System.out.println("Acionar robô B");
        }
        else {
            System.out.println("continuar produção");
        }
    }
}


