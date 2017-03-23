package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao09 {

	public static void ordemdecescente(int n1, int n2, int n3) {

		if ((n1 > n2 && n1 > n3) && n2 > n3) {
			System.out.println(n1 + "\n" + n2 + "\n" + n3);

		} else if ((n1 > n2 && n1 > n3) && n3 > n2) {
			System.out.println(n1 + "\n" + n3 + "\n" + n2);
		} else if ((n2 > n1 && n2 > n3) && n1 > n3) {
			System.out.println(n2 + "\n" + n1 + "\n" + n3);
		} else if ((n2 > n1 && n2 > n3) && n3 > n1) {
			System.out.println(n2 + "\n" + n3 + "\n" + n1);
		} else if ((n3 > n1 && n3 > n2) && n1 > n2) {
			System.out.println(n3 + "\n" + n1 + "\n" + n2);
		} else if ((n3 > n1 && n3 > n2) && n2 > n1) {
			System.out.println(n3 + "\n" + n2 + "\n" + n1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Digite três numeros, para colocarmos na ordem decrescente");
		int n1 = new Scanner(System.in).nextInt();
		int n2 = new Scanner(System.in).nextInt();
		int n3 = new Scanner(System.in).nextInt();

		System.out.println("Números em ordem decrescente");

		ordemdecescente(n1, n2, n3);

	}
}
