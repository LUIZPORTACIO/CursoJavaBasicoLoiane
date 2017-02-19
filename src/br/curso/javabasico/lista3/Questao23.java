package br.curso.javabasico.lista3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Questao23 {
	public static void tabelaprecos(int quantprod) {
		double soma = 0.0;
		for (int i = 0; i < quantprod; i++) {
			soma = soma +1.99;
		}
		System.out.println("O valor a pagar: "+NumberFormat.getCurrencyInstance().format(soma));
		//Para formatar na forma de valor monetário.
	}

	public static void main(String[] args) {
		System.out.println("Quantos itens para a compra ? ");
		int quantprod = new Scanner(System.in).nextInt();
		tabelaprecos(quantprod);
	}
}
