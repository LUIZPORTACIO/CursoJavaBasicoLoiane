package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao22 {

	public static void inventariocolecao(int numCD) {
		double soma = 0.0;
		for (int i = 0; i < numCD; i++) {
			System.out.println("Qual o valor pago em cada CD? ");
			double valorCD = new Scanner(System.in).nextDouble();
			soma = soma + valorCD;
		}
		double valormedioCD = soma / numCD;
		System.out.println("O valor investido na coleção é de " + soma + "\nValor em média gasto em cada CD é de "
				+ valormedioCD);

	}

	public static void main(String[] args) {
		System.out.println("Colecionador, quantos CDs você tem ?");
		int numCD = new Scanner(System.in).nextInt();
		inventariocolecao(numCD);

	}

}
