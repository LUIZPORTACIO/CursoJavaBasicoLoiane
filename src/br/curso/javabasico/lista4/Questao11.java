package br.curso.javabasico.lista4;

public class Questao11 {
	
	public static void osparesdosvetores() {
		int[] vetorA = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int qtdpares = 0;
		
		System.out.println("Os pares:");
		 for (int i = 0; i < vetorA.length; i++) {
			 if ((vetorA[i]%2)==0) {
				
				 System.out.print(vetorA[i] +" ");
				 qtdpares++;
			}
		}
		 
		 System.out.println("\nO tamanho vetor A: " + vetorA.length+" quantidade de pares: "+qtdpares );
	}

	public static void main(String[] args) {
		osparesdosvetores();

	}

}
