package AvaliativodeRepeticao;

import java.util.Scanner;

public class Exe1 
{

	public static void main(String[] args) 
	{
		Scanner repeat = new Scanner(System.in);
		
		System.out.print("                  Tabuada de Adição");
		System.out.println("\n-------------------------------------------------------");

		System.out.print(" +  |");

		for(int i = 1; i <= 10; i++)
		{
		String yo = String.format("%02d",i);
		System.out.print(" " + yo + " |");
		}
		System.out.print("\n-------------------------------------------------------\n");

		for(int i = 1; i <= 10; i++)
		{
		String yo = String.format("%02d",i);
		System.out.print(yo + "  |");

		for(int j = 1; j <= 10; j++)
		{
		String yeah = String.format("%02d",i+j);
		System.out.print(yeah + "  |");
		}
		System.out.println();
		}
	}

}
