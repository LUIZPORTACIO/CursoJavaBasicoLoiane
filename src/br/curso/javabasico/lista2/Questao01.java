package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao01 {

	public static void imprimeMaior(double n1, double n2) {
		if (n1 > n2) {
			System.out.println("O maior número é: " + n1);

		} else if (n2 > n1) {
			System.out.println("O maior número é: " + n2);

		} else {
			System.out.println("São iguais.");

		}
	}

	public static void main(String[] args) {
		System.out.println("Digite dois numeros: ");
		double n1 = new Scanner(System.in).nextDouble();
		double n2 = new Scanner(System.in).nextDouble();
		imprimeMaior(n1, n2);

	}

}
