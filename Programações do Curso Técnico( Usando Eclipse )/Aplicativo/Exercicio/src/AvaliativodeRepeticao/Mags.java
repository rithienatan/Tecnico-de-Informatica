package AvaliativodeRepeticao;

import java.util.*;

public class Mags 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		float a, b, c, d, e, f, soma = 0, media, maximo = 0, minimo = 0;
		String nome, endereco;
		int r = 1;
		
		while (r == 1)
		{
			System.out.println("Digite o seu nome: ");
			nome = input.nextLine();
			System.out.print("Digite o seu endereço: ");
			endereco = input.nextLine();
			
			System.out.println("Digite a primeira nota: ");
			a = input.nextFloat();
			maximo = a;
			minimo = a;
			
			System.out.println("Digite a segunda nota: ");
			b = input.nextFloat();
			if (b > maximo)
			{
				minimo = maximo;
				maximo = b; 
			}
			
			System.out.print("Digite a terceira nota: ");
			c = input.nextFloat();
			if (c > maximo)
			{
			 maximo = c; 
			}
			if (c < minimo)
			{
				minimo = c;
			}
			
			System.out.print("Digite a quarta nota: ");
			d = input.nextFloat();
			if (d > maximo)
			{
				minimo = maximo;
				maximo = d; 
			}
			if (d < minimo)
			{
				minimo = d;
			}
			
			System.out.print("Digite a quinta nota: ");
			e = input.nextFloat();
			if (e > maximo)
			{
				minimo = maximo;
				maximo = e; 
			}
			if (e < minimo)
			{
				minimo = e;
			}
			
			System.out.print("Digite a sexta nota: ");
			f = input.nextFloat();
			if (f > maximo)
			{
				minimo = maximo;
				maximo = f; 
			}
			if (f < minimo)
			{
				minimo = f;
			}
			
			soma = a+b+c+d+e+f;
			media = soma/6;
			
			if ((media >= 7) & (a > 5) & (b > 5) & (c > 5) & (d > 5) & (e > 5) & (f > 5))
			{
				System.out.printf("%s está aprovado!\n", nome);
			}
			else
			{
				System.out.printf("%s está reprovado!\n", nome);
			}
			
			System.out.printf("Resultado: %f \n", soma);
			System.out.printf("Média: %f \n", media);
			System.out.printf("Maior nota: %f \n", maximo);
			System.out.printf("Menor nota: %f \n", minimo);
			
			System.out.print("Deseja fazer mais algum calculo? (Digite 0 para sim ou 1 para não)\n");
			r = input.nextInt();
			
			r++;
		}
	}
}
