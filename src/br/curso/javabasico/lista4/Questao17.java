package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao17 {

	public static void maioresde35(int[] grupidade) {
		int cont = 0;

		System.out.println("Digite a idade das pessoas de seu grupo: ");
		for (int i = 0; i < grupidade.length; i++) {
			grupidade[i] = new Scanner(System.in).nextInt();

			if (grupidade[i] > 35) {
				cont++;
			}

		}
		System.out.println("A quantidade de pessoas no grupo que são maiores de 35 anos são: " + cont);
	}

	public static void main(String[] args) {

		int[] grupidade = new int[10];

		maioresde35(grupidade);
	}

}
