package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao22 {
	 
	public static void totalfeira(String fruta1, String fruta2, double quantmorango, double quantmaca) {
		Double parcialMorango = 0.0;
		if (fruta1.equalsIgnoreCase("Morango") && quantmorango <= 5) {
			Double preco = 2.50;
			parcialMorango = quantmorango * preco;} 
		
		if (fruta1.equalsIgnoreCase("Morango") && quantmorango > 5) {
			Double preco = 2.20;
			parcialMorango = quantmorango * preco;}
		
		Double parcialMaca = 0.0;
		if (fruta2.equalsIgnoreCase("Maçã") && quantmaca <= 5) {
			Double preco = 1.80;
			parcialMaca = quantmaca * preco; } 
		if (fruta2.equalsIgnoreCase("Maçã") && quantmaca > 5) {
			Double preco = 1.50;
			parcialMaca = quantmaca * preco;}
		
		Double totalquantFruta = quantmorango + quantmaca;
		Double totalvalorFruta = parcialMaca + parcialMorango;

		if (totalquantFruta > 8 || totalvalorFruta > 25.0) {
			Double total = totalvalorFruta - (totalvalorFruta * 0.10);
			System.out.println("Total a pagar: " + total);
		} else {
			Double total = totalvalorFruta;
			System.out.println("Total a pagar: " + total);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Vamos a feira. Qual a quantidade de morango ? ");
		String fruta1 = "Morango";
		Double quantmorango = new Scanner(System.in).nextDouble();
		System.out.println("Qual a quantidade de maçã?");
		String fruta2 = "Maçã";
		Double quantmaca = new Scanner(System.in).nextDouble();
		totalfeira(fruta1, fruta2, quantmorango, quantmaca);
	}

}
