package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao29 {

	public static void listarprimos(int num) {
		boolean primo;
		String output = "Números primos: ";

		System.out.print(output);
		
		for (int i = 1; i <= num; i++) {

			primo = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {

					primo = false;
				}
			}

			if (primo) {
				
				System.out.print(i + " ");
			}
		}
		
	}

	public static void main(String[] args) {

		System.out.println("Digite um número inteiro: ");
		int num = new Scanner(System.in).nextInt();
		listarprimos(num);
	}

}
