package br.curso.javabasico.lista1;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Questao04 {
	
	public static void mediaSemestral() {
		
		System.out.println("Digite as 4 notas bimestrais do aluno: ");
		
		double nota1 = new Scanner(System.in).nextDouble();
		double nota2 = new Scanner(System.in).nextDouble();
		double nota3 = new Scanner(System.in).nextDouble();
		double nota4 = new Scanner(System.in).nextDouble();
		
		double mediaAluno = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A media do aluno é: " + mediaAluno);
		
	}

	public static void main(String[] args) {
		mediaSemestral();

	}

}
