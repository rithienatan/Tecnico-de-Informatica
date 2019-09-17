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

public class Fornecedores extends JInternalFrame {
	ConectaBanco conexao = new ConectaBanco();
	private JTextField textnome_for;
	private JTextField textcodigo_for;
	private JTextField textendereco_for;
	private JTextField textbairro_for;
	private JTextField textcidade_for;
	private JFormattedTextField jftcnpj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fornecedores frame = new Fornecedores();
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
	public Fornecedores() 
	{
		conexao.conectar();
		setMaximizable(true);
		setClosable(true);
		setTitle("Fornecedores");
		setBounds(100, 100, 559, 361);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 49, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo:");
		lblNewLabel_1.setBounds(10, 5, 46, 33);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o:");
		lblNewLabel_2.setBounds(10, 137, 59, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CPNJ:");
		lblNewLabel_3.setBounds(10, 93, 52, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Bairro:");
		lblNewLabel_4.setBounds(10, 186, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cidade:");
		lblNewLabel_5.setBounds(10, 239, 46, 14);
		getContentPane().add(lblNewLabel_5);
		
		textnome_for = new JTextField();
		textnome_for.setBounds(78, 46, 455, 20);
		getContentPane().add(textnome_for);
		textnome_for.setColumns(10);
		
		textcodigo_for = new JTextField();
		textcodigo_for.setEditable(false);
		textcodigo_for.setBounds(78, 11, 86, 20);
		getContentPane().add(textcodigo_for);
		textcodigo_for.setColumns(10);
		
		textendereco_for = new JTextField();
		textendereco_for.setBounds(79, 134, 454, 20);
		getContentPane().add(textendereco_for);
		textendereco_for.setColumns(10);
		
		textbairro_for = new JTextField();
		textbairro_for.setBounds(78, 183, 443, 20);
		getContentPane().add(textbairro_for);
		textbairro_for.setColumns(10);
		
		textcidade_for = new JTextField();
		textcidade_for.setBounds(78, 236, 443, 20);
		getContentPane().add(textcidade_for);
		textcidade_for.setColumns(10);
		
		JButton salvar = new JButton("Salvar");
		salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				//valida se os campos estão preenchidos
		        if ((textnome_for.getText().length()>0)&&(textendereco_for.getText().length()>0)&&(textbairro_for.getText().length()>0)&&(textcidade_for.getText().length()>0)&&(jftcnpj.getText().length()>0))     
		        {
		        	try 
						{
		        		//instanciando um objeto preparando o statement recebendo uma preparação de conexão para inserção dos dados atraves de uma instrução sql
						//ao declarar o proprio java ira solicitar que seja envolvido em um try e catch pois sempre que for manipular o bd será preciso
						java.sql.PreparedStatement pst = conexao.conn.prepareStatement("insert into fornecedores(nome_fornecedor, endereco_fornecedor, cnpj_fornecedor, id_bairro, id_cidade) values(?,?,?,?,?)");
						pst.setString(1,textnome_for.getText());//(passagem dos parametros)setando o campo nome no banco de dados a partir da leitura do que for informado no textfield do formulário
						//(passagem dos parametros)setando o campo sigla no banco de dados a partir da leitura do que for informado no textfield do formulário
						pst.setString(2, textendereco_for.getText());
						pst.setString(3, textbairro_for.getText());
						pst.setString(4, textcidade_for.getText());
						pst.setString(5, jftcnpj.getText());
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
					
			}
		});
		salvar.setBounds(10, 297, 89, 23);
		getContentPane().add(salvar);
		
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e) 
			{
			
				textnome_for.setText("");
				textcodigo_for.setText("");
				textendereco_for.setText("");
				textbairro_for.setText("");
				textcidade_for.setText("");
				jftcnpj.setValue(null);
				
				
			}
		});
		btnNewButton_1.setBounds(444, 297, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JFormattedTextField jfcnpj = null;
		try {
			jftcnpj = new JFormattedTextField(new MaskFormatter("##.###.###/####-##"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		jftcnpj.setBounds(78, 90, 148, 20);
		getContentPane().add(jftcnpj);

	}

}
