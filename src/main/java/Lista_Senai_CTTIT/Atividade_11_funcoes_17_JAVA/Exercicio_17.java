package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O robô A esta funcionando?");
        String roboA = sc.nextLine();
        System.out.println("O robô B esta funcionando?");
        String roboB = sc.nextLine();

        int robo = max(roboA, roboB);
        showResult(robo);
        sc.close();

    }

    public static int max(String roboA, String roboB) {
        int aux;
        if (roboB.equals("nao") && roboB.equals("nao")) {
            System.out.println("Parar a linha");
            aux = 1;
        }
        else if (roboA.equals("nao")&& roboA.equals("nao")) {
            System.out.println("Acionar robô B");
            aux= 2;
        }
        else {
            System.out.println("continuar produção");
            aux=3;
        }
        return aux;
    }
    public static void showResult(int value) {
        System.out.println("robo:" +value);

    }
}


