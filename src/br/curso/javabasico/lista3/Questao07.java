package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao07 {

	public static void omaior() {

		int primeironum = new Scanner(System.in).nextInt();
		int proxnum = 0;
		for (int cont = 0; cont < 4; cont++) {
			System.out.println("Digite o proximo número:");

			proxnum = new Scanner(System.in).nextInt();
		}
		if (proxnum > primeironum) {
			System.out.println("O maior número é:" + proxnum);
		} else {
			System.out.println("O maior número é:" + primeironum);
		}
	}

	public static void main(String[] args) {
		System.out.println("Digite o primeiro número");

		omaior();
	}

}
