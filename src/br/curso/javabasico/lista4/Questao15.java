package br.curso.javabasico.lista4;

public class Questao15 {

	public static void porcetagemparesimparesvetores() {

		int[] vetorA = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double cont = 0.0;

		for (int i = 0; i < vetorA.length; i++) {
			if ((vetorA[i] % 2) == 0) {
				cont++;

			}
		}
		System.out.println("\nDos vetores: "+"\nA porcentagem de pares: " + ((cont * 100) / vetorA.length) + "\nA porcentagem de impares: "
				+ (100 - ((cont * 100) / vetorA.length)));

	}

	public static void main(String[] args) {
		porcetagemparesimparesvetores();

	}

}
