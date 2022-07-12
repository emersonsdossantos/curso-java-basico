package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("O nome digitado foi: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("A sua idade e: " + idade + " anos");
		
		System.out.println("Qual a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("A sua altura e:" + altura);*/
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem Pet");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte quatidadeFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voce digitou os seguintes valores: ");
		System.out.println("Primeiro nome: "+ primeiroNome);
		System.out.println("Idade: "+ idade);
		System.out.println("Quantidade de Filhos: "+ quatidadeFilhos);
		System.out.println("Sua altura: "+ altura);
		System.out.println("Tem pet: " + temPet);
		
		
		

	}

}
