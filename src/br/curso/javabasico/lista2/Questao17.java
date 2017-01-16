package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao17 {
	
	public static void ebisexto(int ano) {
	if ((ano%400 == 0) || (ano%4 == 0 && ano%100 != 0) ) {
		System.out.println("O ano de "+ano+" é ano bissexto");
			
		} else {
			System.out.println("Não é ano bissexto.");

		}
	}

	public static void main(String[] args) {
		System.out.println("Digite um ano: ");
		int ano = new Scanner(System.in).nextInt();
		ebisexto(ano);

	}

}
