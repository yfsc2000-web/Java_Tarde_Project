package ExercíciosSobreComandoWhileJava;

public class Exercicio_07 {
    public static void main(String[] args) {
        int minutos = 2;
        while (minutos<=1000){
            System.out.println("A cada dois minutos a velocidade será: "+minutos);
            minutos+=2;
        }
        System.out.println("A velocidade máxima foi atingida.");
    }
}
