package br.curso.javabasico.lista3;

import java.util.Scanner;
//Algo para relembrar, uso das constantes Max_Value e Min_Value
public class Questao27 {

	public static void tempMaxMin() {

		System.out.println("Entre com a qtd de temperaturas");
		int qtdTemperaturas = new Scanner(System.in).nextInt();

		double temp;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;

		for (int i = 1; i <= qtdTemperaturas; i++) {

			System.out.println("Entre com a temperatura " + i);
			temp = new Scanner(System.in).nextDouble();

			if (temp > maior) {
				maior = temp;
			}

			if (temp < menor) {
				menor = temp;
			}
		}

		System.out.println("Menor temperatura: " + menor);
		System.out.println("Maior temperatura: " + maior);
	}

	public static void main(String[] args) {

		tempMaxMin();
	}
}
