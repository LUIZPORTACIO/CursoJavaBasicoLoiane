package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao04 {

	public static void evogal(String letra) {

		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			
			System.out.println("A letra é vogal");

		} else {
			System.out.println("A letra é consoante");
		}

	}

	public static void main(String[] args) {
		System.out.println("Digite uma letra: ");
		String letra = new Scanner(System.in).next();
		evogal(letra);

	}

}
