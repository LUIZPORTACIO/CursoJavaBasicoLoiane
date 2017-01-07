package br.curso.javabasico.lista1;

import java.util.Scanner;

public class Questao06 {
	
	public static void areaCirculo(Double raioCirculo) {
		
		double areaCirculo = Math.ceil((Math.PI*Math.pow(raioCirculo, 2)));
		
		System.out.println("A area do circulo é: "+ areaCirculo);
	}

	public static void main(String[] args) {
		System.out.println("Digite o raio do circulo, para calcular a area do circulo");
		
		double raioCirculo = new Scanner(System.in).nextDouble();
		
		areaCirculo(raioCirculo);
		
		

	}

}
