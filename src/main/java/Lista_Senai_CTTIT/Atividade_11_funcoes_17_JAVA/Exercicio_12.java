package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean crachaValido = true;
        boolean capaceteSeguranca = true;
        boolean horarioTurno = true;

        boolean acesso = max(crachaValido, capaceteSeguranca, horarioTurno);

        showResult(acesso);
        sc.close();
    }

    public static boolean max(boolean crachaValido, boolean capaceteSeguranca, Boolean horarioTurno) {
        if (crachaValido && capaceteSeguranca && horarioTurno) {
            System.out.println("Acesso permitido.");
            return true;
        } else {
            System.out.println("Acesso negado.");
            return false;
        }


    }

    public static void showResult(boolean acesso) {
        System.out.println("acesso: " + acesso);

    }
}
