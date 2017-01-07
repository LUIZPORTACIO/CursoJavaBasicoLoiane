package br.curso.javabasico.lista1;

import java.util.Scanner;

public class Questao11 {
	
	private static void calculosABC(int n1, int n2, double n3) {
		
		int sol1 = (2*n1)*(n2/2);
		
		System.out.println("A solução do item a é: "+sol1);
		
		double sol2 = Math.ceil((3*n3)+n1);
		
		System.out.println("A solução do item b é: "+sol2);
		
		double sol3 = Math.ceil(Math.pow(n3, 3));
		
		System.out.println("A solução do item c é: "+sol3);
		
	}

	public static void main(String[] args) {
		System.out.println("Digite dois numeros inteiros e um número real: ");
		
		int n1 = new Scanner(System.in).nextInt();
		int n2 = new Scanner(System.in).nextInt();
		double n3 = new Scanner(System.in).nextDouble();
		
		calculosABC(n1, n2, n3);
		

	}

}
