package br.curso.javabasico.lista1;

import java.util.Scanner;

public class Questao09 {
	
	private static void paraCelsius(double tfarenheit) {
		
		double tcelsius = Math.ceil(5*(tfarenheit-32)/9);
		
		System.out.println("A temperatura em Farenheit é: "+tfarenheit+"\na temperatura em Celsius é: "+tcelsius);
		
	}

	public static void main(String[] args) {
		System.out.println("Digite a temperatura em Farenheit: ");
		
		double tfarenheit = new Scanner(System.in).nextDouble();
		
		paraCelsius(tfarenheit);

	}

}
