package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nivel de energia (%)");
        int energia = sc.nextInt();

        int nivel =  max(energia);
        showResult( nivel);

        sc.close();

    }
    public static int max(int energia) {
        int aux;
        if (energia < 30) {
            System.out.println("Modo econômico");
            aux = 1;
        } else if (energia <=70) {
            System.out.println("Modo normal");
            aux = 2;

        } else if (energia >70) {
            System.out.println("Modo turbo");
            aux = 3;
        } else
            aux = 4;
        return aux;
    }
    public static void showResult(int value) {
        System.out.println("nivel =" +value);
    }
}
