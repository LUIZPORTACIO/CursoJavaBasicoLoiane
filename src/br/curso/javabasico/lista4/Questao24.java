package br.curso.javabasico.lista4;

import java.util.Scanner;

//No for de tipagem de palindromo, o um é para retirar a posição zero do tamanho e o i é para deixar na ultima posição e equivalente a posição de inicio como 0-9, 1-8 

public class Questao24 {

	public static void verificapalindromo(int[] vnumero) {

		boolean palindromo = true;
		
		for (int i = 0; i < vnumero.length; i++) {

			System.out.println("Digite o vetor " + (i + 1));
			vnumero[i] = new Scanner(System.in).nextInt();
		}
		
		for (int i = 0; i < vnumero.length/2; i++) {
			
			if (vnumero[i] != vnumero[vnumero.length-1-i]) {
				palindromo = false;
				break;
			}
		}
		
		System.out.print("Números do vetor: ");
		for (int i = 0; i < vnumero.length; i++) {
			System.out.print(vnumero[i]+ " ");
		}
		
		if (palindromo) {
			System.out.println("\nPalindromo !!");
		}else {
			System.out.println("\nNão é palindromo !!");
		}
		
	}

	public static void main(String[] args) {
		int[] vnumero = new int[10];

		verificapalindromo(vnumero);
	}

}

/* Metodo no braço
for (int i = 0, j = 9; i < vnumero.length / 2; i++, j--) {

	System.out.println("i: " + (i + 1) + "---" + " vetor i: " + vnumero[i] + "-------" + " j: " + (j + 1)
			+ "---" + " vetor j: " + vnumero[j]);
}
if (vnumero[0] == vnumero[9] && vnumero[1] == vnumero[8] && vnumero[2] == vnumero[7] && vnumero[3] == vnumero[6]
		&& vnumero[4] == vnumero[5]) {

	System.out.println("É palindromo");

} else {

	System.out.println("Não é palindromo");
}*/
