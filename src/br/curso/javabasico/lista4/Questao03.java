package br.curso.javabasico.lista4;

public class Questao03 {
	
	public static void vetorporvetor() {
		
		int[] vetorA = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] vetorB = new int[15];
		
		
		 for (int i = 0; i < vetorA.length; i++) {
			 vetorB[i] = (vetorA[i])*(vetorA[i]);
			 
			 System.out.println("O vetor A: " + vetorA[i] + "\tO vetor B: " + vetorB[i]);
		}
		 
		 System.out.println("\nO tamanho vetor A: " + vetorA.length + "\tO tamanho vetor B: " + vetorB.length);
		
	}

	public static void main(String[] args) {
		vetorporvetor();

	}

}
