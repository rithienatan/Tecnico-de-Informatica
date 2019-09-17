package Diarista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Configuracoes extends JFrame {

	private JPanel contentPane;
	private JTextField antigologin;
	private JTextField textField;
	private JPasswordField senhaatual;
	private JPasswordField senhanova;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configuracoes frame = new Configuracoes();
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
	public Configuracoes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 524, 63);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblConfiguraes = new JLabel("Configura\u00E7\u00F5es");
		lblConfiguraes.setBounds(227, 22, 87, 16);
		panel.add(lblConfiguraes);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(6, 16, 90, 28);
		panel.add(btnVoltar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 75, 524, 391);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblVersoDoAplicativo = new JLabel("Vers\u00E3o do Aplicativo: Version 1.0");
		lblVersoDoAplicativo.setBounds(24, 16, 187, 16);
		panel_1.add(lblVersoDoAplicativo);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(0, 44, 524, 16);
		panel_1.add(horizontalStrut);
		
		JLabel lblConta = new JLabel("Conta");
		lblConta.setBounds(24, 72, 55, 16);
		panel_1.add(lblConta);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(24, 100, 500, 265);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblAlterarLogin = new JLabel("Alterar login");
		lblAlterarLogin.setBounds(6, 6, 76, 16);
		panel_2.add(lblAlterarLogin);
		
		antigologin = new JTextField();
		antigologin.setEnabled(false);
		antigologin.setEditable(false);
		antigologin.setBounds(169, 35, 146, 28);
		panel_2.add(antigologin);
		antigologin.setColumns(10);
		
		JLabel lblLoginAntigo = new JLabel("Login atual");
		lblLoginAntigo.setBounds(81, 41, 76, 16);
		panel_2.add(lblLoginAntigo);
		
		textField = new JTextField();
		textField.setBounds(169, 75, 146, 28);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNovoLogin = new JLabel("Novo Login");
		lblNovoLogin.setBounds(81, 81, 76, 16);
		panel_2.add(lblNovoLogin);
		
		JButton alterarlogin = new JButton("Alterar");
		alterarlogin.setBounds(376, 75, 90, 28);
		panel_2.add(alterarlogin);
		
		JLabel lblAlterarSenha = new JLabel("Alterar Senha");
		lblAlterarSenha.setBounds(6, 147, 76, 16);
		panel_2.add(lblAlterarSenha);
		
		JLabel lblSenhaAntiga = new JLabel("Senha atual");
		lblSenhaAntiga.setBounds(81, 175, 76, 16);
		panel_2.add(lblSenhaAntiga);
		
		senhaatual = new JPasswordField();
		senhaatual.setEnabled(false);
		senhaatual.setEditable(false);
		senhaatual.setBounds(169, 169, 146, 28);
		panel_2.add(senhaatual);
		
		JLabel lblNovaSenha = new JLabel("Nova Senha");
		lblNovaSenha.setBounds(81, 220, 76, 16);
		panel_2.add(lblNovaSenha);
		
		senhanova = new JPasswordField();
		senhanova.setBounds(169, 214, 146, 28);
		panel_2.add(senhanova);
		
		JButton alterarsenha = new JButton("Alterar");
		alterarsenha.setBounds(376, 214, 90, 28);
		panel_2.add(alterarsenha);
	}
}
