package br.curso.javabasico.lista2;

import java.util.Scanner;

public class Questao12 {

	public static void descontosEmFolha(Double salarioBruto, Double percIRRF) {

		Double dSindicato = salarioBruto * 0.03;
		Double dIRRF = salarioBruto * percIRRF;
		Double dINSS = salarioBruto * 0.01;
		Double dFGTS = salarioBruto * 0.11;
		Double descontos = dSindicato + dIRRF + dINSS;
		Double salarioLiquido = salarioBruto - descontos;

		System.out.println("Salario Bruto: " + salarioBruto + "\nSindicato: " + dSindicato + "\nIRRF(perc.): " + percIRRF
				+ "\nIRRF: " + dIRRF + "\nINSS: " + dINSS + "\nFGTS: " + dFGTS + "\nTotal de descontos: " + descontos
				+ "\nSalario liquido: " + salarioLiquido);
	}

	public static void calculaSalario(Double salarioBruto) {

		Double percIRRF = 0.0;
		if (salarioBruto <= 900) {
			percIRRF = 0.0;
			descontosEmFolha(salarioBruto, percIRRF);

		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percIRRF = 0.05;
			descontosEmFolha(salarioBruto, percIRRF);
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percIRRF = 0.10;
			descontosEmFolha(salarioBruto, percIRRF);
		} else if (salarioBruto > 2500) {
			percIRRF = 0.20;
			descontosEmFolha(salarioBruto, percIRRF);
		}
	}

	public static void main(String[] args) {
		System.out.println("Informe a quantidade de horas trabalhadas e o seu valor de hora trabalhada");
		Double quantHorastrabalhas = new Scanner(System.in).nextDouble();
		Double valHorastrabalhas = new Scanner(System.in).nextDouble();

		Double salarioBruto = quantHorastrabalhas * valHorastrabalhas;
		calculaSalario(salarioBruto);
	}
}
