package Exercício01;

import javax.swing.JOptionPane;

public class E02C01 
{
	public static void main(String[] args) 
	{
		String a = JOptionPane.showInputDialog("Digite um número: ");
		JOptionPane.showMessageDialog(null, a);
		
		String b = JOptionPane.showInputDialog("Digite outro número: ");
		JOptionPane.showMessageDialog(null, b);
	}
}