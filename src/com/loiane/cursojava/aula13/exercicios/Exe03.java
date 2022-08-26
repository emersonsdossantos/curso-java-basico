package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

//Faca um Programa que peça dois números e imprima a soma.

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		
		int num01 = scan.nextInt();
		
		System.out.print("Informe o segundo numero: ");
		
		int num02 = scan.nextInt();
		
		int resultado = num01 + num02;
		
		System.out.println("O resultado da soma entre o primeiro e segundo numero é : " + resultado);

	}

}
