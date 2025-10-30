package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;
import java.util.Scanner;
public class Exercicio_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, insira sua função (engenheiro, supervisor ou operador):");
        int engenheiro = sc.nextInt();
        int supervisor = sc.nextInt();
        int operador = sc.nextInt();

        int obra = max(engenheiro, supervisor, operador);

        showResult(obra);

        sc.close();
    }

    public static int max(int engenheiro, int supervisor, int operador) {
        int aux;
        if (engenheiro == engenheiro) {
            System.out.println("Acesso Total: Todas as áreas e controles liberados.");
            aux = 1;
        } else if (supervisor == operador) {
            System.out.println("Acesso Parcial: Áreas restritas e monitoramento liberados.");
            aux = 2;
        } else if (supervisor == supervisor) {
            System.out.println("Acesso Restrito: Apenas a operação de máquinas básicas liberada.");
            aux= 3;
        } else {
            System.out.println("Cargo inválido. Acesso negado.");
            aux = 4;
        }
        return aux;
    }


    public static void showResult(int value) {
        System.out.println("obra =" +value);

    }
}

