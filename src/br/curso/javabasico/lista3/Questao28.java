package br.curso.javabasico.lista3;

//Números primos identificação
import java.util.Scanner;

public class Questao28 {

	public static void eprimo(int num) {

		int divisores = 0;
		for (int i = 1; i <= num; i++) {
			if ((num % i) == 0) {
				divisores = divisores + 1;
			}
		}

		if (divisores == 2) {
			System.out.println(num + " é um número primo");

		} else {
			System.out.println(num + " não é um número primo");
		}
	}

	public static void main(String[] args) {
		System.out.println("Digite um número inteiro: ");
		int num = new Scanner(System.in).nextInt();
		eprimo(num);
	}
}
