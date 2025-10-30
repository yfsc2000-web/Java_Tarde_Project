package Lista_Senai_CTTIT.ExercíciosdeCondicionalTernáriaemJava;

import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();
        String resultado;
        resultado= (numero% 5==0)?"É multiplo" : "Não é multiplo";
        System.out.println(resultado);

    }
}
