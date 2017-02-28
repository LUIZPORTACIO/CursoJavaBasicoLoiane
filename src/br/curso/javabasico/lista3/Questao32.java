package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao32 {
	private static double valoritem = 0.0;

	public static void pedidolanchonete(int quantitempedido) {
		String item="";
		double preco;
		double total = 0.0;
		int quantitem=0;
		for (int i = 0; i < quantitempedido; i++) {
			System.out.println("Qual o item pedido ?");
			int numitem = new Scanner(System.in).nextInt();
			System.out.println("Quantos desse item ?");
			quantitem = new Scanner(System.in).nextInt();

			switch (numitem) {
			case 100:
				item = "Cachorro quente";
				preco = 1.20;
				valoritem = quantitem * preco;
				break;

			case 101:
				item = "Bauru Simples";
				preco = 1.30;
				valoritem = quantitem * preco;
				break;

			case 102:
				item = "Bauru com ovo";
				preco = 1.50;
				valoritem = quantitem * preco;
				break;

			default:
				break;

			}
			total += valoritem;

			System.out.println("Item: "+item+" Quantidade"+quantitem+" Preço"+valoritem);
		}
		
		System.out.println("Total: " + total);

	}

	public static void main(String[] args) {
		System.out.println("Quantos itens no pedido ?");
		int quantitempedido = new Scanner(System.in).nextInt();
		pedidolanchonete(quantitempedido);

	}

}
