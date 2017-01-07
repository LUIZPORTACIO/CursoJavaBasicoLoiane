package br.curso.javabasico.lista1;

import java.util.Scanner;

public class Questao07 {
	
	private static void calculaAreaQuadrado(double lado) {
		
		double areaQuadrado = lado*lado;
		
		System.out.println("A area do quadrado: "+areaQuadrado+"\nO dobro da area do quadrado"+2*areaQuadrado);
		
	}

	public static void main(String[] args) {
		
		System.out.println("Digite o lado do quadrado: ");
		
		double lado = new Scanner(System.in).nextDouble();
		
		calculaAreaQuadrado(lado);
		

	}

}
