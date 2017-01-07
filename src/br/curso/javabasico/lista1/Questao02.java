package br.curso.javabasico.lista1;

import java.util.Scanner;

public class Questao02 {
	
	public static void pecaNumero() {
		
		System.out.println("Digite um número: ");
		
		Double numero = new Scanner(System.in).nextDouble();
		
		System.out.println("O seu número é: "+numero);
		
	}

	public static void main(String[] args) {
		pecaNumero();

	}

}
