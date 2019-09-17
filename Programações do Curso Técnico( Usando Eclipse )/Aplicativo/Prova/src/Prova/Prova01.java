package Prova;

import java.util.Scanner;

public class Prova01 
{

	public static void main(String[] args) 
	{
		
		Scanner prova = new Scanner (System.in);
		int soma, a, b;
		
		System.out.print("Digite um número: ");
		a = prova.nextInt();
		
		System.out.println("Digite outro um número: ");
		b = prova.nextInt();
		
		soma = a + b;
		System.out.printf("Soma: %d", soma);
		
		do
		{
			System.out.println("Cherosol!");
		}

		while(soma>10);
	}
	}


