package br.curso.javabasico.lista3;

import java.util.Scanner;

/*Serie de Fibonnaci*/
public class Questao15 {

	public static void serieFibonaci(int n) {

		// int n=1; - *caso infinito
		int numfib = 0;
		int numfibant = 1;

		for (int i = 0; i < n; i++) {
			if (i == 0 || i == 1) {
				numfib = 1;
				System.out.print(numfib + " ");
				// n++;
			}
			if (i > 1) {
				numfib = numfib + numfibant;
				numfibant = numfib - numfibant;

				System.out.print(numfib + " ");
				// n++;
			}

		}
	}

	public static void main(String[] args) {

		System.out.println("Digite o n-ensimo termo:");
		int n = new Scanner(System.in).nextInt();
		serieFibonaci(n);

	}

}
