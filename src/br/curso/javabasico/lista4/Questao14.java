package br.curso.javabasico.lista4;

public class Questao14 {
	
	public static void somaimparesvetores() {
		
		int[] vetorA = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		double cont = 0.0;
		
		for (int i = 0; i < vetorA.length; i++) {
			if ((vetorA[i] % 2) != 0) {

				System.out.print(vetorA[i] + " ");
				sum += vetorA[i];
				cont++;
			}
		}
		System.out.println("\nSoma impares: "+sum+ "\nA quantidade de impares: "+cont+"\nA média da soma dos vetores com números impares é: "+sum/cont);
		
	}

	public static void main(String[] args) {
		somaimparesvetores();

	}

}
