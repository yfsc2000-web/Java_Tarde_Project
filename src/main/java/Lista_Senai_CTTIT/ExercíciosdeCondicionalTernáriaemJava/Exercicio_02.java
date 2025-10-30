package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite um numero");
        int numero = sc.nextInt();
        String resultado ;
        resultado =(numero <0)? "numero negativo" : "numero positivo";
        System.out.println("resultado é:" +resultado);
    }
}
