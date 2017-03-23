package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao19 {

	public static void operacao(int a, int b, String op) {
		
		double resultado = 0.0;
		boolean validar = true; //Uso de flag 
		
		switch (op.toLowerCase()) {
		case "adição": resultado = a + b; break;
		case "subtração": resultado = a - b; break;
		case "multiplicação": resultado = a * b; break;
		case "divisão":
			if (b != 0) {
				resultado = a / b;
			} else {
				System.out.println("O resultado não encontrado");
				validar = false;
			}
			break;
		default:
			System.out.println("Operação não encontrada"); validar = false;
		}
		if (validar) {
			System.out.println("O resultado é " + resultado);
			ePar(resultado);
			ePositivo(resultado);
		}		
	}

	public static void ePar(double resultado) {
		if (resultado % 2 == 0) {
			System.out.println("O número é par.");
		} else {
			System.out.println("O número é impar.");
		}
	}

	public static void ePositivo(double resultado) {
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
		System.out.println("Digite uma operação:(adição, subtração, multiplicação, divisão)");
		String op = new Scanner(System.in).next();
		operacao(a, b, op);
	}
}
