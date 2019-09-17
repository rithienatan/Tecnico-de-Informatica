package Diarista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Diarista extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JTextField BD_login_diarista;
	private JLabel lblSenha;
	private JPasswordField BD_senha_diarista;
	private JButton btnEntrar;
	private JLabel lblNovoPorAqui;
	private JButton btnCadastrese;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diarista frame = new Diarista();
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
	public Diarista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(6, 6, 272, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Bem Vindo Diarista!!!!");
		lblNewLabel.setBounds(75, 19, 118, 16);
		panel.add(lblNewLabel);
		
		panel_1 = new JPanel();
		panel_1.setBounds(6, 72, 272, 334);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setBounds(120, 27, 31, 16);
		panel_1.add(lblNewLabel_1);
		
		BD_login_diarista = new JTextField();
		BD_login_diarista.setBounds(42, 55, 203, 28);
		panel_1.add(BD_login_diarista);
		BD_login_diarista.setColumns(10);
		
		lblSenha = new JLabel("Senha");
		lblSenha.setBounds(120, 96, 36, 16);
		panel_1.add(lblSenha);
		
		BD_senha_diarista = new JPasswordField();
		BD_senha_diarista.setBounds(42, 124, 203, 28);
		panel_1.add(BD_senha_diarista);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(95, 181, 90, 28);
		panel_1.add(btnEntrar);
		
		lblNovoPorAqui = new JLabel("Novo por aqui!!! Cadastre-se!!!");
		lblNovoPorAqui.setBounds(100, 271, 166, 16);
		panel_1.add(lblNovoPorAqui);
		
		btnCadastrese = new JButton("Cadastre-se!!!");
		btnCadastrese.setBounds(160, 299, 106, 28);
		panel_1.add(btnCadastrese);
		
		label = new JLabel("");
		label.setBounds(0, 0, 284, 406);
		contentPane.add(label);
	}
}
