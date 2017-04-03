package br.curso.javabasico.lista4;

public class Questao12 {
	
	public static void somavetor() {
		
	int[] vetorA = new int[] {1,2,3,4,5,6,7,8,9,10};
	int sum = 0;	
	
		System.out.println("Os pares:");
		 for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
			 sum += vetorA[i];
		}
		 
		 System.out.println("\nA soma do vetor: "+sum+"\nO tamanho vetor A: " + vetorA.length );
		
	}

	public static void main(String[] args) {
		somavetor();

	}

}
