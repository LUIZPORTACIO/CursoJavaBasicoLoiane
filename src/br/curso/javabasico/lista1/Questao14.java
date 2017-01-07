package br.curso.javabasico.lista1;

import java.util.Scanner;

public class Questao14 {

	private static void tempoDownload(double tamarquivo, double velocMbps) {
		
		double tempoDownload = Math.ceil((tamarquivo/velocMbps)/60);
		
		System.out.println("O tempo de download em minutos é: "+tempoDownload);
	}
	public static void main(String[] args) {
		System.out.println("Digite o tamanho do arquivo em MB e a velocidade de conexão em Mbps: ");
		
		double tamarquivo = new Scanner(System.in).nextDouble();
		double velocMbps = new Scanner(System.in).nextDouble();
		
		tempoDownload(tamarquivo, velocMbps);

	}

}
