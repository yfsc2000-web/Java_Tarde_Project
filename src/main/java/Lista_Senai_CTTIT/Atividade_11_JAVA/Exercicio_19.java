package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de ph:");
        int ph = sc.nextInt();

         if (ph<=7) {
             System.out.println("Ph em ácido");
         }
         else if (ph==7) {
             System.out.println("neutro");
         }
         else
             System.out.println("básico");
    }
}
