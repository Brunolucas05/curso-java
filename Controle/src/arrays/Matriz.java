package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    private static double total;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Quantidade de alunos? ");
        int qtdAlunos = entrada.nextInt();


        System.out.printf("quantidade de notas por aluno? ");
        int qtdNotas = entrada.nextInt();


        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {

                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = entrada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }
        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("média da turma é " + media);

       for (double[] notaDoAluno: notasDaTurma){

           System.out.println(Arrays.toString(notaDoAluno));
       }
        entrada.close();
    }

}
