package br.curso.javabasico.lista3;

public class Questao16 {

		public static void serieFibonaci() {

		int n = 1;
		int numfib = 0;
		int numfibant = 1;

		for (int i = 0; i < n; i++) {
			if (i == 0 || i == 1) {
				numfib = 1;
				System.out.print(numfib + " ");
				n++;
			}
			if (i > 1) {
				numfib = numfib + numfibant;
				numfibant = numfib - numfibant;
				
				System.out.print(numfib + " ");
				if (numfib <= 500) {
					n++;
					
				} else {
					System.out.println("Fim");
				}
				
			}

		}
	}

	public static void main(String[] args) {
		serieFibonaci();
	}
}
