package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao19 {

	public static void calculamediaNfatores(int quantnp) {
		int soma = 0;
		int teste = 0;
		double media = 0.0;

		while (teste < quantnp) {
			System.out.println("Qual a nota do aluno ? ");
			int np = new Scanner(System.in).nextInt();

			soma = soma + np;
			teste++;
			media = soma / quantnp;
		}
		System.out.println("A media do aluno é: " + media + " foram " + quantnp + " provas");
	}

	public static void main(String[] args) {
		System.out.println("Foram quantas provas ");
		int quantnp = new Scanner(System.in).nextInt();
		calculamediaNfatores(quantnp);
	}
}
