package br.curso.javabasico.lista4;


public class Questao22 {
	
	public static void porcentagemzeroouum(int []vetorA) {
		
		double contzero = 0;
		double contum = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = (int) Math.round(Math.random()*1);
			
			if (vetorA[i]==0) {
				contzero++;
			} else {
				contum++;
			}
			
			System.out.print(vetorA[i]+" ");
		}
		
		System.out.println("\nO percentual de zeros: "+(100*(contzero/10))+"\nO percentual de um: "+(100*(contum/10)));
			
	}
	
	public static void main(String[] args) {

		int []vetorA = new int[10];
		
		porcentagemzeroouum(vetorA);
		}

}

/*
 * 
    Math.random() retorna um número aleatório, do tipo double, no intervalo de 0.0 até 1.0;
    Math.random() * 10 tem como resultado um número no intervalo de 0.0 até 10.0;
    Math.round(Math.random() * 10) retorna um número do tipo long mais próximo (ou arredondado) do resultado;
    (int) faz a conversão (ou coerção, em inglês "cast") do tipo long para o tipo int.
  
 */
 