package Diarista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Contatos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contatos frame = new Contatos();
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
	public Contatos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 484, 62);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblContatos = new JLabel("Contatos");
		lblContatos.setBounds(215, 22, 55, 16);
		panel.add(lblContatos);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(6, 16, 90, 28);
		panel.add(btnVoltar);
		
		JLabel lblContatosAdicionados = new JLabel("Contatos Adicionados");
		lblContatosAdicionados.setBounds(173, 242, 127, 16);
		contentPane.add(lblContatosAdicionados);
	}

}
