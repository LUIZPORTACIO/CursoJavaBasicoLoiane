package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao10 {
	
	public static void qturno(String letra) {
		
		switch (letra) {
		case "M":
			System.out.println("Bom dia");
			break;
			
		case "V":
			System.out.println("Boa tarde");
			break;
			
		case "N":
			System.out.println("Boa noite");
			break;

		default:
			System.out.println("Turno invalido");
			
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Qual a letra de seu turno ?");
		
		String letra = new Scanner(System.in).next();
		
		qturno(letra.toUpperCase());
	}
}
