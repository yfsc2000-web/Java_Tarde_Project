package ExercíciosSobreComandoWhileJava;

public class Exercicio_05 {
    public static void main(String[] args) {
        int maquina = 1;
        while (maquina<=120){
            System.out.println("a pressão está medindo"+maquina);
            maquina+=1;
        }
        System.out.println("você atingiu o limite da pressão");
    }
}
