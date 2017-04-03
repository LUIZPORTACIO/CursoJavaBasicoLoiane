package br.curso.javabasico.lista4;

public class Questao13 {

	public static void somamultiploscincovetores() {

		int[] vetorA = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			if ((vetorA[i] % 5) == 0) {

				System.out.print(vetorA[i] + " ");
				sum += vetorA[i];
			}
		}

		System.out.println("\nA soma dos vetores multiplos de 5: "+sum+"\nO tamanho vetor A: " + vetorA.length);
	}

	public static void main(String[] args) {
		somamultiploscincovetores();

	}

}
