/*Este primeiro programa mostrar� como cria o projeto java, pacote, classe
Utiliza��o de metodos, cria��o de vari�veis, instancia��o de objetos
Operador de incremento, decremento, igualdade, diferen�a, dupla atribui��o, condicional(if and else) e 
conver��o para tern�ria */

//Cria��o do projeto, pacote e classe

package Ministrando;

//metodo usado para a cria��o do programa: "Scanner"

import java.util.Scanner;

public class Begin 
{

//segundo metodo utilizado "public static void main(String[] args)"
	
	public static void main(String[] args) 
	{

//instancia��o de objeto
	
	Scanner teste = new Scanner(System.in);

//Cria��o da vari�vel,operador de incremento, operador de decremento
	
	int a = 1, b = 5, c = ++a, d = --a, num, soma, x = 1; 

//imprimindo um comando e operador de dupla atribui��o
    
	soma = a += b;
	
	System.out.printf("Vari�vel a: %d\n", a);
	System.out.printf("Vari�vel b: %d\n", b);
	System.out.printf("Vari�vel c: %d\n", c);
	System.out.printf("Vari�vel d: %d\n", d);
	System.out.printf("Valor da soma �: %d\n", soma);

	
	System.out.println("Digite um n�mero: ");
	num = teste.nextInt();

//condi��o, tern�ria, igualdade e diferen�a
	
	if (num == x)
	{
		System.out.println("OK. De certo!");
	}
	else if (num != x)
	{
		System.out.println("Fail!");
	}
	
	//System.out.print((num == x)?("OK. DEU CERTO!"):(num != x)?("Fail!"):(""));
	}
}