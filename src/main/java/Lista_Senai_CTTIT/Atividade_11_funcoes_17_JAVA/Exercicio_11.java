package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nível de bateria:");
        int bateria = sc.nextInt();

        int nivel = max(bateria);

        showResult(nivel);
        sc.close();

    }

    public static int max(int bateria) {
        int aux;

        if (bateria < 20) {
            System.out.println("Retorno imediato");
            aux=1;
        }
        else if (bateria >= 20 && bateria <=60) {
            System.out.println("Rota curta");
            aux=2;
        }
        else
            System.out.println("Rota longa");
        aux=3;
        return aux;

        }

    public static void showResult(int value) {
        System.out.println("Bateria: "+value);
    }
    }
