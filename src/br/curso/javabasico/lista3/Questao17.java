package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao17 {

	public static void calcfatorial(int numfator) {
		int n = numfator;
		int resultado = 0;
		int sum = 0;
		
		  while (n != 0){
				resultado = numfator * n;
				n--;
				sum = sum+resultado;
				
				System.out.print(numfator+" x "+(n+1)+" = "+resultado+" ");
				
		  }
		  System.out.println("\tO fatorial é "+sum);
	}

	public static void main(String[] args) {
		System.out.println("Informe um numero para fatorar");
		int numfator = new Scanner(System.in).nextInt();

		calcfatorial(numfator);
	}
}
