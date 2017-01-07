package br.curso.javabasico.lista1;

import java.util.Scanner;

public class Questao10 {

	private static void parafarenheit(double tcelsius) {
		
		double tfarenheit = Math.ceil(((9*tcelsius)/5)+32);
		
		System.out.println("A temperatura em Celsius: "+tcelsius+"\nA temperatura em Farenheit: "+tfarenheit);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Digite a tempertura em Celsius ");
		
		double tcelsius = new Scanner(System.in).nextDouble();
		
		parafarenheit(tcelsius);

	}

}
