package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao03 {
	
	public static void validainfo(String nome, int idade, double salario,  String sexo, String ecivil) {
		while (nome.length()<3) {
			System.out.println("Troque o nome");
			nome = new Scanner(System.in).next();
		}
		while (idade > 150) {
			System.out.println("Troque a idade");
			idade = new Scanner(System.in).nextInt();
		}	
		while (salario == 0) {
			System.out.println("Troque o salario");
			salario = new Scanner(System.in).nextDouble();
		}	
		while (!sexo.equals("f")&&!sexo.equals("m")) {
			System.out.println("Troque o sexo");
			sexo = new Scanner(System.in).next();
		}
		while (!ecivil.equals("s")&&!ecivil.equals("c")&&!ecivil.equals("v")&&!ecivil.equals("d")) {
			System.out.println("Troque o estado civil");
			ecivil = new Scanner(System.in).next();
		}
	System.out.println("Nome: "+nome+"\tIdade: "+idade+"\tSalario: "+salario+"\nSexo: "+sexo+"\tEstado Civil: "+ecivil);
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
