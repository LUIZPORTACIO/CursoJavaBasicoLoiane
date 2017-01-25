package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao11 {

	public static void somaIntervalo(int numinicial, int numfinal) {

		int sum = 0;
		for (int i = numinicial; i <= numfinal; i++) {

			System.out.print(i+" ");
			sum += i;
		}
		System.out.println("\nA soma do intervalo é: " + sum);
	}

	public static void main(String[] args) {
		System.out.println("Digite o numero inicial:");
		int numinicial = new Scanner(System.in).nextInt();
		System.out.println("Digite o numero final:");
		int numfinal = new Scanner(System.in).nextInt();
		
		somaIntervalo(numinicial, numfinal);

	}

}
