package ExercíciosSobreComandoWhileJava;

public class Exercicio_09 {
            public static void main(String[] args) {
                double potenciaInicial = 1000;
                double aumentoPorcentagem = 0.10;
                int horas = 5;


                double consumoTotal = 0;
                double potenciaAtual = potenciaInicial;
                int hora = 1;

                while (hora <= horas) {
                    consumoTotal += potenciaAtual;
                    potenciaAtual *= (1 + aumentoPorcentagem);
                    hora++;
                }
                System.out.println("Consumo total após " + horas + " horas: " + consumoTotal + " watts");
            }
        }




