package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanciaObstaculo = 7.5;
        System.out.println("qual a velocidade?");
        if (distanciaObstaculo < 5.0) {

            System.out.println("Obstáculo muito próximo! Freando o veículo.");

        } else if (distanciaObstaculo >= 5.0 && distanciaObstaculo <= 15.0) {

            System.out.println("Obstáculo a uma distância moderada. Reduzindo a velocidade.");

        } else {
            System.out.println("Caminho livre. Acelerando o veículo.");

        }
    }
}