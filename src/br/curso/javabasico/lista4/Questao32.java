package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao32 {
	
	public static void tabuadavetor(int [] vetA) {
		
		for (int i = 0; i < vetA.length; i++) {

			System.out.println("Digite o vetor " + (i + 1));
			vetA[i] = new Scanner(System.in).nextInt();

		}
		
		System.out.println("Tabuada dos vetores");
		
		int n = 10; 
		for (int i = 0; i < vetA.length; i++) {
			
			System.out.println( "Tabuada de "+ vetA[i]);
			
			for (int j = 1; j <= n; j++) {
				
				System.out.println(vetA[i] +" x "+j+" = "+ (vetA[i]*j)+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int [] vetA = new int[5];
		
		tabuadavetor(vetA);
	}
}
