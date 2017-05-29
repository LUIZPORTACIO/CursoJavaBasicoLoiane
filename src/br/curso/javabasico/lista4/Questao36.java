package br.curso.javabasico.lista4;

public class Questao36 {
	
	public static void vetoreselevadonabase2(int [] vetA) {
		
		System.out.print("Os valores dos vetores de 2 elevado a posição do vetor."+"\nVetores valores: ");
		for (int i = 0; i < vetA.length; i++) {
			
			vetA[i] = (int) Math.pow(2,i); //A função Math necessita de cast para valores int
			
			System.out.print(vetA[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		int [] vetA = new int[11];
		
		vetoreselevadonabase2(vetA);

	}

}
