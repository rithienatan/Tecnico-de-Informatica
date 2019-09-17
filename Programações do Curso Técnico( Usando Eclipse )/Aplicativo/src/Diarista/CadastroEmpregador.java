package Diarista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

public class CadastroEmpregador extends JFrame {

	private JPanel contentPane;
	private JTextField BD_nome_empregador;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField BD_email_empregador;
	private JTextField BD_rua_empregador;
	private JTextField BD_bairro_empregador;
	private JTextField BD_cidade_empregador;
	private JTextField BD_login_empregador;
	private JPasswordField BD_senha_empregador;
	private JPasswordField BD_confirmarsenha_empregador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroEmpregador frame = new CadastroEmpregador();
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
	public CadastroEmpregador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 660, 34);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblBemVindoAo = new JLabel("Bem Vindo ao Cadastro de Empregadores");
		lblBemVindoAo.setBounds(208, 6, 241, 16);
		panel.add(lblBemVindoAo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("");
		panel_1.setBounds(12, 53, 660, 140);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dados Principais");
		lblNewLabel.setBounds(0, 0, 95, 16);
		panel_1.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 31, 45, 16);
		panel_1.add(lblNome);
		
		BD_nome_empregador = new JTextField();
		BD_nome_empregador.setBounds(51, 25, 200, 28);
		panel_1.add(BD_nome_empregador);
		BD_nome_empregador.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Data de Nascimento: ");
		lblNewLabel_1.setBounds(6, 74, 124, 16);
		panel_1.add(lblNewLabel_1);
		
		JFormattedTextField BD_datanascimento_empregador = new JFormattedTextField();
		BD_datanascimento_empregador.setBounds(127, 68, 124, 28);
		panel_1.add(BD_datanascimento_empregador);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 118, 35, 16);
		panel_1.add(lblCpf);
		
		JFormattedTextField BD_cpf_empregador = new JFormattedTextField();
		BD_cpf_empregador.setBounds(43, 112, 124, 28);
		panel_1.add(BD_cpf_empregador);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(390, 31, 35, 16);
		panel_1.add(lblSexo);
		
		JRadioButton BD_masculino_empregador = new JRadioButton("Masculino");
		buttonGroup.add(BD_masculino_empregador);
		BD_masculino_empregador.setBounds(428, 30, 86, 18);
		panel_1.add(BD_masculino_empregador);
		
		JRadioButton BD_feminino_empregador = new JRadioButton("Feminino");
		buttonGroup.add(BD_feminino_empregador);
		BD_feminino_empregador.setBounds(526, 30, 86, 18);
		panel_1.add(BD_feminino_empregador);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(390, 74, 75, 16);
		panel_1.add(lblEstadoCivil);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Solteiro", "Casado", "Separado", "Divorciado", "Vi\u00FAvo"}));
		comboBox.setBounds(465, 69, 147, 26);
		panel_1.add(comboBox);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(390, 118, 27, 16);
		panel_1.add(lblRg);
		
		JFormattedTextField BD_rg_empregador = new JFormattedTextField();
		BD_rg_empregador.setBounds(416, 112, 137, 28);
		panel_1.add(BD_rg_empregador);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 199, 662, 85);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblContatos = new JLabel("Contatos");
		lblContatos.setBounds(0, 0, 55, 16);
		panel_2.add(lblContatos);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 28, 44, 16);
		panel_2.add(lblEmail);
		
		BD_email_empregador = new JTextField();
		BD_email_empregador.setBounds(50, 23, 201, 28);
		panel_2.add(BD_email_empregador);
		BD_email_empregador.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(392, 28, 49, 16);
		panel_2.add(lblCelular);
		
		JFormattedTextField BD_celular_empregador = new JFormattedTextField();
		BD_celular_empregador.setBounds(440, 22, 135, 28);
		panel_2.add(BD_celular_empregador);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(392, 60, 55, 16);
		panel_2.add(lblTelefone);
		
		JFormattedTextField BD_telefone_empregador = new JFormattedTextField();
		BD_telefone_empregador.setBounds(450, 54, 125, 28);
		panel_2.add(BD_telefone_empregador);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 290, 660, 131);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(0, 0, 55, 16);
		panel_3.add(lblEndereo);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setBounds(10, 28, 34, 16);
		panel_3.add(lblRua);
		
		BD_rua_empregador = new JTextField();
		BD_rua_empregador.setBounds(40, 22, 201, 28);
		panel_3.add(BD_rua_empregador);
		BD_rua_empregador.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 70, 47, 16);
		panel_3.add(lblBairro);
		
		BD_bairro_empregador = new JTextField();
		BD_bairro_empregador.setBounds(50, 64, 191, 28);
		panel_3.add(BD_bairro_empregador);
		BD_bairro_empregador.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 104, 47, 16);
		panel_3.add(lblCidade);
		
		BD_cidade_empregador = new JTextField();
		BD_cidade_empregador.setBounds(60, 98, 181, 28);
		panel_3.add(BD_cidade_empregador);
		BD_cidade_empregador.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(390, 28, 34, 16);
		panel_3.add(lblCep);
		
		JFormattedTextField BD_cep_empregador = new JFormattedTextField();
		BD_cep_empregador.setBounds(421, 22, 149, 28);
		panel_3.add(BD_cep_empregador);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(390, 70, 47, 16);
		panel_3.add(lblEstado);
		
		JComboBox BD_estado_empregador = new JComboBox();
		BD_estado_empregador.setModel(new DefaultComboBoxModel(new String[] {"AC\t ", "AL\t ", "AP\t ", "AM\t ", "BA\t ", "CE\t ", "DF\t ", "ES\t ", "GO\t ", "MA\t ", "MT\t ", "MS\t ", "MG\t ", "PA\t ", "PB\t ", "PR\t ", "PE\t ", "PI\t ", "RJ\t ", "RN\t ", "RS\t ", "RO\t ", "RR\t ", "SC\t ", "SP\t ", "SE\t ", "TO"}));
		BD_estado_empregador.setBounds(442, 65, 128, 26);
		panel_3.add(BD_estado_empregador);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 433, 324, 151);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblConta = new JLabel("Conta");
		lblConta.setBounds(0, 0, 55, 16);
		panel_4.add(lblConta);
		
		JLabel lblNomeDeUsurio = new JLabel("Nome de Usu\u00E1rio:");
		lblNomeDeUsurio.setBounds(10, 28, 107, 16);
		panel_4.add(lblNomeDeUsurio);
		
		BD_login_empregador = new JTextField();
		BD_login_empregador.setBounds(115, 22, 199, 28);
		panel_4.add(BD_login_empregador);
		BD_login_empregador.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 78, 45, 16);
		panel_4.add(lblSenha);
		
		BD_senha_empregador = new JPasswordField();
		BD_senha_empregador.setBounds(52, 72, 199, 28);
		panel_4.add(BD_senha_empregador);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar senha:");
		lblConfirmarSenha.setBounds(10, 122, 107, 16);
		panel_4.add(lblConfirmarSenha);
		
		BD_confirmarsenha_empregador = new JPasswordField();
		BD_confirmarsenha_empregador.setBounds(115, 116, 199, 28);
		panel_4.add(BD_confirmarsenha_empregador);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(12, 590, 666, 66);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(570, 32, 90, 28);
		panel_5.add(btnCancelar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(468, 32, 90, 28);
		panel_5.add(btnLimpar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(356, 32, 100, 28);
		panel_5.add(btnConfirmar);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(342, 433, 330, 151);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblFotoDePerfil = new JLabel("Foto de Perfil");
		lblFotoDePerfil.setBounds(212, 6, 79, 16);
		panel_6.add(lblFotoDePerfil);
		
		JButton btnSelecionarFoto = new JButton("Selecionar Foto");
		btnSelecionarFoto.setBounds(186, 34, 127, 28);
		panel_6.add(btnSelecionarFoto);
	}

}
