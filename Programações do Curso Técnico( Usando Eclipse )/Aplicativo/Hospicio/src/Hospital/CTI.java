package Hospital;

import java.util.*;

public class CTI 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		float tc, tc2, tc_total;
		int i;
		String c;
		
		System.out.println("1 - Para medir da temperatura!");
		System.out.println("2 - Para medir a press�o arterial!");
		System.out.println("3 - Para medir a satura��o de O�!");
		System.out.println("4 - Para medir a satura��o de Glicemia!");
		
		i = input.nextInt();
		
		switch(i)
		{
		case 1: 
			System.out.println ("Digite sua temperatura agora: ");
			tc = input.nextFloat(); 
		
			System.out.println ("Digite sua temperatura depois de 1 min: ");
			tc2 = input.nextFloat();
		
			if (tc < tc2)
			{
				
				tc_total = ((tc2*100)/tc) - 100;
				if (tc_total > 20)
				{
					System.out.println("WARNING! Sua temperatura aumentou mais de 20%, resultado: Aumentou " + tc_total + "%");
				}
			}
			else if (tc > tc2)
			{
				tc_total = ((tc2*100)/tc);
				tc_total = 100 - tc_total;
				System.out.println("O quanto de porcentagem que sua temperatura diminuiu: " + tc_total + "%");
			}
			else if (tc == tc2)
			{
				System.out.println("Sua temperatura n�o alterou!");
			}
		break;
		
		case 2:
			System.out.println ("Digite sua press�o arterial: ");
			tc = input.nextFloat(); 
		
			System.out.println ("Digite sua press�o arterial depois de 1 min: ");
			tc2 = input.nextFloat();
		
			if (tc < tc2)
			{
				tc_total = ((tc2*100)/tc) - 100;
				if (tc_total > 20)
				{
					System.out.println("WARNING! Sua press�o aumentou mais de 20%, resultado: Aumentou " + tc_total + "%");
				}
			}
			else if (tc > tc2)
			{
				tc_total = ((tc2*100)/tc);
				System.out.println("O quanto de porcentagem que sua press�o arterial diminuiu: " + tc_total + "%");
			}
			else if (tc == tc2)
			{
				System.out.println("Sua press�o arterial n�o alterou!");
			}
		break;
		
		case 3:
			System.out.println ("Digite sua satura��o de O�: ");
			tc = input.nextFloat(); 
		
			System.out.println ("Digite sua satura��o de O� depois de 1 min: ");
			tc2 = input.nextFloat();
		
			if (tc < tc2)
			{
				tc_total = ((tc2*100)/tc) - 100;
				if (tc_total > 20)
				{
					System.out.println("WARNING! Sua satura��o de O� aumentou mais de 20%, resultado: Aumentou " + tc_total + "%");
				}
			}
			else if (tc > tc2)
			{
				tc_total = ((tc2*100)/tc);
				System.out.println("O quanto de porcentagem que sua satura��o de O� diminuiu: " + tc_total + "%");
			}
			else if (tc == tc2)
			{
				System.out.println("Sua satura��o de O� n�o alterou!");
			}
		break;
		
		case 4:
			System.out.println ("Digite sua satura��o de Glicemia: ");
			tc = input.nextFloat(); 
		
			System.out.println ("Digite sua satura��o de Glicemia depois de 1 min: ");
			tc2 = input.nextFloat();
		
			if (tc < tc2)
			{
				tc_total = ((tc2*100)/tc) - 100;
				if (tc_total > 20)
				{
					System.out.println("WARNING! Sua satura��o de glicemia aumentou mais de 20%, resultado: Aumentou " + tc_total + "%");
				}
			}
			else if (tc > tc2)
			{
				tc_total = ((tc2*100)/tc);
				System.out.println("O quanto de porcentagem que sua satura��o de Glicemia diminuiu: " + tc_total + "%");
			}
			else if (tc == tc2)
			{
				System.out.println("Sua satura��o de Glicemia n�o alterou!");
			}
		break;

		default:
			System.out.println("Op��o Inv�lida! Digite novamente!");
		}
	}	
}