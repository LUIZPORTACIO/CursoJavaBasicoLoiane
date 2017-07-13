package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao18 {

	public static void selecionarmaiormenoridade(int[] grupidades) {

		// int maior = Integer.MIN_VALUE; //Menor valor, por que qualquer valor
		// vai ser maior que ele
		// int menor = Integer.MAX_VALUE; //Maior valor, por que qualquer valor
		// vai ser menor que ele

		

		System.out.println("Digite a idade dos membros de seu grupo: ");

		for (int i = 0; i < grupidades.length; i++) {

			grupidades[i] = new Scanner(System.in).nextInt();

		}

		int posmenor = 0;					// Essas variáveis tem que estar depois de rodar o for de pedidos de idades, para que nunca o menor valor fique zerado.
		int posmaior = 0;
		int menor = grupidades[0];
		int maior = grupidades[0];
		
		for (int i = 0; i < grupidades.length; i++) {
			if (grupidades[i] > maior) {
				maior = grupidades[i];
				posmaior = i;
			} else if (grupidades[i] < grupidades[i]) {
				menor = grupidades[i];
				posmenor = i;
			}			
 
		}
		
		System.out.print("O grupo de idades: ");

		for (int i = 0; i < grupidades.length; i++) {
			System.out.print(grupidades[i] + " ");
		}

		System.out.println();

		System.out.println("O maior valor é: " + maior + " na posição: " + posmaior+"\nO menor valor é: " + menor + " na posição: " + posmenor);
	}

	public static void main(String[] args) {

		int[] grupidades = new int[10];

		selecionarmaiormenoridade(grupidades);

	}
}
