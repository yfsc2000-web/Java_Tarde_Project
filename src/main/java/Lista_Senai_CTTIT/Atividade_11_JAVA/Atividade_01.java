package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Atividade_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 0 se frente livre ou 1 se tem obstáculo:");
        int frontal = sc.nextInt();
        System.out.println("Digite 0 se a direita está livre ou 1 se tem obstáculo:");
        int direita = sc.nextInt();
        System.out.println("Digite 0 se a esquerda está livre ou 1 se tem obstáculo:");
        int esquerda = sc.nextInt();


        if (frontal==0){
            System.out.println("O robô irá seguir em frente.");
        }
        else if (direita==0) {
            System.out.println("O robô irá virar a direita.");
        } else if (esquerda==0) {
            System.out.println("O robô irá virar a esquerda.");
        }
        else;
        System.out.println("O robô está parado.");
        }
    }

