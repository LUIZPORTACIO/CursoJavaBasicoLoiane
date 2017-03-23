package br.curso.javabasico.lista3;


import java.util.Scanner;

public class Questao33 {

	public static void somatorio() {
		System.out.println("Digite n:");

		double n = new Scanner(System.in).nextInt();

		double soma = 0;

		for (double i = 1, j = 1; i <= n; i++, j += 2) {
			
			System.out.print(i+"/"+j+" + ");
			
			soma += i/j;
			
		}

		String resultado = String.format("%.3f", soma);//Conversão para o formato (0,000)
		System.out.println("0 =  " + resultado);

	}

	public static void main(String[] args) {

		somatorio();
	}

}
