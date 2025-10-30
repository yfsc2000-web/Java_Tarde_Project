package ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercico_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura:");
        int temperatura = sc.nextInt();
        String resultado;
        resultado=(temperatura > 30) ? "O clima está quente" : "O clima está frio";
        System.out.println(resultado);

    }
}
