package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao27 {

	public static void conversorvetores(int[] vetA, char[] vetB) {

		for (int i = 0; i < vetA.length; i++) {

			System.out.println("Digite o vetor A " + (i + 1));
			vetA[i] = new Scanner(System.in).nextInt();

			if (vetA[i] < 7) {
				vetB[i] = 'a';
			}
			if (vetA[i] == 7) {
				vetB[i] = 'b';
			}
			if (vetA[i] > 7 && vetA[i] < 10) {
				vetB[i] = 'c';
			}
			if (vetA[i] == 10) {
				vetB[i] = 'd';
			}
			if (vetA[i] > 10) {
				vetB[i] = 'e';
			}

		}
		for (int i = 0; i < vetB.length; i++) {
			System.out.println("A posição: " + (i + 1) + "\nVetorA: " + vetA[i] + "\nVetorB: " + vetB[i] + "\n");

		}
	}

	public static void main(String[] args) {

		int[] vetA = new int[10];
		char[] vetB = new char[10];

		conversorvetores(vetA, vetB);

	}
}
