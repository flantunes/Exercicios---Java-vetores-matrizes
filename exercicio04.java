package br.com.generation.vetormatriz;

import java.util.Scanner;

public class exercicio04 {

		public static void main(String[] args) {
			
			int[][] matriz = new int[3][3];
			int soma = 0, somaDiagonal = 0;
			
			Scanner read = new Scanner(System.in);
			
			for(int l = 0; l < matriz.length; l++) {
				for(int c = 0; c < matriz[l].length; c++) {
					System.out.print("Digite o valor matriz[" + (l + 1) + "][" + (c + 1) + "]: ");
					matriz[l][c] = read.nextInt();
					
					soma += matriz[l][c];
					
					if(matriz[l] == matriz[c]) {
						somaDiagonal += matriz[l][c];
					}
				}
			}
			System.out.println("Soma: " + soma);
			System.out.println("Soma diagonal: " + somaDiagonal);
		}



	}


