package br.curso.javabasico.lista3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Questao03 {

	public static void validainfo(String nome, int idade, double salario, String sexo, String ecivil) {
		while (nome.length() <= 3) {
			System.out.println("Troque o nome");
			nome = new Scanner(System.in).next();
		}
		while (idade < 1 || idade > 150) {
			System.out.println("Troque a idade");
			idade = new Scanner(System.in).nextInt();
		}
		while (salario == 0) {
			System.out.println("Troque o salario");
			salario = new Scanner(System.in).nextDouble();
		}
		while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {
			System.out.println("Troque o sexo (F ou M)");
			sexo = new Scanner(System.in).next();
		}
		while (!ecivil.equalsIgnoreCase("s") && !ecivil.equalsIgnoreCase("c") && !ecivil.equalsIgnoreCase("v")
				&& !ecivil.equalsIgnoreCase("d")) {
			System.out.println("Troque o estado civil (S, C, V, D)");
			ecivil = new Scanner(System.in).next();
		}
		System.out.println("Cadastro realizado." + "\nNome: " + nome.toUpperCase() + "\tIdade: " + idade + "\tSalario: "
				+ NumberFormat.getCurrencyInstance().format(salario) + "\tSexo: " + sexo.toUpperCase()
				+ "\tEstado Civil: " + ecivil.toUpperCase());
	}

	public static void main(String[] args) {
		System.out.println("Preencha o formulário. Nome: ");
		String nome = new Scanner(System.in).next();
		System.out.println("Idade: ");
		int idade = new Scanner(System.in).nextInt();
		System.out.println("Salario: ");
		Double salario = new Scanner(System.in).nextDouble();
		System.out.println("Sexo: ");
		String sexo = new Scanner(System.in).next();
		System.out.println("Estado Civil: ");
		String ecivil = new Scanner(System.in).next();

		validainfo(nome, idade, salario, sexo, ecivil);

	}

}
