package Diarista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Panel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JSpinner;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.JMenuBar;
import javax.swing.JFileChooser;

public class CadastroDiarista extends JFrame {

	private JPanel contentPane;
	private JTextField BD_nome_diarista;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField BD_email_diarista;
	private JTextField BD_rua_diarista;
	private JTextField BD_bairro_diarista;
	private JTextField BD_cidade_diarista;
	private JTextField BD_usuario_diarista;
	private JPasswordField BD_senha_diarista;
	private JPasswordField BD_senhaconfirmada_diarista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDiarista frame = new CadastroDiarista();
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
	public CadastroDiarista() {
		setTitle("Cadastro Diarista");
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 672, 36);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bem Vindo ao Cadastro de Diaristas!!!");
		lblNewLabel.setLabelFor(panel);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(0, 0, 666, 36);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 54, 672, 146);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDadosPrincipais = new JLabel("Dados Principais");
		lblDadosPrincipais.setBounds(0, 0, 101, 16);
		panel_1.add(lblDadosPrincipais);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(6, 28, 40, 16);
		panel_1.add(lblNome);
		
		BD_nome_diarista = new JTextField();
		BD_nome_diarista.setBounds(50, 22, 213, 28);
		panel_1.add(BD_nome_diarista);
		BD_nome_diarista.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Sexo: ");
		lblNewLabel_1.setBounds(419, 28, 33, 16);
		panel_1.add(lblNewLabel_1);
		
		JRadioButton BD_masculino_diarista = new JRadioButton("Masculino");
		buttonGroup.add(BD_masculino_diarista);
		BD_masculino_diarista.setBounds(464, 27, 83, 18);
		panel_1.add(BD_masculino_diarista);
		
		JRadioButton BD_feminino_diarista = new JRadioButton("Feminino");
		buttonGroup.add(BD_feminino_diarista);
		BD_feminino_diarista.setBounds(559, 27, 83, 18);
		panel_1.add(BD_feminino_diarista);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(6, 73, 121, 16);
		panel_1.add(lblDataDeNascimento);
		
		JFormattedTextField BD_datanascimento_diarista = new JFormattedTextField();
		BD_datanascimento_diarista.setBounds(127, 67, 136, 28);
		panel_1.add(BD_datanascimento_diarista);
		
		JLabel lblCfp = new JLabel("CPF:");
		lblCfp.setBounds(6, 115, 33, 16);
		panel_1.add(lblCfp);
		
		JFormattedTextField BD_cpf_diarista = new JFormattedTextField();
		BD_cpf_diarista.setBounds(38, 109, 147, 28);
		panel_1.add(BD_cpf_diarista);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(421, 73, 73, 16);
		panel_1.add(lblEstadoCivil);
		
		JComboBox BD_estadocivil_diarista = new JComboBox();
		BD_estadocivil_diarista.setModel(new DefaultComboBoxModel(new String[] {"Solteiro", "Casado", "Separado", "Divorciado", "Vi\u00FAvo"}));
		BD_estadocivil_diarista.setBounds(495, 68, 147, 26);
		panel_1.add(BD_estadocivil_diarista);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(419, 115, 27, 16);
		panel_1.add(lblRg);
		
		JFormattedTextField BD_rg_diarista = new JFormattedTextField();
		BD_rg_diarista.setBounds(443, 109, 164, 28);
		panel_1.add(BD_rg_diarista);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 206, 672, 84);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblContatos = new JLabel("Contatos");
		lblContatos.setBounds(0, 0, 55, 16);
		panel_2.add(lblContatos);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(417, 58, 55, 16);
		panel_2.add(lblTelefone);
		
		JFormattedTextField BD_telefone_diarista = new JFormattedTextField();
		BD_telefone_diarista.setBounds(477, 52, 139, 28);
		panel_2.add(BD_telefone_diarista);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(417, 24, 48, 16);
		panel_2.add(lblCelular);
		
		JFormattedTextField BD_celular_diarista = new JFormattedTextField();
		BD_celular_diarista.setBounds(477, 18, 139, 28);
		panel_2.add(BD_celular_diarista);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(6, 46, 40, 16);
		panel_2.add(lblEmail);
		
		BD_email_diarista = new JTextField();
		BD_email_diarista.setBounds(47, 40, 200, 28);
		panel_2.add(BD_email_diarista);
		BD_email_diarista.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(6, 296, 672, 139);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(0, 0, 55, 16);
		panel_3.add(lblEndereo);
		
		JLabel lblNewLabel_2 = new JLabel("Rua:");
		lblNewLabel_2.setBounds(10, 28, 32, 16);
		panel_3.add(lblNewLabel_2);
		
		BD_rua_diarista = new JTextField();
		BD_rua_diarista.setBounds(41, 22, 197, 28);
		panel_3.add(BD_rua_diarista);
		BD_rua_diarista.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro: ");
		lblBairro.setBounds(10, 72, 44, 16);
		panel_3.add(lblBairro);
		
		BD_bairro_diarista = new JTextField();
		BD_bairro_diarista.setBounds(51, 66, 187, 28);
		panel_3.add(BD_bairro_diarista);
		BD_bairro_diarista.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade: ");
		lblCidade.setBounds(10, 113, 49, 16);
		panel_3.add(lblCidade);
		
		BD_cidade_diarista = new JTextField();
		BD_cidade_diarista.setBounds(61, 107, 177, 28);
		panel_3.add(BD_cidade_diarista);
		BD_cidade_diarista.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(418, 28, 32, 16);
		panel_3.add(lblCep);
		
		JFormattedTextField BD_cep_diarista = new JFormattedTextField();
		BD_cep_diarista.setBounds(462, 22, 152, 28);
		panel_3.add(BD_cep_diarista);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(418, 72, 44, 16);
		panel_3.add(lblEstado);
		
		JComboBox BD_estado_diarista = new JComboBox();
		BD_estado_diarista.setModel(new DefaultComboBoxModel(new String[] {"AC\t ", "AL\t ", "AP\t ", "AM\t ", "BA\t ", "CE\t ", "DF\t ", "ES\t ", "GO\t ", "MA\t ", "MT\t ", "MS\t ", "MG\t ", "PA\t ", "PB\t ", "PR\t ", "PE\t ", "PI\t ", "RJ\t ", "RN\t ", "RS\t ", "RO\t ", "RR\t ", "SC\t ", "SP\t ", "SE\t ", "TO"}));
		BD_estado_diarista.setBounds(472, 67, 142, 26);
		panel_3.add(BD_estado_diarista);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(6, 441, 288, 152);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Conta");
		lblNewLabel_3.setBounds(0, 0, 38, 16);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNomeDeUsurio = new JLabel("Nome de usu\u00E1rio:");
		lblNomeDeUsurio.setBounds(10, 34, 106, 16);
		panel_4.add(lblNomeDeUsurio);
		
		BD_usuario_diarista = new JTextField();
		BD_usuario_diarista.setBounds(115, 28, 171, 28);
		panel_4.add(BD_usuario_diarista);
		BD_usuario_diarista.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 79, 47, 16);
		panel_4.add(lblSenha);
		
		BD_senha_diarista = new JPasswordField();
		BD_senha_diarista.setBounds(53, 73, 166, 28);
		panel_4.add(BD_senha_diarista);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha:");
		lblConfirmarSenha.setBounds(10, 122, 106, 16);
		panel_4.add(lblConfirmarSenha);
		
		BD_senhaconfirmada_diarista = new JPasswordField();
		BD_senhaconfirmada_diarista.setBounds(115, 115, 166, 28);
		panel_4.add(BD_senhaconfirmada_diarista);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(306, 441, 372, 152);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblAntecedentesCriminais = new JLabel("Antecedentes Criminais:");
		lblAntecedentesCriminais.setBounds(12, 13, 139, 16);
		panel_5.add(lblAntecedentesCriminais);
		
		JLabel lblCurrculo = new JLabel("Curr\u00EDculo: ");
		lblCurrculo.setBounds(12, 78, 68, 16);
		panel_5.add(lblCurrculo);
		
		JLabel lblFotoDePerfil = new JLabel("Foto de Perfil:");
		lblFotoDePerfil.setBounds(241, 13, 81, 16);
		panel_5.add(lblFotoDePerfil);
		
		JButton btnSelecionarArquivo = new JButton("Selecionar Arquivo");
		btnSelecionarArquivo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				JFileChooser abrir = new JFileChooser();
				
			}
		});
		btnSelecionarArquivo.setBounds(12, 37, 139, 28);
		panel_5.add(btnSelecionarArquivo);
		
		JButton btnSelecionarArquivo_1 = new JButton("Selecionar Arquivo");
		btnSelecionarArquivo_1.setBounds(12, 106, 139, 28);
		panel_5.add(btnSelecionarArquivo_1);
		
		JButton btnSelecionarFoto = new JButton("Selecionar Foto");
		btnSelecionarFoto.setBounds(241, 37, 114, 28);
		panel_5.add(btnSelecionarFoto);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(6, 599, 672, 57);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(372, 23, 96, 28);
		panel_6.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(582, 23, 90, 28);
		panel_6.add(btnCancelar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(480, 23, 90, 28);
		panel_6.add(btnLimpar);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 684, 656);
		contentPane.add(label);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
