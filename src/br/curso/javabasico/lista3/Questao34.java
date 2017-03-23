package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao34 {

	public static void somainverso(double n) {
		
		double resultado = 0.0;
		for (double i = 1; i <= n; i++) {
			
			System.out.println("H:"+1/i);
			resultado += 1/i;
		}
		
		String result = String.format("%.3f", resultado);
		System.out.println("A soma de "+n+" termos "+"é de :"+result);
	}
	public static void main(String[] args) {
		System.out.println("Digite um número");
		double n = new Scanner(System.in).nextDouble();
		
		somainverso(n);
	}
}
