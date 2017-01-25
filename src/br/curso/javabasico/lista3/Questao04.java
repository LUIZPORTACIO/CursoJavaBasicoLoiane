package br.curso.javabasico.lista3;

public class Questao04 {

	public static void main(String[] args) {
		int cont = 0;
		Double popA = 80000.0;
		Double popB = 200000.0;
		do {
			
			popA = popA + (0.03 * popA);

			popB = popB + (0.015 * popB);

			cont++;

			System.out.println("Foram: " + cont + " anos");
		} while (popA <= popB);
		
	}

}
