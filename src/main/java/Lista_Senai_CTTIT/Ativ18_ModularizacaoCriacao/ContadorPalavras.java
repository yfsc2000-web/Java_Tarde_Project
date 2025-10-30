package Lista_Senai_CTTIT.Ativ18_ModularizacaoCriacao;

import java.util.Scanner;

public class ContadorPalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        String[] palavras = frase.split(" ");
        int contador = 0;

        int i = 0;
        while (i < palavras.length) {
            for (int j = 0; j < palavras[i].length(); j++) {
                if (!palavras[i].equals("")) {
                    contador ++;
                    break;
                }
            }
            i++;
        }
        System.out.println("Quantidade de palavras:" + contador);
    }
}
