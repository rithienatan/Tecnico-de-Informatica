package AvaliativodeRepeticao;

import java.util.Scanner;

public class Exe2 
{

	public static void main(String[] args) 
	{
		Scanner yoshi = new Scanner(System.in);
		
		float salario = 1000, ano, add, total, all, atall;
		
		for(float x = 2009; x >= 2009; x++)
		{
			if (x >= 2009)
			{
				System.out.print("Digite o ano: ");
				ano = yoshi.nextFloat();
				
				add = (float) (salario*0.015);
				System.out.printf("O adicional é: %f", add);
				
				total = salario + add;
				System.out.printf("\nO salario total sem ser multiplicado por 2: %f", total);
				
				all = (add*2)*(ano-x);
				System.out.printf("\nO adiciona do ano requisitado: %f", all);
				
				atall = total + all;
				System.out.printf("\nSalário Total: %f", atall);	
				
			}
			break;
		}
	}
}