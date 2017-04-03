package br.curso.javabasico.lista4;

public class Questao05 {

	public static void vetorporindice() {
		int[] vetorA = new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] vetorB = new int[10];
		
		
		 for (int i = 0; i < vetorA.length; i++) {
			 vetorB[i] = (vetorA[i])*i;
			 
			 System.out.println("O vetor A: " + vetorA[i] + "\tO vetor B: " + vetorB[i]);
		}
		 
		 System.out.println("\nO tamanho vetor A: " + vetorA.length + "\tO tamanho vetor B: " + vetorB.length);
	}
	
	public static void main(String[] args) {
		vetorporindice();

	}

}
