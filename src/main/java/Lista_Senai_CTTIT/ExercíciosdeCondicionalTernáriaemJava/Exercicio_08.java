package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        if (idade<=12){
            System.out.println("infantil");
        }
        else if (idade<=18) {
            System.out.println("juvenil");

        }
        else{
            System.out.println("adulto");
    }
}
}
