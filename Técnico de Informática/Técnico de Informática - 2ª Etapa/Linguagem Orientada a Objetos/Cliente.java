package Exerc�cio;

import java.util.Scanner;

public class Cliente 

{
     public static void main(String[] args)
     {
	     Scanner input = new Scanner(System.in);
	
	     float pre�o;
	     float desconto = 5;

	     System.out.print("Digite o pre�o do produto: ");
	     pre�o = input.nextFloat();
	
	     if (pre�o < 100)
	     {
	    	 System.out.print("N�o h� desconto" + "\nTotal a pagar: " + pre�o);
	     }
	     
	     else if (pre�o >= 1000)
	     {
	    	 System.out.print("Desconto de : 50.00" + "\n Total a pagar: " + (pre�o - 50));
	     }
	     
	     else
	     {
	    	 System.out.print("Desconto de: " + (int)(pre�o /100) * desconto 
	    	 + "\nTotal a pagar: " + (pre�o - (int)(pre�o /100) * desconto));
	     }
	 }
}