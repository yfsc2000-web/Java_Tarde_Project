package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Atividade_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 0 se frente livre ou 1 se tem obstáculo:");
        int frontal = sc.nextInt();
        int direita = sc.nextInt();
        int esquerda = sc.nextInt();
        int robo = max(frontal, direita, esquerda);

        showResult(robo);

        sc.close();

    }

    public static int max(int frontal, int direita, int esquerda) {
        int aux;
        if (frontal == 0) {
            System.out.println("O robô irá seguir em frente");
            aux=1;
        } else if (direita == 0) {
            System.out.println("O robô irá virar para a direita");
            aux = 2;
        } else {
            System.out.println("O robô irá virar para a esquerda");
            aux = 3;
        }
        return aux;

    }

    public static void showResult (int value) {
        System.out.println("robo= " + value);

    }
        }


