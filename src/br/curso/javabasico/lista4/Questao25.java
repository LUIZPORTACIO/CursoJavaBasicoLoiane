package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao25 {

	public static void comparandovetores(int[] vetA, int[] vetB) {

		for (int i = 0; i < vetA.length; i++) {

			System.out.println("Digite o vetor " + (i + 1));
			vetA[i] = new Scanner(System.in).nextInt();

			if (vetA[i] % 2 == 0) {

				vetB[i] = 1;
			}
			if (vetA[i] % 2 != 0) {

				vetB[i] = 0;
			}
		}
		
		for (int i = 0; i < vetA.length; i++) {
			System.out.println("vetor A: "+vetA[i]+" posição: "+(i+1)+"\tvetor B: "+vetB[i]+" posição: "+(i+1));
			
		}
	}

	public static void main(String[] args) {
		int[] vetA = new int[10];
		int[] vetB = new int[10];
		
		comparandovetores(vetA, vetB);

	}

}
