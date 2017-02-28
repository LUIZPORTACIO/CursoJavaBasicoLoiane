package br.curso.javabasico.lista3;

import java.util.Scanner; //A mesma da 33

public class Questao35 {

	public static void somainversodoistermos(double n) {

		double soma = 0.0;
		for (double i = 1, j = 1; i <= n; i++, j += 2) {

			System.out.println("S:" + i / j+" i:"+i+" j:"+j);
			soma += i / j;
		}
		String result = String.format("%.3f", soma);
		System.out.println("A soma de " + n + " termos " + "é de :" + result);
	}
	
	public static void main(String[] args) {
		System.out.println("Digite um número");
		double n = new Scanner(System.in).nextDouble();

		somainversodoistermos(n);
	}
}
