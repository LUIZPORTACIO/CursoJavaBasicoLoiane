package br.curso.javabasico.lista1;

import java.util.Scanner;

public class Questao12 {
	
	private static void calcularPesoIdeal(double altura) {
		
		double pesoIdeal = Math.ceil((72.7*altura)-58);
		
		System.out.println("O seu peso ideal é :"+pesoIdeal);
		
	}

	public static void main(String[] args) {
		System.out.println("Digite a sua altura:");
		
		double altura = new Scanner(System.in).nextDouble();
		
		calcularPesoIdeal(altura);

	}

}
