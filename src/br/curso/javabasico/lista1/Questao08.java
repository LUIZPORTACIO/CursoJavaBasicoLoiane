package br.curso.javabasico.lista1;

import java.util.Scanner;

public class Questao08 {

	private static void totalSalario(double horatrabalhada, double valorHora) {

		double salarioTotal = Math.ceil(horatrabalhada * valorHora);

		System.out.println("O seu salário será: " + salarioTotal +" reais");

	}

	public static void main(String[] args) {
		System.out.println("Qual o valor de sua hora trabalhada ? ");

		double valorHora = new Scanner(System.in).nextDouble();

		System.out.println("Quantas horas de trabalhado ? ");

		double horatrabalhada = new Scanner(System.in).nextDouble();
		
		totalSalario(horatrabalhada, valorHora);

	}

}
