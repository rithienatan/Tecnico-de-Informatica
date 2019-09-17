package Prova;

public class Circulo extends Ponto
{
	protected double r;
	
	public Circulo()
	{
		setRaio(0);
	}
	public Circulo( double a, double b, double r)
	{
		super (a,b);
		setRaio(r);
	}
	public void setRaio ( double r)
	{
		this.r = r;
	}
}
