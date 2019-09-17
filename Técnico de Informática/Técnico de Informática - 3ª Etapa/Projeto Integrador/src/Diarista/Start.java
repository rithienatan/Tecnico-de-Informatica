package Diarista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.DropMode;
import java.awt.Window.Type;

public class Start extends JFrame {

	private JPanel contentPane;
	private JTextField login;
	private JTextField senha;
	private JLabel lblSenha;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		setTitle("Bem Vindo!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 450);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.CYAN);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		login = new JTextField();
		login.setBounds(167, 76, 167, 29);
		contentPane.add(login);
		login.setColumns(10);
		
		senha = new JTextField();
		senha.setBounds(167, 144, 167, 29);
		contentPane.add(senha);
		senha.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(230, 34, 43, 29);
		contentPane.add(lblNewLabel);
		
		lblSenha = new JLabel("Senha");
		lblSenha.setBounds(230, 117, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel lblNovoPorAqui = new JLabel("Novo por aqui?!");
		lblNovoPorAqui.setForeground(Color.BLACK);
		lblNovoPorAqui.setBackground(new Color(255, 255, 255));
		lblNovoPorAqui.setBounds(23, 321, 95, 14);
		contentPane.add(lblNovoPorAqui);
		
		lblNewLabel_1 = new JLabel("Esqueceu sua senha?");
		lblNewLabel_1.setBounds(190, 177, 131, 20);
		contentPane.add(lblNewLabel_1);
		
		JButton facebook = new JButton("Login com Facebook");
		facebook.setBounds(325, 314, 167, 29);
		contentPane.add(facebook);
		
		JButton chrome = new JButton("Login com Google");
		chrome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		chrome.setBounds(325, 355, 167, 29);
		contentPane.add(chrome);
		
		JButton btnCadastrese = new JButton("Cadastre-se!");
		lblNovoPorAqui.setLabelFor(btnCadastrese);
		btnCadastrese.setBounds(12, 348, 113, 29);
		contentPane.add(btnCadastrese);
		
		JButton entrar = new JButton("Entrar");
		entrar.setBackground(new Color(204, 204, 204));
		entrar.setBounds(210, 216, 90, 28);
		contentPane.add(entrar);
	}
}
