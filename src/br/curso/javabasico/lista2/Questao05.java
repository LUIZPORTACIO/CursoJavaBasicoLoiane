package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao05 {

	public static void aprovacao(double np1, double np2) {
		double media = (np1 + np2) / 2;

		if (media == 10) {
			System.out.println("Aprovado com distinção");
		} else if (media >= 7) {
			System.out.println("Aprovado");

		} else {
			System.out.println("Reprovado");

		}
	}

	public static void main(String[] args) {
		System.out.println("Digite as duas notas do aluno: ");
		double np1 = new Scanner(System.in).nextDouble();
		double np2 = new Scanner(System.in).nextDouble();

		aprovacao(np1, np2);

	}

}
