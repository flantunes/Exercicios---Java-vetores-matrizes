package br.com.generation.vetormatriz;

import java.util.Scanner;

public class exercicio03 {
	
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] m1 = new int[4][6], m2 = new int[4][6], n1 = new int[4][6], n2 = new int[4][6];
        int l, c;

        for (l = 0; l < 4; l++) {
            for (c = 0; c < 6; c++) {
                System.out.println("Digite o n1: ");
                n1[l][c] = ler.nextInt();
                
                System.out.println("Digite o n2: ");
                n2[l][c] = ler.nextInt();
                
                m1[l][c] = n1[l][c] + n2[l][c];
                m2[l][c] = n1[l][c] - n2[l][c];
                
                
            }
        }
        System.out.println("=======================Matriz m1=========================");
        for (l = 0; l < 4; l++) {
            for (c = 0; c < 6; c++) {
                System.out.print(m1[l][c] + " | ");
                
            }
        
        }
        System.out.println("\n==============================================");
        System.out.println("\n");
        System.out.println("\n===========================Matriz m2==========================");
        for (l = 0; l < 4; l++) {
            for (c = 0; c < 6; c++) {
                System.out.print(m2[l][c] + " | ");
                
            }
        
        }
        System.out.println("\n=====================================================================================");
    }

}
	