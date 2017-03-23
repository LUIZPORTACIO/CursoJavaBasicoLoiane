package br.curso.javabasico.lista3;

import java.text.NumberFormat;

public class Questao24 {
	public static void tabelapaes() {
		System.out.println("Tabela de preços - pães");
		int quantpao = 1;
		Double preco;
		
		while (quantpao <= 50) {
			preco = quantpao * 0.18;
			System.out.println("A quantidade de pães: " + quantpao + " o valor: "
					+ NumberFormat.getCurrencyInstance().format(preco));
			quantpao++;
		}
	}

	public static void main(String[] args) {
		tabelapaes();

	}

}
