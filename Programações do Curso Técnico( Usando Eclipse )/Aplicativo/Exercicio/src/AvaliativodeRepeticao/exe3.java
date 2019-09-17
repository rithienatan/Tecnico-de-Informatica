package AvaliativodeRepeticao;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) 
	{
 
      Scanner yoshi = new Scanner (System.in);
      int num, fatorial = 1;
      int contadora = 1;

      do
      {
         System.out.println("Digite um número: ");
          num = yoshi.nextInt();
          
          for(int i=1; i <= num; i++)
          {
              fatorial = fatorial * i;
          }
          
          System.out.println( "O Fatorial de: " + num + " = " + fatorial);
          contadora ++;
          
     } 
      while (contadora < 2);

	}

}
