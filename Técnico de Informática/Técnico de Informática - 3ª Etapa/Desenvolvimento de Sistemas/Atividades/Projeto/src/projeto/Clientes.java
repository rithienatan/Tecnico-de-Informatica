package projeto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

import Ultilitarios.ConectaBanco;

public class Clientes extends JInternalFrame {
	ConectaBanco conexao = new ConectaBanco();
	private JTextField textnome_cli;
	private JTextField textcodigo_cli;
	private JTextField textcidade_cli;
	private JTextField textendereco_cli;
	private JTextField textbairro_cli;
	private JTextField textrg_cli;
	private JFormattedTextField jfcpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes();
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
	public Clientes() {
		conexao.conectar();
		setClosable(true);
		setMaximizable(true);
		setTitle("Clientes");
		setBounds(100, 100, 560, 433);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 73, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o:");
		lblNewLabel_1.setBounds(10, 201, 64, 17);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("C\u00F3digo:");
		lblNewLabel_2.setBounds(10, 23, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RG:");
		lblNewLabel_3.setBounds(10, 115, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CPF:");
		lblNewLabel_4.setBounds(10, 155, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cidade:");
		lblNewLabel_5.setBounds(10, 291, 46, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Bairro:");
		lblNewLabel_6.setBounds(10, 245, 46, 14);
		getContentPane().add(lblNewLabel_6);
		
		textnome_cli = new JTextField();
		textnome_cli.setBounds(87, 73, 447, 20);
		getContentPane().add(textnome_cli);
		textnome_cli.setColumns(10);
		
		textcodigo_cli = new JTextField();
		textcodigo_cli.setEditable(false);
		textcodigo_cli.setEnabled(false);
		textcodigo_cli.setBounds(87, 23, 105, 20);
		getContentPane().add(textcodigo_cli);
		textcodigo_cli.setColumns(10);
		
		textcidade_cli = new JTextField();
		textcidade_cli.setBounds(87, 291, 447, 20);
		getContentPane().add(textcidade_cli);
		textcidade_cli.setColumns(10);
		
		textendereco_cli = new JTextField();
		textendereco_cli.setBounds(87, 202, 447, 20);
		getContentPane().add(textendereco_cli);
		textendereco_cli.setColumns(10);
		
		textbairro_cli = new JTextField();
		textbairro_cli.setBounds(87, 245, 447, 20);
		getContentPane().add(textbairro_cli);
		textbairro_cli.setColumns(10);
		
		textrg_cli = new JTextField();
		textrg_cli.setBounds(87, 115, 195, 20);
		getContentPane().add(textrg_cli);
		textrg_cli.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//valida se os campos estão preenchidos
		        if (
		        	(textnome_cli.getText().length()> 0)&&
		        	(textcidade_cli.getText().length()>0)&&
		        	(textendereco_cli.getText().length()>0)&&
		        	(textbairro_cli.getText().length()>0)&&
		        	(jfcpf.getText().length()>0))
		               	
		        {
		        	try 
						{
		        		//instanciando um objeto preparando o statement recebendo uma preparação de conexão para inserção dos dados atraves de uma instrução sql
						//ao declarar o proprio java ira solicitar que seja envolvido em um try e catch pois sempre que for manipular o bd será preciso
						java.sql.PreparedStatement pst = conexao.conn.prepareStatement("insert into clientes(nome_cliente, endereco_cliente, rg_cliente, cpf_cliente, id_cidade, id_bairro) values(?,?,?,?,?,?)");
						pst.setString(1, textnome_cli.getText());//(passagem dos parametros)setando o campo nome no banco de dados a partir da leitura do que for informado no textfield do formulário
						pst.setString(2, textendereco_cli.getText());//(passagem dos parametros)setando o campo sigla no banco de dados a partir da leitura do que for informado no textfield do formulário
						pst.setString(3, textrg_cli.getText());
						pst.setString(4, jfcpf.getText());
						pst.setString(5, textcidade_cli.getText());
						pst.setString(6, textbairro_cli.getText());
						
					    pst.executeUpdate();//update do banco após a inserção para atualizar o banco de dados
						JOptionPane.showMessageDialog(rootPane, "Dados Salvos com Sucesso");// apresenta uma msg de dados salvo com sucesso, o parametro root panel
						} 
					catch (SQLException e) 
						{
						JOptionPane.showMessageDialog(rootPane, "Erro\n Erro:" + e);
						}
				}
		     else 
		     	{
		            JOptionPane.showMessageDialog(null, "Confira os campos Obrigatórios!!");
		     	}	
				
				
				textcodigo_cli.setText("");
				textnome_cli.setText("");
				textendereco_cli.setText("");
				textrg_cli.setText("");
				textbairro_cli.setText("");
				textcidade_cli.setText("");
				
			}
		});
		btnNewButton.setBounds(10, 369, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textnome_cli.setText("");
				textcodigo_cli.setText("");
				textcidade_cli.setText("");
				textendereco_cli.setText("");
				textbairro_cli.setText("");
				textrg_cli.setText("");
				jfcpf.setValue(null);
							
			}
		});
		btnNewButton_1.setBounds(445, 369, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JFormattedTextField jft_cpf = null;
		try {
			jfcpf = new JFormattedTextField(new MaskFormatter ("###.###.###-##"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		jfcpf.setBounds(87, 155, 195, 20);
		getContentPane().add(jfcpf);

	}

}
