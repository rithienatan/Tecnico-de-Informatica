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
		System.out.println("2 - Para medir a pressão arterial!");
		System.out.println("3 - Para medir a saturação de O²!");
		System.out.println("4 - Para medir a saturação de Glicemia!");
		
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
				System.out.println("Sua temperatura não alterou!");
			}
		break;
		
		case 2:
			System.out.println ("Digite sua pressão arterial: ");
			tc = input.nextFloat(); 
		
			System.out.println ("Digite sua pressão arterial depois de 1 min: ");
			tc2 = input.nextFloat();
		
			if (tc < tc2)
			{
				tc_total = ((tc2*100)/tc) - 100;
				if (tc_total > 20)
				{
					System.out.println("WARNING! Sua pressão aumentou mais de 20%, resultado: Aumentou " + tc_total + "%");
				}
			}
			else if (tc > tc2)
			{
				tc_total = ((tc2*100)/tc);
				System.out.println("O quanto de porcentagem que sua pressão arterial diminuiu: " + tc_total + "%");
			}
			else if (tc == tc2)
			{
				System.out.println("Sua pressão arterial não alterou!");
			}
		break;
		
		case 3:
			System.out.println ("Digite sua saturação de O²: ");
			tc = input.nextFloat(); 
		
			System.out.println ("Digite sua saturação de O² depois de 1 min: ");
			tc2 = input.nextFloat();
		
			if (tc < tc2)
			{
				tc_total = ((tc2*100)/tc) - 100;
				if (tc_total > 20)
				{
					System.out.println("WARNING! Sua saturação de O² aumentou mais de 20%, resultado: Aumentou " + tc_total + "%");
				}
			}
			else if (tc > tc2)
			{
				tc_total = ((tc2*100)/tc);
				System.out.println("O quanto de porcentagem que sua saturação de O² diminuiu: " + tc_total + "%");
			}
			else if (tc == tc2)
			{
				System.out.println("Sua saturação de O² não alterou!");
			}
		break;
		
		case 4:
			System.out.println ("Digite sua saturação de Glicemia: ");
			tc = input.nextFloat(); 
		
			System.out.println ("Digite sua saturação de Glicemia depois de 1 min: ");
			tc2 = input.nextFloat();
		
			if (tc < tc2)
			{
				tc_total = ((tc2*100)/tc) - 100;
				if (tc_total > 20)
				{
					System.out.println("WARNING! Sua saturação de glicemia aumentou mais de 20%, resultado: Aumentou " + tc_total + "%");
				}
			}
			else if (tc > tc2)
			{
				tc_total = ((tc2*100)/tc);
				System.out.println("O quanto de porcentagem que sua saturação de Glicemia diminuiu: " + tc_total + "%");
			}
			else if (tc == tc2)
			{
				System.out.println("Sua saturação de Glicemia não alterou!");
			}
		break;

		default:
			System.out.println("Opção Inválida! Digite novamente!");
		}
	}	
}