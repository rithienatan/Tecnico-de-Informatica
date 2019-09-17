package Exercício;

import java.util.Scanner;

public class Cliente 

{
     public static void main(String[] args)
     {
	     Scanner input = new Scanner(System.in);
	
	     float preço;
	     float desconto = 5;

	     System.out.print("Digite o preço do produto: ");
	     preço = input.nextFloat();
	
	     if (preço < 100)
	     {
	    	 System.out.print("Não há desconto" + "\nTotal a pagar: " + preço);
	     }
	     
	     else if (preço >= 1000)
	     {
	    	 System.out.print("Desconto de : 50.00" + "\n Total a pagar: " + (preço - 50));
	     }
	     
	     else
	     {
	    	 System.out.print("Desconto de: " + (int)(preço /100) * desconto 
	    	 + "\nTotal a pagar: " + (preço - (int)(preço /100) * desconto));
	     }
	 }
}