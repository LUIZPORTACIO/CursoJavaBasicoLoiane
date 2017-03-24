package br.curso.javabasico.lista4;

public class Questao01 {

	public static void ovetor() {

		int[] vetorA = new int[] { 1, 2, 3, 4, 5 };

		int[] vetorB = new int[5];

		vetorB = vetorA;

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("O vetor A: " + vetorA[i] + "\tO vetor B: " + vetorB[i]);

		}

		System.out.println("\nO tamanho vetor A: " + vetorA.length + "\tO tamanho vetor B: " + vetorB.length);

	}

	public static void main(String[] args) {
		ovetor();

	}

}
