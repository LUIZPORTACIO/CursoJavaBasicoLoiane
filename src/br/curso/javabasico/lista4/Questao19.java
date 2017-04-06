package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao19 {

	public static void mediabimestral(int[] grupalunos) {

		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] media = new double[10];

		System.out.println("Digite as notas dos alunos");
		for (int i = 0; i < grupalunos.length; i++) {
			System.out.println("Digite NP1" + " - Aluno:" + (i + 1));
			nota1[i] = new Scanner(System.in).nextDouble();

			System.out.println("Digite NP2" + " - Aluno:" + (i + 1));
			nota2[i] = new Scanner(System.in).nextDouble();

			media[i] = (nota1[i] + nota2[i]) / 2;

		}

		for (int i = 0; i < grupalunos.length; i++) {

			if (media[i] >= 7.0) {
				System.out.println("\nAluno " + (i + 1) + "\nAprovado." + "\nAs suas notas foram: " + nota1[i] + " - "
						+ nota2[2] + "\nMédia: " + media[i]);

			} else {
				System.out.println("\nAluno " + (i + 1) + "\nReprovado." + "\nAs suas notas foram: " + nota1[i] + " - "
						+ nota2[2] + "\nMédia: " + media[i]);

			}
		}

	}

	public static void main(String[] args) {

		int[] grupalunos = new int[10];

		mediabimestral(grupalunos);

	}

}
