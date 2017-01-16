package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao21 {
	
	public static void tabGasolina(double qcombustivel) {
		Double preco = 2.50;
		if (qcombustivel<=20) {
			Double totalCombustivel = (qcombustivel*preco)-((qcombustivel*preco)*0.03);
			System.out.println("Gasolina - "+"Total: "+totalCombustivel);
		} else {
			Double totalCombustivel = (qcombustivel*preco)-((qcombustivel*preco)*0.05);
			System.out.println("Gasolina - "+"Total: "+totalCombustivel);
		}
	}
	
	public static void tabAlcool(double qcombustivel) {
		Double preco = 1.90;
		if (qcombustivel<=20) {
			Double totalCombustivel = (qcombustivel*preco)-((qcombustivel*preco)*0.04);
			System.out.println("Alcool - "+"Total: "+totalCombustivel);
		} else {
			Double totalCombustivel = (qcombustivel*preco)-((qcombustivel*preco)*0.06);
			System.out.println("Alcool - "+"Total: "+totalCombustivel);
		}
	}
	
	public static void tipoCombustivel(String tcombustivel, double qcombustivel) {
		if (tcombustivel.equalsIgnoreCase("Gasolina")) {
			tabGasolina(qcombustivel);
		}
		if (tcombustivel.equalsIgnoreCase("Alcool")) {
			tabAlcool(qcombustivel);
		}
	}
	public static void main(String[] args) {
		System.out.println("Digite  qual o combustivel e a quantidade para abastecer: ");
		String tcombustivel = new Scanner(System.in).next();
		Double qcombustivel = new Scanner(System.in).nextDouble();
		tipoCombustivel(tcombustivel, qcombustivel);
		
	}

}
