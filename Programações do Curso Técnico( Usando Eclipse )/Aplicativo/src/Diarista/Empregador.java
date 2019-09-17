package Diarista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Empregador extends JFrame {

	private JPanel contentPane;
	private JTextField BD_login_empregador;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empregador frame = new Empregador();
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
	public Empregador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 272, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblBemVindoEmpregadores = new JLabel("Bem Vindo Empregadores!!!");
		lblBemVindoEmpregadores.setBounds(62, 21, 155, 16);
		panel.add(lblBemVindoEmpregadores);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 76, 272, 330);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(121, 35, 31, 16);
		panel_1.add(lblLogin);
		
		BD_login_empregador = new JTextField();
		BD_login_empregador.setBounds(42, 63, 200, 28);
		panel_1.add(BD_login_empregador);
		BD_login_empregador.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(121, 103, 36, 16);
		panel_1.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(42, 131, 200, 28);
		panel_1.add(passwordField);
		
		JLabel lblNovoPorAqui = new JLabel("Novo por aqui?!!! Cadastre-se!!");
		lblNovoPorAqui.setBounds(96, 267, 170, 16);
		panel_1.add(lblNovoPorAqui);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(96, 185, 90, 28);
		panel_1.add(btnEntrar);
		
		JButton btnCdastrese = new JButton("Cadastre-se!!");
		btnCdastrese.setBounds(163, 296, 103, 28);
		panel_1.add(btnCdastrese);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 284, 412);
		contentPane.add(label);
	}

}
