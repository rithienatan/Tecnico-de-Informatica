package Exerc�cio01;

import javax.swing.JOptionPane;

public class E02C01 
{
	public static void main(String[] args) 
	{
		String a = JOptionPane.showInputDialog("Digite um n�mero: ");
		JOptionPane.showMessageDialog(null, a);
		
		String b = JOptionPane.showInputDialog("Digite outro n�mero: ");
		JOptionPane.showMessageDialog(null, b);
	}
}