package Prova;

import java.util.ArrayList;

public class Lista 
{

	public static void main(String[] args) 
	{
		ArrayList<Partearray>contatos = new ArrayList<>();
		
	    Partearray first = new Partearray();
	    
	    first.setnome("Teste");
	    first.setemail("teste.com");
	    
	    contatos.add(first);
	    
	    for(int i = 0; i < contatos.size(); i++)
	    {
	    	System.out.println("Nome: " + contatos.get(i).getnome());
	    	System.out.println("Email: " + contatos.get(i).getemail());
	    	System.out.println("---------------------------------------");
	    }

	}

}
