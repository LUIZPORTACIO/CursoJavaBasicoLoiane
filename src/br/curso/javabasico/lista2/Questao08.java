package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao08 {
	public static void verificaMenorPreco(double p1, double p2, double p3) {
		if (p1 < p2 && p1 < p3) {
			System.out.println("O menor preço é: " + p1);

		} else if (p2 < p1 && p2 < p3) {
			System.out.println("O menor preço é: " + p2);

		} else {
			System.out.println("O menor preço é: " + p3);
		}

	}

	public static void main(String[] args) {
		System.out.println("Digite os três preços dos produtos: ");
		double p1 = new Scanner(System.in).nextDouble();
		double p2 = new Scanner(System.in).nextDouble();
		double p3 = new Scanner(System.in).nextDouble();
		verificaMenorPreco(p1, p2, p3);
	}

}
