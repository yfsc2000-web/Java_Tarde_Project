package Lista_Senai_CTTIT.Atividade_11_JAVA;
import java.util.Scanner;
public class Exercicio_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o erro presente:");
        String erro = sc.nextLine();

        if (erro.equals("critico")) {
            System.out.println("Parar linha de produção.");
        } else if (erro.equals("moderado")) {
            System.out.println("Acionar manutenção.");
        } else if (erro.equals("nenhum")) {
            System.out.println("Continuar produção.");
        } else {
            System.out.println("Tipo de erro desconhecido.");
        }
    }
}