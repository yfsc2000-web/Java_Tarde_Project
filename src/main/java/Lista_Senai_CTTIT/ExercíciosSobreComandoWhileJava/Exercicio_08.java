package ExercíciosSobreComandoWhileJava;

import java.util.Random;

public class Exercicio_08 {
    public static void main(String[] args) {
       int pecas = 0;
       int falhas = 0;
       while (pecas <10000&& falhas<50 ){
           pecas = pecas + 50;
           falhas = falhas+1;
           System.out.println("peças produzidas " + pecas+ " falhas " + falhas);
       }
        System.out.println("Produção encerrada, total de falhas "+ falhas);
    }
}
