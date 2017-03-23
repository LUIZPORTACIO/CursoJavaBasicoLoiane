package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao30 {

	public static void tabuada(int num) {
		System.out.println("Digite os fatores inicial e final");
		int fatorinicial = new Scanner(System.in).nextInt();
		int fatorfinal = new Scanner(System.in).nextInt();

		while (fatorinicial > fatorfinal) {
			System.out.println("Troque os fatores(inicial e final)");
			fatorinicial = new Scanner(System.in).nextInt();
			fatorfinal = new Scanner(System.in).nextInt();
		}

		System.out.println("Tabuada de "+num+" fator inicial: "+fatorinicial+" fator final: "+fatorfinal+"\n" );
		for (int i = fatorinicial; i <= fatorfinal; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

	public static void main(String[] args) {
		System.out.println("Tabuada. Digite um número:");
		int num = new Scanner(System.in).nextInt();

		tabuada(num);
	}
}
