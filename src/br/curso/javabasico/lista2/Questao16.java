package br.curso.javabasico.lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao16 {

	public static void eSegundoGrau(int a) {

		if (a == 0) {
			System.out.println("Não é equação de segundo grau");

		} else {
			int b = new Scanner(System.in).nextInt();
			int c = new Scanner(System.in).nextInt();
			calculaDelta(a, b, c);
		}
	}

	public static void calculaDelta(int a, int b, int c) {
		double delta = Math.pow(b, 2) - 4 * (a * c);

		if (delta >= 0) {
			double raiz1 = (-b + Math.sqrt(delta)) / 2;
			String r1 = String.format("%.2f", raiz1); /* Deixando só com dois digitos um double*/

			double raiz2 = (-b - Math.sqrt(delta)) / 2;
			String r2 = String.format("%.2f", raiz2);

			System.out.println("As raizes da equação de segundo grau é: " + r1 + " e " + r2);

		} else {
			System.out.println("A equação não possui raizes.");
		}
	}

	public static void main(String[] args) {
		System.out.println("Digite os coeficientes da equação: ");
		int a = new Scanner(System.in).nextInt();
		eSegundoGrau(a);
	}
}
