package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a distância:");
        double distanciaObstaculo = 7.5;
        int velocidade = sc.nextInt();

        int distancia = max(distanciaObstaculo);
        showResult(distancia);

        sc.close();
    }

    public static int max(double distanciaObstaculo) {
        int aux;
        if (distanciaObstaculo < 5.0) {
            System.out.println("Obstáculo muito próximo! Freando o veículo.");
            aux=1;

        } else if (distanciaObstaculo >= 5.0 && distanciaObstaculo <= 15.0) {
            System.out.println("Obstáculo a uma distância moderada. Reduzindo a velocidade.");
            aux=2;

        } else {
            System.out.println("Caminho livre. Acelerando o veículo.");
            aux = 3;
        }
        return aux;
}

    public static void showResult(int value) {
        System.out.println("distancia="+value);
    }
        }
