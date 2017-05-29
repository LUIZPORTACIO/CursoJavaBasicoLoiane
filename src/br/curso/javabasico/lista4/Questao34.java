package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao34 {

	public static void mostrarparescadavetor(int[] vetA) {

		for (int i = 0; i < vetA.length; i++) {

			System.out.println("Digite o vetor " + (i + 1));
			vetA[i] = new Scanner(System.in).nextInt();
		}

		for (int i = 0; i < vetA.length; i++) {

			System.out.println("Valor vetor: " + vetA[i]+"\nelementos pares:  ");

			for (int j = 0; j < vetA[i]; j++) {

				
				if (j % 2 == 0) {
					System.out.println(j + " ");
				}
			}

		}

	}

	public static void main(String[] args) {

		int[] vetA = new int[10];
		mostrarparescadavetor(vetA);
	}

}
