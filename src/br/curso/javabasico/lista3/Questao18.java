package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao18 {

	public static void eprimo(int num) {
		boolean eprimo = true;
		int divisor = 0;

		for (int i = 2; i <= num; i++) {

			if ((num % i == 0) && (num != i)) {
				eprimo = false;
				divisor = i;

				System.out.print(divisor + " ");
			}
		}

		if (eprimo) {
			System.out.println("Número primo");
		} else {
			System.out.println("Números divisiveis. Ele não é primo");
		}
	}

	public static void main(String[] args) {
		System.out.println("Digite um número");
		int num = new Scanner(System.in).nextInt();

		eprimo(num);

	}

}
