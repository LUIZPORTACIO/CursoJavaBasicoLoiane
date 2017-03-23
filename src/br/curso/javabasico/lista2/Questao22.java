package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao22 {

	public static void totalfeira(double quantmorango, double quantmaca) {
		double parcialMorango = 0.0;
		double parcialMaca = 0.0;
		double preco = 0.0;
		double total = 0.0;

		if (quantmorango <= 5) {
			preco = 2.50;
			parcialMorango = quantmorango * preco;
		}
		if (quantmorango > 5) {
			preco = 2.20;
			parcialMorango = quantmorango * preco;
		}
		if (quantmaca <= 5) {
			preco = 1.80;
			parcialMaca = quantmaca * preco;
		}
		if (quantmaca > 5) {
			preco = 1.50;
			parcialMaca = quantmaca * preco;
		}

		double totalquantFruta = quantmorango + quantmaca;
		double totalvalorFruta = parcialMaca + parcialMorango;

		if (totalquantFruta > 8 || totalvalorFruta > 25.0) {
			total = totalvalorFruta - (totalvalorFruta * 0.10);
		} else {
			total = totalvalorFruta;
		}
		System.out.println("Total a pagar: " + total);
	}

	public static void main(String[] args) {
		System.out.println("Vamos a feira. Qual a quantidade de morango(Kg) ? ");

		Double quantmorango = new Scanner(System.in).nextDouble();
		System.out.println("Qual a quantidade de maçã(Kg) ?");

		Double quantmaca = new Scanner(System.in).nextDouble();
		totalfeira(quantmorango, quantmaca);
	}
}
