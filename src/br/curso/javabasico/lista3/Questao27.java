package br.curso.javabasico.lista3;

import java.util.Scanner;

//Algo para relembrar, uso das constantes Max_Value e Min_Value
public class Questao27 {

	public static void tempMedMaxMin() {

		System.out.println("Entre com a qtd de temperaturas");
		int qtdTemperaturas = new Scanner(System.in).nextInt();

		double temp;
		double soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;

		for (int i = 1; i <= qtdTemperaturas; i++) {

			System.out.println("Entre com a temperatura " + i);
			temp = new Scanner(System.in).nextDouble();
			soma += temp;

			if (temp > maior) {
				maior = temp;
			}

			if (temp < menor) {
				menor = temp;
			}
		}

		System.out.println("Media temperatura: " + (soma / qtdTemperaturas)
				+ "\nMenor temperatura: " + menor
				+ "\nMaior temperatura: " + maior);

	}

	public static void main(String[] args) {

		tempMedMaxMin();
	}
}
