package Lista_Senai_CTTIT.Atividade_11_JAVA;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite  a quantidade de horas de uso da maquina");
        int horadeuso = sc.nextInt();
        if (horadeuso <50){
            System.out.println("Urgência da manutenção: baixa");
        }else if (horadeuso >= 500 && horadeuso <= 1000) {
            System.out.println("Urgência da manutenção: MÉDIA");
        } else { // horasDeUso > 1000
            System.out.println("Urgência da manutenção: ALTA");
        }

    }
}
