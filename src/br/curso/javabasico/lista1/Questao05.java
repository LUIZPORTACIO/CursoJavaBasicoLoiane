package br.curso.javabasico.lista1;

import java.util.Scanner;

public class Questao05 {
	
	
	public static void converteParaCm() {
		
		System.out.println("Digite uma distancia em metros, que vamos convertem em cm: ");
		
		double mMetro = new Scanner(System.in).nextDouble();
		
		double mCm = mMetro*100;
		
		System.out.println("A sua distância em cm é :"+ mCm);
		
	}
	
	public static void main(String[] args) {
		
		converteParaCm();
		
	}

}
