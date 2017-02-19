package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao26 {

	public static void calculafatorial(int numfatorial) {
		System.out.print(numfatorial+"! = ");
		int resultado = 1;
		for (int i = numfatorial; i>1 ; i--) {
			resultado *=i;
			System.out.print(i+" * ");
		}
		System.out.print("1 = "+resultado);
		/*partindo o print para toda a informação ficar na mesma linha*/
	}
	public static void main(String[] args) {
		System.out.println("Qual o número para fatorar ?");
		int numfatorial = new Scanner(System.in).nextInt();
		
		calculafatorial(numfatorial);
	}
}
