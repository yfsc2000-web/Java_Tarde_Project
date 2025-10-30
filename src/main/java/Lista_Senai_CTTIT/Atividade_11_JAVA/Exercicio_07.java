package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso do pacote:");
        int pesoPacote = sc.nextInt();

        if (pesoPacote < 10) {
            System.out.println("Peso leve");
        }
        else if (pesoPacote >= 10 && pesoPacote <= 30) {
            System.out.println("O peso é médio");
        }
        else if (pesoPacote >= 30 && pesoPacote <=60) {
            System.out.println("Pesado");
        }
        else if (pesoPacote >=60) {
            System.out.println("Muito pesado");
    }
}
}
