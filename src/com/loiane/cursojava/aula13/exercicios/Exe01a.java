package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exe01a {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scan.next();
		System.out.println("Seu nome é " + nome);
	}

}
