package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao14 {

	public static void calculaConceito(Double np1, Double np2) {
		Double mediaAluno = (np1 + np2) / 2;
		if (mediaAluno > 9 && mediaAluno <= 10) {
			System.out.println(
					"Np1: " + np1 + "\tNp2: " + np2 + "\nMedia Aluno: " + mediaAluno + "\tConceito A - Aprovado");
		} else if (mediaAluno > 7.5 && mediaAluno <= 9) {
			System.out.println(
					"Np1: " + np1 + "\tNp2: " + np2 + "\nMedia Aluno: " + mediaAluno + "\tConceito B - Aprovado");
			
		} else if (mediaAluno > 6 && mediaAluno <= 7.5) {
			System.out.println(
					"Np1: " + np1 + "\tNp2: " + np2 + "\nMedia Aluno: " + mediaAluno + "\tConceito C - Aprovado");
			
		} else if (mediaAluno > 4 && mediaAluno <= 6) {
			System.out.println(
					"Np1: " + np1 + "\tNp2: " + np2 + "\nMedia Aluno: " + mediaAluno + "\tConceito D - Reprovado");
			
		} else if (mediaAluno >= 0 && mediaAluno <= 4) {
			System.out.println(
					"Np1: " + np1 + "\tNp2: " + np2 + "\nMedia Aluno: " + mediaAluno + "\tConceito E - Reprovado");
			 }
	}

	public static void main(String[] args) {
		System.out.println("Digite as notas do aluno: ");
		Double np1 = new Scanner(System.in).nextDouble();
		double np2 = new Scanner(System.in).nextDouble();
		
		calculaConceito(np1, np2);
	}
}
