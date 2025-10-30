package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso do pacote:");
        int pesoPacote = sc.nextInt();

        int peso = max(pesoPacote);

        showResult(pesoPacote);
        sc.close();
    }

    public static int max(int pesoPacote) {
        int aux;
        if (pesoPacote < 10) {
            System.out.println("Peso leve");
            aux = 1;
        }
        else if (pesoPacote >= 10 && pesoPacote <= 30) {
            System.out.println("O peso é médio");
            aux= 2;
        }
        else if (pesoPacote >= 30 && pesoPacote <=60) {
            System.out.println("Pesado");
            aux = 3;
        }
        else {
            System.out.println("Muito pesado");
            aux= 4;
    }
        return aux;
}

    public static void showResult(int value) {
        System.out.println("peso= " +value);

    }
}
