package br.curso.javabasico.lista3;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Scanner;

public class Questao31 {

	public static void calculasalario(double salarioano95) {
		double percaumento = 1.5;
		double salario = salarioano95+(percaumento*(salarioano95/100));
		int anoatual = GregorianCalendar.getInstance().get(Calendar.YEAR);//Forma de colocar o ano atual
		DecimalFormat forma = new DecimalFormat("###,###.##");//Arredondar para duas casas decimais
		
		System.out.println(forma.format(salario) +" ano: 1996 "+" percentual de aumento: "+ percaumento+"%");
		
		for (int i = 1997; i <= anoatual ; i++) {
			
			percaumento *=2;
			
			salario += percaumento*(salario/100);
			
			System.out.println(forma.format(salario) +" ano: "+i+" percentual de aumento: "+ percaumento+"%");
			
		}
		System.out.println("\nO salario no ano "+anoatual+ " é de: "+ forma.format(salario));
		
	}
	
	public static void main(String[] args) {
		System.out.println("Qual o seu salário em 1995?");
		double salarioano95 = new Scanner(System.in).nextDouble();
		
		calculasalario(salarioano95);

	}

}
