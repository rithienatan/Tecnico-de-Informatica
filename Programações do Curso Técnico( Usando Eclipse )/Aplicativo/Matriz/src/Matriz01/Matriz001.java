package Matriz01;

import java.util.*;

public class Matriz001 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int m[][] = new int[3][3]; // primeira matriz 
		int multi[][] = new int[3][1]; // segunda matriz
		int t [][] = new int[3][1]; // matriz final
		int i,j,r,s,p,q; // variaveis para declarar linha e coluna no comando "for"
		int x1, x2, x3; // variaveis para armazenar o resultado da multiplicação da primeira e segunda matriz
		
// Primeiro "for". Criado para mostrar a primeira matriz
		for (i=0; i<3; i++) 
		{
		      for (j=0; j<3; j++) 
		      {
		    	  m[0][0] = 1;
		    	  m[0][1] = -3;
		    	  m[0][2] = 2;
		    	  
		    	  m[1][0] = 0;
		    	  m[1][1] = 2;
		    	  m[1][2] = 3;
		    	  
		    	  m[2][0] = 0;
		    	  m[2][1] = 0;
		    	  m[2][2] = -12;		    	  
		      }
		}
		for (i=0; i<3; i++) // este for foi usado somente para mostrar resultado
		{
		   System.out.printf("Variavel m: %da. linha: ", (i+1));
		   for (j=0; j<3; j++) 
		   {
		        System.out.printf("%d ", m[i][j]);
		   }
		        System.out.printf("\n");
		}
		
		System.out.printf("\n");
// Segundo "for". Usado para declarar a segunda matriz
		for (r=0; r<3; r++) 
		{
		      for (s=0; s<1; s++) 
		      {
		    	  multi[0][0] = 11;
		    	  multi[1][0] = 7;
		    	  multi[2][0] = -36; 		    	  
		      }
		}
		for (r=0; r<3; r++)// este for foi usado somente para mostrar resultado
		{
		   System.out.printf("Variavel multi: %da. linha: ", (r+1));
		   for (s=0; s<1; s++) 
		   {
		        System.out.printf("%d ", multi[r][s]);
		   }
		        System.out.printf("\n");
		}
		
		System.out.printf("\n");
// formulas para achar o resultado da multiplicação da primeira e segunda matriz		
		x3 = (multi[2][0]) / ((m[2][0]) + (m[2][1]) + (m[2][2]));
		System.out.println("Valor de x3: " + x3); // Só pra mostrar o resultado da variavel
		x2 = ((multi[1][0]) - (m[1][2]*x3)) / ((m[1][0]) + (m[1][1]));
		System.out.println("Valor de x2: " + x2); // Só pra mostrar o resultado da variavel
		x1 = ((multi[0][0]) - (m[0][2]*x3) - (m[0][1]*x2)) / (m[0][0]);
		System.out.println("Valor de x1: " + x1); // Só pra mostrar o resultado da variavel
		
		System.out.printf("\n");
/* O ultimo "for". Para mostrar o resultado da multiplicação da primeira e segunda matriz 
   em forma de matriz		
 */
		for (p=0; p<3; p++) 
		{
		      for (q=0; q<1; q++) 
		      {
		    	  t[0][0] = x1;
		    	  t[1][0] = x2;
		    	  t[2][0] = x3; 		    	  
		      }
		}
		for (p=0; p<3; p++) // este for foi usado somente para mostrar resultado
		{
		   System.out.printf("Total da multiplicação da matriz m e multi : %da. linha: ", (p+1));
		   for (q=0; q<1; q++) 
		   {
		        System.out.printf("%d ", t[p][q]);
		   }
		        System.out.printf("\n");
		}
	}
}

