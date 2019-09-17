package Prova;

public class Ponto 
{
	protected double x, y;
	
	public Ponto()
	{
		setPonto( 0, 0 );
	}
	public Ponto( double a, double b )
	{
		setPonto ( a, b);
	}
	
	public void setPonto ( double a, double b)
	{
		x = a;
		y = b;
	}
	public String emPalavras()
	{
		return "[" + x + ", " + y + "]";
	}
}
