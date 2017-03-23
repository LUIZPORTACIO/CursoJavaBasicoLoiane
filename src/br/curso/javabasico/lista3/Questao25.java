package br.curso.javabasico.lista3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Questao25 {

	public static void pedidototal() {
		System.out.println("Lojas Zana");
		Double soma = 0.0;
		double valorpedido;
		int quantprod = 1;
		Double dinheirocliente, troco;
		
		
		do {
			System.out.println("Qual o valor do item ?");
			valorpedido = new Scanner(System.in).nextDouble();
			System.out.println("Produto " + quantprod + " valor: " + valorpedido);
			quantprod++;
			soma = soma + valorpedido;
		} while (valorpedido > 0.0);

		System.out.println(
				"O valor total: " + NumberFormat.getCurrencyInstance().format(soma) + "\nQual o dinheiro do cliente ?");
		dinheirocliente = new Scanner(System.in).nextDouble();
		troco = dinheirocliente - soma;
		System.out.println("Pedido: " + NumberFormat.getCurrencyInstance().format(soma) + "\nDinheiro: "
				+ NumberFormat.getCurrencyInstance().format(dinheirocliente) + "\nTroco: "
				+ NumberFormat.getCurrencyInstance().format(troco));
	}

	public static void main(String[] args) {
		String resposta;
		do {
			System.out.println("Deseja informar uma compra(S ou N)");
			resposta = new Scanner(System.in).next();
			if (resposta.equalsIgnoreCase("s")) {
				pedidototal();
			} else {
				System.out.println("Sistema encerrado");
			}
		} while (resposta.equalsIgnoreCase("s"));
	}
}
