package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

/* Fa�a um Programa que pe�a um n�mero e ent�o mostre a 
mensagem O n�mero informado foi [n�mero]*/

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int numero = scan.nextInt();		
		System.out.println("O numero informado foi: " + numero);
				
	}

}
