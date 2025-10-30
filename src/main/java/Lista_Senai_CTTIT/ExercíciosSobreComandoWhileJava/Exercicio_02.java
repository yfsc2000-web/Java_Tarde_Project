package ExercíciosSobreComandoWhileJava;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;


        while (contador <=24) {
            System.out.println("Qual a temperatura?");
            int temperatura = sc.nextInt();
            contador ++;
        }
    }
}
