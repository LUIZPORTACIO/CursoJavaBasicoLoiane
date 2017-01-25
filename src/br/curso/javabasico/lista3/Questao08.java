package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao08 {
	public static void calculosSomaMedia() {

		int sum = 0;
		for (int cont = 0; cont < 5; cont++) {
			System.out.println("Digite um número:");

			int num = new Scanner(System.in).nextInt();

			sum += num;
		}

		int soma = sum;
		int media = soma / 5;
		System.out.println("A soma: " + soma + " a media: " + media);

	}

	public static void main(String[] args) {
		calculosSomaMedia();

	}

}
