package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao18 {
	
	public static void ePar(int num) {
		if (num%2==0) {
			System.out.println("O número "+num+" é par");
		} else {
			System.out.println("O número "+num+" é impar.");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Digite um número: ");
		int num = new Scanner(System.in).nextInt();
		ePar(num);

	}

}
