package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura:");
        int temperatura = sc.nextInt();

        int temp = max(temperatura);

        showResult(temp);
        sc.close();

    }

    public static int max(int temperatura) {
        int aux;

        if (temperatura < 0) {
            System.out.println("Alerta congelamento");
            aux=1;
    }
        else if (temperatura <40) {
            System.out.println("Normal");
            aux=2;
        }
        else
            System.out.println("Alerta superaquecimento");
        aux=3;
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Temperatura; "+ value);
    }

}
