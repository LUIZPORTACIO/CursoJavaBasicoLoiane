package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao02 {

	public static void epositivo(double numero) {
		
		if (numero >= 0.0) {
			
			System.out.println(numero+" é positivo.");
		} else {
			System.out.println(numero+" é negativo.");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Digite um número: ");
		
		double numero = new Scanner(System.in).nextDouble();
		
		epositivo(numero);

	}

}
