package ExercíciosSobreComandoWhileJava;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Random randomn = new Random();
        int falhas = 0;
        while (falhas < 5) {
            boolean falha = randomn.nextBoolean();
            if (falha) {
                falhas++;
                System.out.println("Falha detectada. Consecutivas:" +falhas);
            }
            else {
                falhas = 0;
                System.out.println("Sensor nirmalizado. Reiniciando contagem de falhas.");
            }
        }

    }
}
