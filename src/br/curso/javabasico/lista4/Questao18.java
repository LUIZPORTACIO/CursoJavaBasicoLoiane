package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao18 {

	public static void selecionarmaiormenoridade(int[] grupidade) {

		int posmenor = 0;
		int posmaior = 0;
		int maior = Integer.MIN_VALUE; //Menor valor, por que qualquer valor vai ser maior que ele
		int menor = Integer.MAX_VALUE; //Maior valor, por que qualquer valor vai ser menor que ele

		System.out.println("Digite a idade dos membros de seu grupo: ");

		for (int i = 0; i < grupidade.length; i++) {

			grupidade[i] = new Scanner(System.in).nextInt();

			if (grupidade[i] < menor) {
				menor = grupidade[i];
				posmenor = i;
			}

			if (grupidade[i] > maior) {
				maior = grupidade[i];
				posmaior = i;
			}
		}

		System.out.println("O menor valor é: " + menor + " na posição: " + posmenor + "\nO maior valor é: " + maior
				+ " na posição: " + posmaior);

	}

	public static void main(String[] args) {

		int[] grupidade = new int[10];
		
		selecionarmaiormenoridade(grupidade);

	}

}
