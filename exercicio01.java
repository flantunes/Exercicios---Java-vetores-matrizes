package br.com.generation.vetormatriz;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        double[] notas = new double[5];
        double maiorNota = 0.0;
        int i;
        System.out.println("Digite as 4 notas do aluno: \n");
        for (i = 0; i < 4; i++) {
            notas[i] = ler.nextDouble();
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }
        System.out.println("===Os valores da pontuação===");
        System.out.print("[");
        for (i = 0; i < 4; i++) {

            System.out.print(notas[i] + " ");
            
        }
        System.out.print("]");

        System.out.println("\nA maior pontuação é: " + maiorNota);

    }


	}


