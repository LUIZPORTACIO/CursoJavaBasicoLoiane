package br.curso.javabasico.lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.omg.PortableServer.Current;

public class Questao32 {
	private static double valoritem = 0.0;

	public static void pedidolanchonete(int quantitempedido) {
		String item = "";
		double preco;
		double total = 0.0;
		int quantitem = 0;
		
		DecimalFormat forma = new DecimalFormat("###.###");

		for (int i = 0; i < quantitempedido; i++) {
			System.out.println("Qual o código do item ?");
			int numitem = new Scanner(System.in).nextInt();
			System.out.println("Quantos desse item ?");
			quantitem = new Scanner(System.in).nextInt();

			switch (numitem) {
			case 100:
				item += "Cachorro quente";
				preco = 1.20;
				valoritem = quantitem * preco;
				item += " und - " + preco + " - quantidade " + quantitem + " = " + forma.format(valoritem) + "\n";
				break;

			case 101:
				item += "Bauru Simples";
				preco = 1.30;
				valoritem = quantitem * preco;
				item += " und - " + preco + " - quantidade " + quantitem + " = " + forma.format(valoritem) + "\n";
				break;

			case 102:
				item += "Bauru com ovo";
				preco = 1.50;
				valoritem = quantitem * preco;
				item += " und - " + preco + " - quantidade " + quantitem + " = " + forma.format(valoritem) + "\n";
				break;

			case 103:
				item += "Hambuger";
				preco = 1.20;
				valoritem = quantitem * preco;
				item += " und - " + preco + " - quantidade " + quantitem + " = " + forma.format(valoritem) + "\n";
				break;
			case 104:
				item += "Chesburguer";
				preco = 1.30;
				valoritem = quantitem * preco;
				item += " und - " + preco + " - quantidade " + quantitem + " = " + forma.format(valoritem) + "\n";
				break;
			case 105:
				item += "Refrigerante";
				preco = 1.00;
				valoritem = quantitem * preco;
				item += " und - " + preco + " - quantidade " + quantitem + " = " + forma.format(valoritem) + "\n";
				break;
			default:
				item +="Sem item ";
				break;

			}
			total += valoritem;

		}

		System.out.println("\n" + item + "\nTotal: " + forma.format(total));

	}

	public static void main(String[] args) {
		System.out.println("Quantos itens no pedido ?");
		int quantitempedido = new Scanner(System.in).nextInt();
		pedidolanchonete(quantitempedido);

	}

}
