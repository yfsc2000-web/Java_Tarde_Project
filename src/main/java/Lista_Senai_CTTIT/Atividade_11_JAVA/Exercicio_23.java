package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite  a rede:");
        int rede = sc.nextInt();

        if (rede >=70){
            System.out.println("Bloquear acesso");
    }
        else if (rede <=30) {
            System.out.println("normal");
        }
        else
            System.out.println("alerta");

    }
    }
