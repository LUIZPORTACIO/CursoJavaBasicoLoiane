package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao25 {

	public static void comparandovetores(int[] vetA, int[] vetB) {

		for (int i = 0; i < vetA.length; i++) {

			System.out.println("Digite o vetor " + (i + 1));
			vetA[i] = new Scanner(System.in).nextInt();
			
			vetB[i] = (vetA[i]%2 == 0) ? 1 : 0; //Operador ternário
		}
		
		for (int i = 0; i < vetA.length; i++) {
			System.out.println("vetor A: "+vetA[i]+"\tposição: "+(i+1)+"\tvetor B: "+vetB[i]+"\tposição: "+(i+1));
			
		}
	}

	public static void main(String[] args) {
		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];
		
		comparandovetores(vetA, vetB);

	}

}

/* Para ficar mais elegante, use o ternário.
if (vetA[i] % 2 == 0) {

	vetB[i] = 1;
}
if (vetA[i] % 2 != 0) {

	vetB[i] = 0;
}*/
