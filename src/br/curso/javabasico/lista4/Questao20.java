package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao20 {
	
	public static void conversorparareal(double cotacaodolar) {
		
		double [] valorreal = new double[20];
		
		System.out.println("---Tabela de 1 a 20 unidades---");
		
		for (int i = 0; i < valorreal.length; i++) {
			
			valorreal[i] = cotacaodolar*(i+1);
			
			System.out.println("O valor de "+(i+1)+" dolares equivalem a "+valorreal[i]+ " reais");
		}
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("Qual o valor do dolar ?");
		
		double cotacaodolar = new Scanner(System.in).nextDouble();
		
		conversorparareal(cotacaodolar);

	}

}
