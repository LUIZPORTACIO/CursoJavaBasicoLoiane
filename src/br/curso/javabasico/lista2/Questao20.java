package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao20 {

	public static void investigacao(String q1,String q2,String q3, String q4,String q5) {
		int cont = 0;
		if (q1.equalsIgnoreCase("Sim")) {
			cont++ ; }  
		if (q2.equalsIgnoreCase("Sim")) {
			cont++; } 
		if (q3.equalsIgnoreCase("Sim")) {
			cont++; } 
		if (q4.equalsIgnoreCase("Sim")) {
			cont++; } 
		if (q5.equalsIgnoreCase("Sim")) {
			cont++; }
		resultadoInvestigacao(cont);
	}

	public static void resultadoInvestigacao(int cont) {
		if (cont == 2) {
			System.out.println("Pessoa suspeita");
		} else if (cont == 3 || cont == 4) {
			System.out.println("Pessoa cumplice");
			
		} else if (cont == 5) {
			System.out.println("Pessoa assassina");
			
		} else {
			System.out.println("Pessoa inocente");
		}
	}
	public static void main(String[] args) {
		System.out.println("Investigação. Telefonou para a vitima ?");
		String q1 = new Scanner(System.in).next();
		System.out.println("Esteve no local do crime ?");
		String q2 = new Scanner(System.in).next();
		System.out.println("Mora perto da vitima ?");
		String q3 = new Scanner(System.in).next();
		System.out.println("Devia para a vitima ?");
		String q4 = new Scanner(System.in).next();
		System.out.println("Já trabalhou com a vitima ?");
		String q5 = new Scanner(System.in).next();

		investigacao(q1, q2, q3, q4, q5);
	}

}
