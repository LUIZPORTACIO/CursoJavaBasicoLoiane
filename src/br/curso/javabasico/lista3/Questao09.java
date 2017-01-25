package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao09 {

	public static void mostrarImpar(int numinicial, int numfinal) {

		for (int i = numinicial; i <= numfinal; i++) {

			if (i % 2 != 0) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Digite o numero inicial:");
		int numinicial = new Scanner(System.in).nextInt();
		System.out.println("Digite o numero final:");
		int numfinal = new Scanner(System.in).nextInt();

		mostrarImpar(numinicial, numfinal);
	}

}
