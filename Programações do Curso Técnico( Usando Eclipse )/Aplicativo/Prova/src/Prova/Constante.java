package Prova;

import java.util.Scanner;

public class Constante 
{

	public static void main(String[] args) 
	{
		Scanner constante = new Scanner(System.in);
		
		final int NUM = 0;
		int a, b, soma;
		
		System.out.println("Digite um n�mero: ");
		a = constante.nextInt();
		
		System.out.println("Digite o  outro n�mero: ");
		b = constante.nextInt();
		
		System.out.printf("\nN�mero fixo: %d", NUM);
		
		soma = (a + b) * NUM;
		
		System.out.printf("\nEst� soma ter� o resultado sempre igual a: %d", soma);
	}

}
