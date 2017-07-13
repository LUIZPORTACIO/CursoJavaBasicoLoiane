package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao23 {
	
	public static void vetorespares(int [] vetpares) {
		
		for (int i = 0; i < vetpares.length; i++) {
			
			System.out.println("Digite o vetor " +(i+1));
			vetpares[i] = new Scanner(System.in).nextInt();
			
			if (vetpares[i]%2!=0) {
				System.out.println("Busca encerrada, vetor impar "+vetpares[i]+" na posição: "+i);
				
				break;
			}
		}
		
		System.out.print("Vetores pares: ");
		for (int i = 0; i < vetpares.length; i++) {
			if (vetpares[i]%2 == 0 && vetpares[i]!=0) {
				System.out.print(vetpares[i]+ " ");
				
			}
		}
		System.out.println("\nBusca encerrada.");
	}

	public static void main(String[] args) {
		int [] vetpares = new int[10];
		
		vetorespares(vetpares);

	}

}
