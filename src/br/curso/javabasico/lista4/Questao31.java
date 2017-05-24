package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao31 {

	public static void separarvetor(int[] vetA, int[] vetB) {

		int posA = 0;
		int posB = 0;

		for (int i = 0; i < vetA.length; i++) {

			System.out.println("Digite o vetor " + (i + 1));
			vetA[i] = new Scanner(System.in).nextInt();

			if (vetA[i] % 2 == 0) {
				vetB[posB] = vetA[i];
				posB++;
			} else {
				vetA[posA] = vetA[i];
				posA++;
			}
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < posA; i++) {
			System.out.print(vetA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B: ");
		for (int i = 0; i < posB; i++) {
			System.out.print(vetB[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] vetA = new int[20];
		int[] vetB = new int[vetA.length];

		separarvetor(vetA, vetB);

	}

}
