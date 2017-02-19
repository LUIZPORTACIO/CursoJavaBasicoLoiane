package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao21 {

	public static void mediaturma() {
		int quantturma = 0;
		int somaalunos = 0;
		int numturma = 0;
		while (quantturma <= 40) {
			System.out.println("Quantos alunos na turma ?");
			quantturma = new Scanner(System.in).nextInt();
			somaalunos = somaalunos + quantturma;
			numturma++;
			if (quantturma>40) {
				somaalunos = somaalunos - quantturma;
				numturma--;
			}
		}

		double mediaturma = somaalunos / numturma;
		System.out.println("A quantidade de turmas: " + numturma + ", numero total de alunos: " + somaalunos
				+ ", a media de alunos por turma: " + mediaturma);
	}

	public static void main(String[] args) {
		mediaturma();
	}
}
