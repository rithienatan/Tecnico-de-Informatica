package Diarista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import javax.swing.JRadioButton;

public class PerfilDiarista extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerfilDiarista frame = new PerfilDiarista();
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
	public PerfilDiarista() {
		setBackground(Color.LIGHT_GRAY);
		setForeground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 520);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 434, 37);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPerfil = new JLabel("Perfil");
		lblPerfil.setBackground(Color.LIGHT_GRAY);
		lblPerfil.setForeground(Color.DARK_GRAY);
		lblPerfil.setBounds(206, 6, 38, 16);
		panel.add(lblPerfil);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(Color.LIGHT_GRAY);
		btnVoltar.setForeground(Color.DARK_GRAY);
		btnVoltar.setBounds(6, 0, 90, 28);
		panel.add(btnVoltar);
		
		JLabel lblNewLabel = new JLabel("Foto");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBounds(10, 49, 80, 77);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBackground(Color.LIGHT_GRAY);
		lblNome.setForeground(Color.DARK_GRAY);
		lblNome.setBounds(102, 60, 55, 16);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setForeground(Color.DARK_GRAY);
		textField.setBounds(150, 54, 169, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Data de Nascimento: ");
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(102, 107, 125, 16);
		contentPane.add(lblNewLabel_1);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBackground(Color.LIGHT_GRAY);
		formattedTextField.setForeground(Color.DARK_GRAY);
		formattedTextField.setBounds(224, 101, 116, 28);
		contentPane.add(formattedTextField);
		
		JLabel lblTelefone = new JLabel("Telefone: ");
		lblTelefone.setBackground(Color.LIGHT_GRAY);
		lblTelefone.setForeground(Color.DARK_GRAY);
		lblTelefone.setBounds(10, 161, 55, 16);
		contentPane.add(lblTelefone);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBackground(Color.LIGHT_GRAY);
		formattedTextField_1.setForeground(Color.DARK_GRAY);
		formattedTextField_1.setBounds(71, 155, 116, 28);
		contentPane.add(formattedTextField_1);
		
		JLabel lblCelular = new JLabel("Celular: ");
		lblCelular.setBackground(Color.LIGHT_GRAY);
		lblCelular.setForeground(Color.DARK_GRAY);
		lblCelular.setBounds(248, 161, 55, 16);
		contentPane.add(lblCelular);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setBackground(Color.LIGHT_GRAY);
		formattedTextField_2.setForeground(Color.DARK_GRAY);
		formattedTextField_2.setBounds(301, 155, 116, 28);
		contentPane.add(formattedTextField_2);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBackground(Color.LIGHT_GRAY);
		lblEmail.setForeground(Color.DARK_GRAY);
		lblEmail.setBounds(10, 209, 55, 16);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setForeground(Color.DARK_GRAY);
		textField_1.setBounds(56, 203, 239, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblValorDaDiaria = new JLabel("Valor da Di\u00E1ria:");
		lblValorDaDiaria.setBackground(Color.LIGHT_GRAY);
		lblValorDaDiaria.setForeground(Color.DARK_GRAY);
		lblValorDaDiaria.setBounds(10, 254, 92, 16);
		contentPane.add(lblValorDaDiaria);
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		formattedTextField_3.setBackground(Color.LIGHT_GRAY);
		formattedTextField_3.setForeground(Color.DARK_GRAY);
		formattedTextField_3.setBounds(102, 248, 116, 28);
		contentPane.add(formattedTextField_3);
		
		JLabel lblCurrculo = new JLabel("Curr\u00EDculo: ");
		lblCurrculo.setBackground(Color.LIGHT_GRAY);
		lblCurrculo.setForeground(Color.DARK_GRAY);
		lblCurrculo.setBounds(6, 442, 67, 16);
		contentPane.add(lblCurrculo);
		
		JButton btnSelecionarArquivo = new JButton("Selecionar arquivo");
		btnSelecionarArquivo.setBackground(Color.LIGHT_GRAY);
		btnSelecionarArquivo.setForeground(Color.DARK_GRAY);
		btnSelecionarArquivo.setBounds(71, 436, 149, 28);
		contentPane.add(btnSelecionarArquivo);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBackground(Color.LIGHT_GRAY);
		btnEditar.setForeground(Color.DARK_GRAY);
		btnEditar.setBounds(232, 436, 90, 28);
		contentPane.add(btnEditar);
		
		JLabel lblRua = new JLabel("Rua: ");
		lblRua.setBackground(Color.LIGHT_GRAY);
		lblRua.setForeground(Color.DARK_GRAY);
		lblRua.setBounds(10, 294, 55, 16);
		contentPane.add(lblRua);
		
		JLabel lblBairro = new JLabel("Bairro: ");
		lblBairro.setBackground(Color.LIGHT_GRAY);
		lblBairro.setForeground(Color.DARK_GRAY);
		lblBairro.setBounds(10, 332, 55, 16);
		contentPane.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade: ");
		lblCidade.setBackground(Color.LIGHT_GRAY);
		lblCidade.setForeground(Color.DARK_GRAY);
		lblCidade.setBounds(10, 373, 55, 16);
		contentPane.add(lblCidade);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setForeground(Color.DARK_GRAY);
		textField_2.setBounds(43, 288, 122, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setForeground(Color.DARK_GRAY);
		textField_3.setBounds(56, 326, 122, 28);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setForeground(Color.DARK_GRAY);
		textField_4.setBounds(65, 367, 122, 28);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado: ");
		lblEstado.setBackground(Color.LIGHT_GRAY);
		lblEstado.setForeground(Color.DARK_GRAY);
		lblEstado.setBounds(248, 294, 55, 16);
		contentPane.add(lblEstado);
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setForeground(Color.DARK_GRAY);
		textField_5.setBounds(295, 288, 122, 28);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP: ");
		lblCep.setBackground(Color.LIGHT_GRAY);
		lblCep.setForeground(Color.DARK_GRAY);
		lblCep.setBounds(248, 332, 55, 16);
		contentPane.add(lblCep);
		
		textField_6 = new JTextField();
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setForeground(Color.DARK_GRAY);
		textField_6.setBounds(295, 326, 122, 28);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(Color.LIGHT_GRAY);
		btnSalvar.setForeground(Color.DARK_GRAY);
		btnSalvar.setBounds(334, 436, 90, 28);
		contentPane.add(btnSalvar);
		
		JLabel lblStatus = new JLabel("Status: ");
		lblStatus.setBounds(10, 407, 55, 16);
		contentPane.add(lblStatus);
		
		JRadioButton rdbtnDisponvel = new JRadioButton("Dispon\u00EDvel");
		rdbtnDisponvel.setBounds(56, 406, 115, 18);
		contentPane.add(rdbtnDisponvel);
		
		JRadioButton rdbtnEmTrabalho = new JRadioButton("Em trabalho");
		rdbtnEmTrabalho.setBounds(144, 406, 115, 18);
		contentPane.add(rdbtnEmTrabalho);
	}
}
