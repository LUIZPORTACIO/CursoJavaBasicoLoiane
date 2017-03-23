package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao14 {

	public static void contarpareseimpares() {
		int contpar = 0;
		int contimpar = 0;
		int num;
		for (int i = 0; i < 10; i++) {

			System.out.println("Digite um número");
			num = new Scanner(System.in).nextInt();

			if (num % 2 == 0) {
				contpar++;
			} else if (num % 2 != 0) {
				contimpar++;
			}
		}
		System.out.println("A quantidade de números pares é: " + contpar);
		System.out.println("A quantidade de números impares é: " + contimpar);
	}

	public static void main(String[] args) {
		contarpareseimpares();
	}
}