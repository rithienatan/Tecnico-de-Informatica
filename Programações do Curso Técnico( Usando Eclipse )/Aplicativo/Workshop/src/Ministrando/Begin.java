/*Este primeiro programa mostrará como cria o projeto java, pacote, classe
Utilização de metodos, criação de variáveis, instanciação de objetos
Operador de incremento, decremento, igualdade, diferença, dupla atribuição, condicional(if and else) e 
converção para ternária */

//Criação do projeto, pacote e classe

package Ministrando;

//metodo usado para a criação do programa: "Scanner"

import java.util.Scanner;

public class Begin 
{

//segundo metodo utilizado "public static void main(String[] args)"
	
	public static void main(String[] args) 
	{

//instanciação de objeto
	
	Scanner teste = new Scanner(System.in);

//Criação da variável,operador de incremento, operador de decremento
	
	int a = 1, b = 5, c = ++a, d = --a, num, soma, x = 1; 

//imprimindo um comando e operador de dupla atribuição
    
	soma = a += b;
	
	System.out.printf("Variável a: %d\n", a);
	System.out.printf("Variável b: %d\n", b);
	System.out.printf("Variável c: %d\n", c);
	System.out.printf("Variável d: %d\n", d);
	System.out.printf("Valor da soma é: %d\n", soma);

	
	System.out.println("Digite um número: ");
	num = teste.nextInt();

//condição, ternária, igualdade e diferença
	
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