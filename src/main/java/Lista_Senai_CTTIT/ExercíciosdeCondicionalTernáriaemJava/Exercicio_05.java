package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = sc.nextInt();
        String resultado;
        resultado = (numero%2==0 ) ?"numero par" :"impar";
        System.out.println(resultado);
    }
}
