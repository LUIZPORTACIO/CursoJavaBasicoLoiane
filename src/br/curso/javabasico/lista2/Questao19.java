package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao19 {

	public static void operacao(int a, int b, String op) {
		Double resultado = 0.0;
		switch (op.toLowerCase()) {
		case "adição": resultado = (double) (a + b);
			System.out.println("O resultado é " + resultado);
			ePar(resultado);
			ePositivo(resultado);
			break;
		case "subtração": resultado = (double) a - b;
			System.out.println("O resultado é " + resultado);
			ePar(resultado);
			ePositivo(resultado);
			break;
		case "multiplicação": resultado= (double) a * b;
			System.out.println("O resultado é " + resultado);
			ePar(resultado);
			ePositivo(resultado);
			break;
		case "divisão":
			if (b != 0) {
				resultado = (double) a / b;
				System.out.println("O resultado é " + resultado);
				ePar(resultado);
				ePositivo(resultado);
			} else {
				System.out.println("O resultado não encontrado");
			}
			break;
		default:
			System.out.println("Operação não encontrada");
			break;
		}
	}

	public static void ePar(Double resultado) {
		if (resultado % 2 == 0) {
			System.out.println("O número é par.");
		} else {
			System.out.println("O número é impar.");
		}
	}

	public static void ePositivo(Double resultado) {
		if (resultado>= 0) {
			System.out.println("O número é positivo.");
		} else {
			System.out.println("O número é negativo.");
		}
	}

	public static void main(String[] args) {
		System.out.println("Digite dois números: ");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		System.out.println("Digite uma operação: ");
		String op = new Scanner(System.in).next();
		operacao(a, b, op);
	}
}
