package com.thiago.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("Valor1 � 1 And valor2 � 2 - resultado: "+resultado1);
		
		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		System.out.println("Valor1 � 1 And valor2 � 2 - resultado: "+resultado2);

		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(verdadeiro && falso);
		
	} 

}