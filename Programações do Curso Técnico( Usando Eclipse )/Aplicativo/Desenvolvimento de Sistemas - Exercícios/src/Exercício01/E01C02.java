package Exercício01;

public class E01C02 
{
	public void Resultado (E01I01 E01I01)
	{
		System.out.println("Resultado da soma: "+E01I01.getA());
	}
	
	public void Results (E01I02 E01I02)
	{
		System.out.println("Resultado da soma: "+E01I02.getB());
	}
	
	public static void main(String[] args)
	{
		E01C01 rr = new E01C01();
		rr.somar(0);
		rr.subtrair(0);
		
		E01C02 ss = new E01C02();
		ss.Resultado(rr);
		ss.Results(rr);
	}
}