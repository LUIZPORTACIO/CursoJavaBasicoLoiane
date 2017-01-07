package br.curso.javabasico.lista1;

import java.util.Scanner;

public class Questao03 {
	
	public static void somaNumeros() {
		
		System.out.println("Digite dois números: ");
		
		int n1 = new Scanner(System.in).nextInt();
		int n2 = new Scanner(System.in).nextInt();
		
		int soma = n1+n2;
		
		System.out.println("A soma dos números é " + soma);
		
	}

	public static void main(String[] args) {
		somaNumeros();

	}

}
