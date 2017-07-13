package br.curso.javabasico.lista4;

public class Questao06 {

	public static void somavetores() {
		int[] vetorA = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] vetorB = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];

			System.out.println("O vetor A: " + vetorA[i] + "\tO vetor B: " + vetorB[i] + "\tO vetor C: " + vetorC[i]);
		}

		System.out.println("\nO tamanho vetor A: " + vetorA.length + "\tO tamanho vetor B: " + vetorB.length
				+ "\tO tamanho vetor C: " + vetorC.length);
	}

	public static void main(String[] args) {
		somavetores();

	}

}
