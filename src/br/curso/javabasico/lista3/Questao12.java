package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao12 {

	public static void geradortabuada(int num) {
		
		for (int i = 1; i <= 10; i++) {
			
			int resultado = num*i;
			System.out.println(num+" x "+i+" = "+resultado);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Digite de qual número é a tabuada ? ");
		int num = new Scanner(System.in).nextInt();
		System.out.println("Tabuada de "+num);
		
		geradortabuada(num);

	}

}
