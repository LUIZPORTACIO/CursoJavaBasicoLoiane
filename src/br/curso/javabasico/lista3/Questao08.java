package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao08 {
	public static void calculosSomaMedia() {

		int num;
		int sum = 0;
		int media;
		
		for (int cont = 0; cont < 5; cont++) {
			System.out.println("Digite um número:");

			num = new Scanner(System.in).nextInt();

			sum += num;
		}
		media = sum / 5;
		System.out.println("A soma: " + sum + " \ta media: " + media);

	}

	public static void main(String[] args) {
		calculosSomaMedia();

	}

}
