package br.curso.javabasico.lista4;

import java.text.DecimalFormat;

public class Questao04 {
	
	public static void raizvetor() {
		
		int[] vetorA = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		double[] vetorB = new double[15];
		
		DecimalFormat df = new DecimalFormat("###.###");
		
		
		 for (int i = 0; i < vetorA.length; i++) {
			 vetorB[i] = Math.sqrt(vetorA[i]);
			 
			 System.out.println("O vetor A: " + vetorA[i] + "\tO vetor B: " + df.format(vetorB[i]));
		}
		 
		 System.out.println("\nO tamanho vetor A: " + vetorA.length + "\tO tamanho vetor B: " + vetorB.length);
		
	}

	public static void main(String[] args) {
		raizvetor();

	}

}
