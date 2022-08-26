package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

//Faca um Programa que peca as 4 notas bimestrais e mostre a media.

public class Exe04 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a nota 01: ");
		double nota01 = scan.nextDouble();
		
		System.out.println("Informe a nota 02: ");
		double nota02 = scan.nextDouble();
		
		System.out.println("Informe a nota 03: ");
		double nota03 = scan.nextDouble();
		
		System.out.println("Informe a nota 04: ");
		double nota04 = scan.nextDouble();
		
		double media = (nota01 + nota02 + nota03 + nota04) / 4;
		
		System.out.println("A media da soma das notas é: " + media);

	}

}
