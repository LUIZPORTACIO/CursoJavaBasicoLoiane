package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao05 {

	public static void contAno(Double popA, Double popB, Double txA, Double txB) {
		if (popA < popB) {

			int numano = 0;
			while (popA <= popB) {
				popA = popA + (popA * (txA / 100));
				popB = popB + (popB * (txB / 100));
				numano++;

				System.out.println("Foram: " + numano + " anos" + "\nPopulação A: " + popA + "\tPopulação B: " + popB);

			}

		} else {
			System.out.println("A população A já é maior ou igual a população B");
		}

	}

	public static void main(String[] args) {
		System.out.println("Digite a população A e a sua taxa de crescimento.");
		Double popA = new Scanner(System.in).nextDouble();
		Double txA = new Scanner(System.in).nextDouble();
		System.out.println("Digite a população B e a sua taxa de crescimento.");
		Double popB = new Scanner(System.in).nextDouble();
		Double txB = new Scanner(System.in).nextDouble();
		System.out.println("Calculando quando a população A será maior que a população B.");
		contAno(popA, popB, txA, txB);
	}

}
