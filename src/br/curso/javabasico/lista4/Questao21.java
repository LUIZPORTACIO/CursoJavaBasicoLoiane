package br.curso.javabasico.lista4;

import java.text.DecimalFormat;
import java.util.Scanner;

//Questão similar a 20 :)
public class Questao21 {

	public static void cotacoesemreais(double cotacaodolar) {
		
		double [] valorreal = new double[3];
		
		DecimalFormat df = new DecimalFormat("#0.000");
		
		for (int i = 0; i < valorreal.length; i++) {
			switch (i) {
			case 0:
				valorreal[i] = cotacaodolar*(i+1);
				System.out.println("Dolar comercial: "+df.format(valorreal[i])+" reais");
				
				break;
				
			case 1:
				
				valorreal[i] = cotacaodolar*(i)-(0.1*(cotacaodolar*(i)));
				System.out.println("Dolar paralelo: "+df.format(valorreal[i])+" reais");
				
				break;
				
			case 2:
				valorreal[i] = cotacaodolar*(i-1)+(0.1*(cotacaodolar*(i-1)));
				System.out.println("Dolar turismo: "+df.format(valorreal[i])+" reais");

				break;
			default:
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Digite a cotação do dolar:");
		
		double cotacaodolar = new Scanner(System.in).nextDouble();
		
		cotacoesemreais(cotacaodolar);
		

	}

}
