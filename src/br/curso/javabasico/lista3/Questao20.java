package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao20 {

	public static void faixaetaria() {
		String decisao = null;
		int cont = 0;
		int soma = 0;
		do {
			System.out.println("Qual a idade da pessoa ?  ");
			int pessoaidade = new Scanner(System.in).nextInt();

			System.out.println("Certo. Mais alguma idade?(Sim ou não)");
			decisao = new Scanner(System.in).next();

			soma = soma+pessoaidade;
			cont=cont+1;	

		} while (decisao.equalsIgnoreCase("Sim"));

		int mediaidade = soma / cont;

		if (mediaidade <= 25) {
			System.out.println("turma jovem"+" "+mediaidade);
		}
		if (mediaidade > 25 && mediaidade <= 60) {
			System.out.println("turma adulta"+" "+mediaidade);
		}
		if (mediaidade > 60) {
			System.out.println("turma idosa"+" "+mediaidade);
		}

	}

	public static void main(String[] args) {
		faixaetaria();
	}

}
