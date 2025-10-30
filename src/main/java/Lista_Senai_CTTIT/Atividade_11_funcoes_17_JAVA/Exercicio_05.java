package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite  a quantidade de horas de uso da maquina");
        int horaUso = sc.nextInt();

        int quantidade = max(horaUso);

        showResult(quantidade);

        sc.close();

    }

    public static int max(int horaUso) {
        int aux;
        if (horaUso <50){
            System.out.println("Urgência da manutenção: baixa");
            aux = 1;
        }else if (horaUso >= 500 && horaUso <= 1000) {
            System.out.println("Urgência da manutenção: MÉDIA");
            aux = 2;
        } else { // horasDeUso > 1000
            System.out.println("Urgência da manutenção: ALTA");
            aux = 3;
        }
        return aux;

    }

    public static void showResult(int value) {
        System.out.println("quantidade =" +value);

    }
}
