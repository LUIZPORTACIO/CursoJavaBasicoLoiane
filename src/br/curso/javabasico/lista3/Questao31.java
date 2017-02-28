package br.curso.javabasico.lista3;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Scanner;

public class Questao31 {

	public static void calculasalario(double salarioano95) {
		double percaumento = 0.015;
		double salario = salarioano95+(percaumento*salarioano95);
		int anoatual = GregorianCalendar.getInstance().get(Calendar.YEAR);//Forma de colocar o ano atual
		DecimalFormat forma = new DecimalFormat("0.00");//Arredondar para duas casas decimais
		
		for (int i = 1996; i <= anoatual ; i++) {
			salario = salario+(percaumento*salario);
			
			System.out.println(forma.format(salario) +" i "+i+" percaumento "+ percaumento);
			percaumento = 2*percaumento;
		}
		System.out.println("o salario no ano "+anoatual+ " é de: "+ forma.format(salario));
		
	}
	
	public static void main(String[] args) {
		System.out.println("Qual o seu salário em 1995?");
		double salarioano95 = new Scanner(System.in).nextDouble();
		
		calculasalario(salarioano95);

	}

}
