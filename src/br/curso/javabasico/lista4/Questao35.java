package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao35 {

	public static void mostrardivisoresvetores(int[] vetores) {

		for (int i = 0; i < vetores.length; i++) {

			System.out.println("Digite o vetor " + (i + 1));
			vetores[i] = new Scanner(System.in).nextInt();
		}

		for (int i = 0; i < vetores.length; i++) {

			System.out.print("Valor vetor: " + vetores[i] + " divisores: ");

			for (int j = 1; j <= vetores[i]; j++) {

				if (vetores[i] % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println( );

		}

	}

	public static void main(String[] args) {

		int[] vetores = new int[10];

		mostrardivisoresvetores(vetores);
	}

}
