package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos defeitos?");
       int defeitos = sc.nextInt();

       if (defeitos>=20) {
           System.out.println("Reprovar");
       } else if (defeitos <=10) {
           System.out.println("Aprovar");
       }
       else
           System.out.println("Retrabalho");

       }
    }
