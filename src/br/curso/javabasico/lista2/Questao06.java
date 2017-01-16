package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao06 {

	public static void verificaMaior(int n1, int n2, int n3) {
		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior número é: " + n1);

		} else if (n2 > n1 && n2 > n3) {
			System.out.println("O maior número é: " + n2);

		} else {
			System.out.println("O maior número é: " + n3);
		}
	}

	public static void main(String[] args) {
		System.out.println("Digite três números: ");
		int n1 = new Scanner(System.in).nextInt();
		int n2 = new Scanner(System.in).nextInt();
		int n3 = new Scanner(System.in).nextInt();

		verificaMaior(n1, n2, n3);

	}

}
