package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao01 {
	
	

	public static void main(String[] args) {
		System.out.println("Qual a nota? ");
		int np = new Scanner(System.in).nextInt();
		
		while (np<0 || np >10){
			System.out.println("Nota invalida. Repita a nota.");
			np = new Scanner(System.in).nextInt();
		} 
			
		System.out.println("A sua nota: "+np);
		
	}
}
