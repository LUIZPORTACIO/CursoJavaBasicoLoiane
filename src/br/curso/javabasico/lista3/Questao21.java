package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao21 {

	public static void mediaturma() {
		int quantturma = 0;
		double somaalunos = 0;
		int numturma = 0;
		double mediaturma;
		
		while (quantturma <= 40) {
			System.out.println("Quantos alunos na turma ?");
			quantturma = new Scanner(System.in).nextInt();
			somaalunos += quantturma;
			numturma++;
			if (quantturma > 40) {
				somaalunos = somaalunos - quantturma;
				numturma--;
			}
		}

		mediaturma = somaalunos / numturma;
		System.out.println("A quantidade de turmas: " + numturma + ", numero total de alunos: " + somaalunos
				+ "\n, a media de alunos por turma: " + String.format("%.3f", mediaturma));
	}

	public static void main(String[] args) {
		mediaturma();
	}
}
