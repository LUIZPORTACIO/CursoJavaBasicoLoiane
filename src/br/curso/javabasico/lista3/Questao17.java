package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao17 {

	public static void calcfatorial(int numfator) {
		int i = numfator;
		int fatorial = 1;

		while (i > 0) {
			fatorial *= i;
			i--;
		}

		System.out.println("\nO fatorial de " + numfator + " é " + fatorial);
	}

	public static void main(String[] args) {
		System.out.println("Informe um numero para fatorar");
		int numfator = new Scanner(System.in).nextInt();

		calcfatorial(numfator);
	}
}
