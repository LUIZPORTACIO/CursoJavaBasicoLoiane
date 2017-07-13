package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao33 {

	public static void vetorprimos(int[] vetA) {

		boolean eprimo;
		String msg;

		for (int i = 0; i < vetA.length; i++) {

			System.out.println("Digite o vetor " + (i + 1));
			vetA[i] = new Scanner(System.in).nextInt();
		}

		//Uma maneira de se verificar um número primo
		for (int i = 0; i < vetA.length; i++){

			eprimo = true;
			for (int j = 2; j < vetA[i]; j++) {
				if (vetA[i] % j == 0) {
					eprimo = false;
					
					break;
				}
				//System.out.println("--"+vetA[i]+"dividido por "+j);
				//Mostra que um número primo é divisivel por um e por ele mesmo
			}

			msg = "";
			if (eprimo) {
				msg = " primo";
			} else {
				msg = " não é primo";
			}

			System.out.println(vetA[i] + msg);
		}
	}

	public static void main(String[] args) {
		int[] vetA = new int[10];

		vetorprimos(vetA);
	}
}
