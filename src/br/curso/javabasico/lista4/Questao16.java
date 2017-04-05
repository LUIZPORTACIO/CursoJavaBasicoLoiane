package br.curso.javabasico.lista4;

import java.util.Scanner;

public class Questao16 {

	public static void calculoselementos() {
		int sum = 0;
		int cont = 0;
		int summaisquinze = 0;
		int contmaisquinze = 0;

		int[] elementos = new int[10];
		System.out.println("Digite 10 elementos ?");

		for (int i = 0; i < elementos.length; i++) {

			elementos[i] = new Scanner(System.in).nextInt();

			sum += elementos[i];

			if (elementos[i] == 15) {
				cont++;
			}

			if (elementos[i] > 15) {
				summaisquinze += elementos[i];
				contmaisquinze++;
			}
		}
		if (sum <= 15) {
			System.out.println("A soma dos elementos é menor que 15, a soma é:" + sum);

		} else {
			System.out.println("A soma dos elementos são maiores que quinze. ;(");
		}

		System.out.println("A quantidade de elementos que são o  15 são: " + cont);
		System.out.println("A média dos elementos maiores que quinze são: " + summaisquinze / contmaisquinze);


	}
	public static void main(String[] args) {

		calculoselementos();
			}

}
