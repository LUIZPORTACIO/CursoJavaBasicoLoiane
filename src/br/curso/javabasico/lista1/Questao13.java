package br.curso.javabasico.lista1;

import java.util.Scanner;

public class Questao13 {

	private static void resumoSalarial(double valorhoratrabalhada, double qhorastrabalhadas) {

		double salariobruto = valorhoratrabalhada * qhorastrabalhadas;

		double pINSS = Math.ceil(0.08 * salariobruto);

		double pIRRF = Math.ceil(0.11 * salariobruto);

		double pSindicato = Math.ceil(0.05 * salariobruto);

		double salarioliquido = salariobruto - (pINSS + pIRRF + pSindicato);

		System.out.println("Salario bruto: " + salariobruto + "\nINSS: " + pINSS + "\nIRRF: " + pIRRF + "\nSindicato: "
				+ pSindicato + "\nSalario liquido: " + salarioliquido);

	}

	public static void main(String[] args) {
		System.out.println("Digite o seu valor de hora trabalhada e a quantidade de horas: ");
		
		double valorhoratrabalhada = new Scanner(System.in).nextDouble();
		double qhorastrabalhadas = new Scanner(System.in).nextDouble();
		
		resumoSalarial(valorhoratrabalhada, qhorastrabalhadas);

	}

}
