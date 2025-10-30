package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura da máquina:");
        Double temperatura = sc.nextDouble();

        if (temperatura >= 90){
            System.out.println("Temperatura ok!");
        }
        else
            System.out.println("Desligar.");

    }

}
