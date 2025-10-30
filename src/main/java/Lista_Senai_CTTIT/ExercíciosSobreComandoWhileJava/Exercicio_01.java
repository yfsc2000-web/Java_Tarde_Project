package ExercíciosSobreComandoWhileJava;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        while (contador <= 100) {
            System.out.println("Quantas peças foram produzidas?");
            int numero = sc.nextInt();
            contador +=1;
        }
        System.out.println("O programa atingiu 100 peças.");
    }
}
