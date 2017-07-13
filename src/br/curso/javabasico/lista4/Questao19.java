package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao19 {

	public static void mediabimestral() {

		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] medias = new double[notas1.length];

		System.out.println("Digite as notas dos alunos");
		for (int i = 0; i < notas1.length; i++) {
			System.out.println("Digite NP1" + " - Aluno:" + (i + 1));
			notas1[i] = new Scanner(System.in).nextDouble();

			System.out.println("Digite NP2" + " - Aluno:" + (i + 1));
			notas2[i] = new Scanner(System.in).nextDouble();

			medias[i] = (notas1[i] + notas2[i])/ 2.0;

		}

		for (int i = 0; i < medias.length; i++) {

			if (medias[i] >= 7.0) {
				System.out.println("\nAluno " + (i + 1) + "\nAprovado." + "\nAs suas notas foram: " + notas1[i] + " - "
						+ notas2[i] + "\nMédia: " + medias[i]);

			} else {
				System.out.println("\nAluno " + (i + 1) + "\nReprovado." + "\nAs suas notas foram: " + notas1[i] + " - "
						+ notas2[i] + "\nMédia: " + medias[i]);

			}
		}
	}

	public static void main(String[] args) {

		mediabimestral();
	}
}
