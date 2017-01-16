package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao11 {

	public static void oAumento(Double salario, Double percAumento) {
		Double valorAumento = salario * (percAumento / 100);
		Double salarioReajustado = salario + valorAumento;

		System.out.println("O salario: " + salario + "\nO percentual de aumento: " + percAumento
				+ "\nO valor do aumento: " + valorAumento + "\nO novo salario: " + salarioReajustado);
	}

	public static void calculaSalario(Double salario) {

		if (salario <= 280) {
			Double percAumento = 20.0;
			oAumento(salario, percAumento);

		} else if (salario > 280 && salario <= 700) {
			Double percAumento = 15.0;
			oAumento(salario, percAumento);

		} else if (salario > 700 && salario <= 1500) {
			Double percAumento = 10.0;
			oAumento(salario, percAumento);

		} else if (salario > 1500) {
			Double percAumento = 5.0;
			oAumento(salario, percAumento);
		}

	}

	public static void main(String[] args) {
		System.out.println("Digite seu salário atual: ");
		Double salario = new Scanner(System.in).nextDouble();

		calculaSalario(salario);

	}

}
