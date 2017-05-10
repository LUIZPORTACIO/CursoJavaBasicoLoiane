package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao30 {
	
	public static void vetoresABC(int [] vetA, int [] vetB,int [] vetC) {
		
		int indB = 0;
		int indC = 0;
		
		
		for (int i = 0; i < vetA.length; i++) {

			System.out.println("Digite o vetor A " + (i + 1));
			vetA[i] = new Scanner(System.in).nextInt();
		}
		
		for (int i = 0; i < vetA.length; i++) {
			
			if (vetA[i]%2==0) {
				vetB[indB] = vetA[i];
				indB++;
				
			} else {
				vetC[indC] = vetA[i];
				indC++;
			}
		}
		
		System.out.print("Vetor A = ");
        for (int i=0; i<vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println();
        
        
        System.out.print("Vetor B = ");
        for (int i=0; i<indB; i++){
            System.out.print(vetB[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor C = ");
        for (int i=0; i<indC; i++){
            System.out.print(vetC[i] + " ");
        }
        System.out.println();
} 

		
	
	
	public static void main(String[] args) {
		
		int [] vetA = new int[20];
		int [] vetB = new int [vetA.length];
		int [] vetC = new int [vetA.length];
		
		vetoresABC(vetA, vetB, vetC);
		
	}
	
}
