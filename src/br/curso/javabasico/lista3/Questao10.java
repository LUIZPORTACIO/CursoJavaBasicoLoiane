package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao10 {

	public static void mostrarIntervalosemInicialeFinal(int numinicial, int numfinal) {

		for (int i = numinicial; i <= numfinal; i++) {

			if (i < (numfinal - 1)) {
				System.out.print((1 + i) + " ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Digite o numero inicial:");
		int numinicial = new Scanner(System.in).nextInt();
		System.out.println("Digite o numero final:");
		int numfinal = new Scanner(System.in).nextInt();

		mostrarIntervalosemInicialeFinal(numinicial, numfinal);
	}
}
