package ExercíciosSobreComandoWhileJava;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int QuantasHoras = 1;
        int SomaHoras= 0;
        while (QuantasHoras<8){
            System.out.println("Digite quanto a maquina produz por hora:");
            int maquina = sc.nextInt();
            QuantasHoras +=1;
            SomaHoras +=maquina;
        }
        System.out.println("A soma total será:"+SomaHoras);
    }
}
