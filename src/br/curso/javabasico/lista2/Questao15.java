package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao15 {
	
	public static void etriangulo(int l1, int l2, int l3) {
		if ((l1+l2>l3||l1+l3>l2||l2+l3>l1)&&(l1!=0&&l2!=0&&l3!=0)) {
			System.out.println("É triangulo");
			qualtriangulo(l1, l2, l3);
		} else {
			System.out.println("Não é triangulo");
		}
	}
	
	public static void qualtriangulo(int l1, int l2, int l3) {
		if (l1==l2&&l1==l3&&l2==l3) {
			System.out.println("Triangulo equilatero");
		} else if ((l1==l2&&l1!=l3)||(l1==l3&&l1!=l2)||(l2==l3&&l1!=l3)) {
			System.out.println("Triangulo isoceles");
		} else if(l1!=l2||l1!=l3||l2!=l3) {
			System.out.println("Triangulo escaleno");
		}
	}

	public static void main(String[] args) {
		System.out.println("Digite os 3 números de um poligono");
		int l1 = new Scanner(System.in).nextInt();
		int l2 = new Scanner(System.in).nextInt();
		int l3 = new Scanner(System.in).nextInt();

		etriangulo(l1, l2, l3);
	}

}
