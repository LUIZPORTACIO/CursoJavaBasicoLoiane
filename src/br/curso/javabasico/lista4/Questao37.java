package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao37 {

	public static int fatorial(int valor) {
		return ((valor <= 1) ? 1 : (valor * fatorial(valor - 1)));//usando a recursividade para realizar o fatorial
	
	}

	public static void vetbfatorialdeveta(int[] vetA, int[] vetB) {

		for (int i = 0; i < vetA.length; i++) {

			System.out.println("Digite o vetor " + (i + 1));
			vetA[i] = new Scanner(System.in).nextInt();
		}

		for (int i = 0; i < vetA.length; i++) {

			vetB[i] = fatorial(vetA[i]);
		}

		for (int i = 0; i < vetA.length; i++) {

			System.out.println("Vetor A: " + vetA[i] + "\tVetor B: " + vetB[i]);
		}

	}

	public static void main(String[] args) {
		int[] vetA = new int[15];
		int[] vetB = new int[vetA.length];

		vetbfatorialdeveta(vetA, vetB);
	}

}

/* 
 * Outra maneira de calcular o fatorial
 * valorB = 0
 for(int j =1; j<= valorA; j++){
 valorB *=j;
 }
 */
