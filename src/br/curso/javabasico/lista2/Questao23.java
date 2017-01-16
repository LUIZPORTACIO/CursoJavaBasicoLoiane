package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao23 {
	
	public static void tipoCarne(String carne, Double quantcarne, String pagamentocartaotabajara) {
		Double parcialcarne=0.0;
		if (carne.equalsIgnoreCase("File Duplo")&& quantcarne >5 ) {
			Double precocarne = 5.80;
			parcialcarne = precocarne*quantcarne;
		} else {
			Double precocarne = 4.90;
			parcialcarne = precocarne*quantcarne;	}
		
		if (carne.equalsIgnoreCase("Alcatra")&& quantcarne >5 ) {
			Double precocarne = 6.80;
			parcialcarne = precocarne*quantcarne;
		} else {
			Double precocarne = 5.90;
			parcialcarne = precocarne*quantcarne;	}
		
		if (carne.equalsIgnoreCase("Picanha")&& quantcarne >5 ) {
			Double precocarne = 7.80;
			parcialcarne = precocarne*quantcarne;
		} else {
			Double precocarne = 6.90;
			parcialcarne = precocarne*quantcarne;	}
		
		totalCompra(parcialcarne, pagamentocartaotabajara);
		
	}

	public static void totalCompra(double parcialcarne, String pagamentocartaotabajara) {
	
		if (pagamentocartaotabajara.equalsIgnoreCase("sim")) {
			double valordesconto = parcialcarne*0.05;
			Double total = parcialcarne - valordesconto;
			String conta = String.format("%.2f", total);
			String contadesconto = String.format("%.2f", valordesconto);
			System.out.println("O valor do desconto: "+contadesconto+"\tTotal: "+conta);
		} else {
			double valordesconto = 0.0;
			Double total = parcialcarne;
			String conta = String.format("%.2f", total);
			System.out.println("O valor do desconto: "+valordesconto+"\tTotal: "+conta);
		}
	}
	public static void main(String[] args) {
		System.out.println("Qual a carne e qual quantidade ? ");
		String carne = new Scanner(System.in).next();
		double quantcarne = new Scanner(System.in).nextDouble();
		System.out.println("É pagamento com cartão tabajara ?");
		String pagamentocartaotabajara = new Scanner(System.in).next();
		System.out.println("Tipo de carne: "+carne.toUpperCase()+"\tQuantidade: "+quantcarne);
		
		tipoCarne(carne, quantcarne, pagamentocartaotabajara);
		
		
		

	}

}
