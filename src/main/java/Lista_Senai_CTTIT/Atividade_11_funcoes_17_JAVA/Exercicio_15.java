package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura da máquina:");
        double temperatura = sc.nextDouble();

        int maquina = max(temperatura);

        showResult(maquina);

        sc.close();
    }

        public static int max (double temperatura) {
        int aux;
        if (temperatura >= 90){
            System.out.println("Temperatura ok!");
            aux = 1;
        }
        else {
            System.out.println("Desligar.");
        aux=2;
    }
    return aux;
}

    public static void showResult(int value) {
        System.out.println("maquina:" +value);
    }

    }
