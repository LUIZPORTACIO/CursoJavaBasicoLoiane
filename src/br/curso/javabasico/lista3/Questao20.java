package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao20 {

	public static void faixaetaria() {
		String decisao = null;
		int cont = 0;
		double soma = 0;
		double mediaidade;
		
		do {
			System.out.println("Qual a idade da pessoa ?  ");
			int pessoaidade = new Scanner(System.in).nextInt();

			System.out.println("Certo. Mais alguma idade?(Sim ou não)");
			decisao = new Scanner(System.in).next();

			soma = soma+pessoaidade;
			cont=cont+1;	

		} while (decisao.equalsIgnoreCase("Sim")||decisao.equalsIgnoreCase("S") );

		mediaidade = soma / cont;

		if (mediaidade <= 25) {
			System.out.println("Turma jovem."+" Média de idade: "+String.format("%.3f", mediaidade));
		}
		if (mediaidade > 25 && mediaidade <= 60) {
			System.out.println("Turma adulta."+" Média de idade: "+String.format("%.3f", mediaidade));
		}
		if (mediaidade > 60) {
			System.out.println("Turma idosa."+" Média de idade: "+String.format("%.3f", mediaidade));
		}

	}

	public static void main(String[] args) {
		faixaetaria();
	}

}
