package br.com.generation.vetormatriz;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int lancamentos[] = new int[10], maiorOcorrencia = 0;
        double soma = 0.0, media = 0.0, maiorPontuacao = 0.0;
        int i;
    
        for(i = 0; i < lancamentos.length; i++) {
            lancamentos[i] = scan.nextInt(); 
            soma += lancamentos[i];
            if(lancamentos[i] > maiorPontuacao) { 
                maiorPontuacao = lancamentos[i]; 
                maiorOcorrencia = 0;
            }
            if(lancamentos[i] == maiorPontuacao) {
                maiorOcorrencia++;
            }
        }
        
        System.out.print("O vetor gerado é: | ");
        for(i = 0; i < lancamentos.length; i++) {
            System.out.print(lancamentos[i] + " | ");
        }
        
        media = soma/lancamentos.length;
        System.out.println("\nA média aritmética dos lançamentos é de: " + media);
        System.out.println("A maior ocorrência de maior número dos lançamentos é de: " + maiorOcorrencia);
    }

	}


