package br.curso.javabasico.lista3;

import java.util.Scanner;

public class Questao02 {

	public static void validarSenha(String usuario, String senha) {
		
		while (usuario.equals(senha)) {
			System.out.println("Usuario e senha iguais. Troque a senha");
			usuario = new Scanner(System.in).next();
			senha = new Scanner(System.in).next();
		}
		System.out.println("Usuario e senha cadastrados com sucesso.");
	}

	public static void main(String[] args) {
		System.out.println("Cadastre o usuário e senha.");
		String usuario = new Scanner(System.in).next();
		String senha = new Scanner(System.in).next();

		validarSenha(usuario, senha);
	}

}
