package ExercíciosSobreComandoWhileJava;
public class Exercicio_04 {
    public static void main(String[] args) {
        int unidades=500;
        while (unidades>100){
            unidades-=10;
            System.out.println("as unidades restantes são:"+unidades);
        }
        System.out.println("Chegou a 100 unidades.");
    }
}
