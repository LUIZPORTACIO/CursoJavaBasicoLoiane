package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao29 {

	public static void buildvetC(int[] vetA, int[] vetB, int[] vetC) {

		for (int i = 0; i < vetA.length; i++) {

			System.out.println("Digite o vetor A " + (i + 1));
			vetA[i] = new Scanner(System.in).nextInt();

			vetC[i] = vetA[i];
		}

		for (int i = 0; i < vetB.length; i++) {

			System.out.println("Digite o vetor B " + (i + 1));
			vetB[i] = new Scanner(System.in).nextInt();

			vetC[vetA.length + i] = vetB[i];
		}

		for (int i = 0; i < vetC.length; i++) {
			System.out.println("Vetor C: " + vetC[i] + "\tPosição: " + (i + 1));
		}
		
		System.out.println( );

		for (int i = 0; i < vetA.length; i++) {
			System.out.println("Vetor A: " + vetA[i] + "\tVetor B: " + vetB[i]);
		}
	}

	public static void main(String[] args) {
		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];
		int[] vetC = new int[2*vetA.length];

		buildvetC(vetA, vetB, vetC);
	}
}
