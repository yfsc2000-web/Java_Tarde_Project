package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nivel de energia (%)");
        int energia = sc.nextInt();
        
        if (energia < 30) {
            System.out.println("Modo econômico");
        } else if (energia <=70) {
            System.out.println("Modo normal");
            
        } else if (energia >70) {
            System.out.println("Modo turbo");

        }
    }
}
