package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao13 {
	
	public static void diaSemana(int diaSemana) {
		switch (diaSemana) {
		case 1:
			System.out.println("É domingo.");
			break;
		case 2:
			System.out.println("É Segunda.");
			break;
		case 3:
			System.out.println("É Terça.");
			break;
		case 4:
			System.out.println("É Quarta.");
			break;
		case 5:
			System.out.println("É Quinta.");
			break;
		case 6:
			System.out.println("É Sexta.");
			break;
		case 7:
			System.out.println("É Sábado.");
			break;
		default:
			System.out.println("Número de dia inválido.");
			break;
		}
	}

	public static void main(String[] args) {
		System.out.println("Digite um número para o dia da semana: ");
		int diaSemana = new Scanner(System.in).nextInt();
		diaSemana(diaSemana);

	}

}
