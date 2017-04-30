package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao26 {
	public static void comparandovetores(int[] vetA, int[] vetB, int[] vetC) {

		for (int i = 0; i < vetA.length; i++) {

			System.out.println("Digite o vetor A " + (i + 1));
			vetA[i] = new Scanner(System.in).nextInt();

			System.out.println("Digite o vetor B " + (i + 1));
			vetB[i] = new Scanner(System.in).nextInt();

			if (vetA[i] > vetB[i]) {
				vetC[i] = 1;
			}
			if (vetA[i] == vetB[i]) {
				vetC[i] = 0;
			}
			if (vetA[i] < vetB[i]) {
				vetC[i] = -1;
			}
		}

		for (int i = 0; i < vetC.length; i++) {
			System.out.println("Na posição: " + (i + 1) + "\nO vetor A: " + vetA[i] + "\nO vetor B: " + vetB[i]
					+ "\nO vetor C: " + vetC[i] + "\n");
		}
	}

	public static void main(String[] args) {
		int[] vetA = new int[10];
		int[] vetB = new int[10];
		int[] vetC = new int[10];

		comparandovetores(vetA, vetB, vetC);
	}

}
