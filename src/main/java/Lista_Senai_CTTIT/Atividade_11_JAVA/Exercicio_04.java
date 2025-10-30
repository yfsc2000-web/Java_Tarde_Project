package Lista_Senai_CTTIT.Atividade_11_JAVA;
import java.util.Scanner;
public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, insira sua função (engenheiro, supervisor ou operador):");
        String cargo = sc.nextLine();
        if (cargo.equalsIgnoreCase ("engenheiro")) {
            System.out.println("Acesso Total: Todas as áreas e controles liberados.");
        } else if (cargo.equalsIgnoreCase("supervisor")) {
            System.out.println("Acesso Parcial: Áreas restritas e monitoramento liberados.");
        } else if (cargo.equalsIgnoreCase("operador")) {
            System.out.println("Acesso Restrito: Apenas a operação de máquinas básicas liberada.");
        } else {
            System.out.println("Cargo inválido. Acesso negado.");
        }
    }
}

