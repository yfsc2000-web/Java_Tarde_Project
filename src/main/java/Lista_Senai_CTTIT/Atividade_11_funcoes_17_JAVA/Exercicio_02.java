package Lista_Senai_CTTIT.Atividade_11_funcoes_17_JAVA;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        int opcao = lerOpcao();
        String estado = obterEstadoLote(opcao);
        mostrarEstado(estado);
    }

    public static int lerOpcao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do estado do lote (1=Aprovado, 2=Reprovado, 3=Retrabalho, 4=Análise): ");
        int opcao = sc.nextInt();
        sc.close();
        return opcao;
    }


    public static String obterEstadoLote(int opcao) {
        if (opcao == 1) return "Aprovado";
        else if (opcao == 2) return "Reprovado";
        else if (opcao == 3) return "Retrabalho";
        else if (opcao == 4) return "Análise manual";
        else return "Opção inválida";
    }


    public static void mostrarEstado(String estado) {
        System.out.println("O estado da peça é: " + estado);

        }
    }





