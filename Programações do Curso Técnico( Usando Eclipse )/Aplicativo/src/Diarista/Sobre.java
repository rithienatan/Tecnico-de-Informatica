package Diarista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Sobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre frame = new Sobre();
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
	public Sobre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 524, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSobre = new JLabel("Sobre");
		lblSobre.setBounds(241, 17, 55, 16);
		panel.add(lblSobre);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(6, 11, 90, 28);
		panel.add(btnVoltar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 62, 524, 410);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLicensas = new JLabel("Licensas");
		lblLicensas.setBounds(6, 6, 55, 16);
		panel_1.add(lblLicensas);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(6, 34, 512, 153);
		panel_1.add(textArea);
		
		JLabel lblDireitosAltorais = new JLabel("Direitos Autorais");
		lblDireitosAltorais.setBounds(6, 199, 96, 16);
		panel_1.add(lblDireitosAltorais);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(6, 227, 512, 177);
		panel_1.add(textArea_1);
	}
}
