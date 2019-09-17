package Exercício01;

public class E01C01 implements E01I01, E01I02
{
	private int A;
	private int B;
	private int C;
	
	@Override
	public int getB() 
	{	
		return this.B;
	}
	@Override
	public void subtrair(int variavel) 
	{	
		this.B = variavel - C;
	}
	@Override
	public int getA() 
	{	
		return this.A;
	}
	@Override
	public void somar(int variavel) 
	{
		this.A = variavel + C;	
	}
}
