package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nível de bateria:");
        int bateria = sc.nextInt();

        if (bateria < 20) {
            System.out.println("Retorno imediato");
        }
        else if (bateria >= 20 && bateria <=60) {
            System.out.println("Rota curta");
        }
        else
            System.out.println("Rota longa");

        }
    }
