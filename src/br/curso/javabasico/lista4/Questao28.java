package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao28 {

	public static void inversovetores(int [] vetA, int [] vetB) {
		
		for (int i = 0; i < vetA.length; i++) {
			
			System.out.println("Digite o vetor A " + (i + 1));
			vetA[i] = new Scanner(System.in).nextInt();
			
			vetB[vetA.length-i-1] = vetA[i]; //Para o ultimo do vetor B ser o primeiro do vetor A
		}
		for (int i = 0; i < vetA.length ; i++) {
			
			System.out.println("Vetor A: "+vetA[i]+"\tVetor B: "+vetB[i]);
		}
	}
	
	public static void main(String[] args) {
		int [] vetA = new int[10];
		int [] vetB = new int[vetA.length];
		 
		inversovetores(vetA, vetB);
	}

}
