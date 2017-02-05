package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao13 {

	public static void numelevadoaexp(int base, int expoente) {

		int resultado=1;
		for (int i = 1; i <= expoente; i++) {

			resultado = resultado * base;
			System.out.print(resultado + " ");
		}
		
		System.out.println("\nO número " + base + " elevado a " + expoente + " é igual a " + resultado);
	}

	public static void main(String[] args) {
		System.out.println("Digite um número base");
		int base = new Scanner(System.in).nextInt();
		System.out.println("Digite um expoente");
		int expoente = new Scanner(System.in).nextInt();

		numelevadoaexp(base, expoente);

	}

}
