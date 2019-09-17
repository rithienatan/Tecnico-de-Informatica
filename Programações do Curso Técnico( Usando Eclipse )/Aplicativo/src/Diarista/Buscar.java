package Diarista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Buscar extends JFrame {

	private JPanel contentPane;
	private JTextField pesquisa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buscar frame = new Buscar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Buscar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 524, 39);
		contentPane.add(panel);
		panel.setLayout(null);
		
		pesquisa = new JTextField();
		pesquisa.setBounds(120, 6, 321, 28);
		panel.add(pesquisa);
		pesquisa.setColumns(10);
		
		JButton pesqusa01 = new JButton("");
		pesqusa01.setBounds(453, 6, 53, 28);
		panel.add(pesqusa01);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(21, 6, 71, 28);
		panel.add(btnVoltar);
		
		JLabel lblResultadoDaPesquisa = new JLabel("Resultado da Pesquisa");
		lblResultadoDaPesquisa.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultadoDaPesquisa.setBounds(0, 298, 524, 16);
		contentPane.add(lblResultadoDaPesquisa);
	}
}
