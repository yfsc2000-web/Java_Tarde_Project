package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quanto há de energia disponível:");
        int energia = sc.nextInt();
        

        if (energia<=30) {
            System.out.println("Usar rede elétrica");
        }
        else if (energia >=70) {
            System.out.println("Usar solar");
        }
        else {
            System.out.println("Hibrido");

        }

    }

    }

