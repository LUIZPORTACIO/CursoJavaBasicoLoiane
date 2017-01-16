package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao03 {

	private static void verificaSexo(String sexo) {

		switch (sexo.toUpperCase()) {
		case "F":
			System.out.println("O sexo é feminino");

			break;

		case "M":
			System.out.println("O sexo é masculino");

			break;

		default:
			System.out.println("Sexo invalido");
			break;
		}
	}

	public static void main(String[] args) {
		System.out.println("Digite a letra do sexo: ");
		String sexo = new Scanner(System.in).next();

		verificaSexo(sexo);

	}

}
