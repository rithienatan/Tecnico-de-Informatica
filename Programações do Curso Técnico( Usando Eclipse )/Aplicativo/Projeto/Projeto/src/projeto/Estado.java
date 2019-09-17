package projeto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Point;
import java.awt.Dimension;
import java.beans.*;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JTable;

import com.mysql.jdbc.PreparedStatement;

import Ultilitarios.ConectaBanco;
public class Estado extends JInternalFrame 
{
	ConectaBanco conexao = new ConectaBanco();//instanciando objeto para a classe de conexao com o banco
	
	private JTextField textnome_est;
	private JTextField textcodigo_est;
	private JTextField textsigla_est;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estado frame = new Estado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Estado() 
	{
		conexao.conectar();//chama o m�todo de conex�o
		setMaximizable(true);
		setTitle("Cadastro de Estado");
		setClosable(true);
		setBounds(100, 100, 680, 309);
		getContentPane().setLayout(null);
		
		final JLabel lblnomeest = new JLabel("Nome:");
		lblnomeest.setBounds(43, 100, 46, 14);
		getContentPane().add(lblnomeest);
		
		textnome_est = new JTextField();
		textnome_est.setEnabled(false);
		textnome_est.setBounds(99, 97, 337, 20);
		getContentPane().add(textnome_est);
		textnome_est.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F2digo:");
		lblNewLabel_1.setBounds(43, 49, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		textcodigo_est = new JTextField();
		textcodigo_est.setEnabled(false);
		textcodigo_est.setBounds(99, 46, 86, 20);
		getContentPane().add(textcodigo_est);
		textcodigo_est.setColumns(10);
		
		final JLabel lblsiglaest = new JLabel("Sigla:");
		lblsiglaest.setBounds(43, 149, 46, 14);
		getContentPane().add(lblsiglaest);
		
		textsigla_est = new JTextField();
		textsigla_est.setEnabled(false);
		textsigla_est.setBounds(99, 146, 64, 20);
		getContentPane().add(textsigla_est);
		textsigla_est.setColumns(10);
		
		final JButton btnnovoest = new JButton("");
		btnnovoest.addActionListener(new ActionListener() 
		{
			//a��o para habilitar e desabilitar os campos ao clicar no bot�o novo
			public void actionPerformed(ActionEvent arg0) 
			{
				textnome_est.setEnabled(true);
				textsigla_est.setEnabled(true);
				btnnovoest.setEnabled(false);
															
			}
		});
		btnnovoest.setToolTipText("Novo");
		btnnovoest.setIcon(new ImageIcon(Estado.class.getResource("/imagens/bt_novo.gif")));
		btnnovoest.setBounds(10, 209, 64, 59);
		getContentPane().add(btnnovoest);
		
		final JButton btneditaest = new JButton("Editar");
		btneditaest.setActionCommand("");
		btneditaest.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent arg0)
			{
				try 
				{
					java.sql.PreparedStatement pst = conexao.conn.prepareStatement("update estado set nome_estado = ?, sigla_estado = ? where id_estado = ?");
					pst.setString(1,textnome_est.getText());//(passagem dos parametros)setando o campo nome no banco de dados a partir da leitura do que for informado no textfield do formul�rio
					pst.setString(2, textsigla_est.getText());//(passagem dos parametros)setando o campo sigla no banco de dados a partir da leitura do que for informado no textfield do formul�rio
					pst.setInt(3, Integer.parseInt(textcodigo_est.getText()));
					pst.executeUpdate();//update do banco ap�s a inser��o para atualizar o banco de dados
					JOptionPane.showMessageDialog(rootPane, "Alterado com Sucesso");// apresenta uma msg de dados salvo com sucesso.
				} 
				catch (SQLException e) 
				{
					JOptionPane.showMessageDialog(rootPane, "Erro ao alterar\n Erro:" + e);
				}	
				
			}
		});
		btneditaest.setBounds(178, 236, 79, 23);
		getContentPane().add(btneditaest);
		
		final JButton btnsalvarest = new JButton("Salvar");
		btnsalvarest.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				//valida se os campos est�o preenchidos
		        if ((textnome_est.getText().length()>0)&&(textsigla_est.getText().length()> 0))
		            
		        {
		        	try 
						{
		        		//instanciando um objeto preparando o statement recebendo uma prepara��o de conex�o para inser��o dos dados atraves de uma instru��o sql
						//ao declarar o proprio java ira solicitar que seja envolvido em um try e catch pois sempre que for manipular o bd ser� preciso
						java.sql.PreparedStatement pst = conexao.conn.prepareStatement("insert into estado(nome_estado, sigla_estado) values(?,?)");
						pst.setString(1,textnome_est.getText());//(passagem dos parametros)setando o campo nome no banco de dados a partir da leitura do que for informado no textfield do formul�rio
						pst.setString(2, textsigla_est.getText());//(passagem dos parametros)setando o campo sigla no banco de dados a partir da leitura do que for informado no textfield do formul�rio
						pst.executeUpdate();//update do banco ap�s a inser��o para atualizar o banco de dados
						JOptionPane.showMessageDialog(rootPane, "Dados Salvos com Sucesso");// apresenta uma msg de dados salvo com sucesso, o parametro root panel
						} 
					catch (SQLException e) 
						{
						JOptionPane.showMessageDialog(rootPane, "Erro\n Erro:" + e);
						}
				}
		     else 
		     	{
		            JOptionPane.showMessageDialog(null, "Confira os campos Obrigat�rios!!");
		     	}	
				
				
				textcodigo_est.setText("");
				textnome_est.setText("");
				textsigla_est.setText("");
				textnome_est.setEnabled(false);
				textsigla_est.setEnabled(false);
				btnnovoest.setEnabled(true);
				btneditaest.setEnabled(true);
				btnsalvarest.setEnabled(true);
				}
		});
		btnsalvarest.setBounds(84, 236, 84, 23);
		getContentPane().add(btnsalvarest);
		
		JButton btnexcluirest = new JButton("Excluir");
		btnexcluirest.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
				//instanciando um objeto preparando o statement recebendo uma prepara��o de conex�o para dele��o dos dados atraves de uma instru��o sql
				//ao declarar o proprio java ira solicitar que seja envolvido em um try e catch pois sempre que for manipular o bd ser� preciso
				try 
				{
					java.sql.PreparedStatement pst = conexao.conn.prepareStatement("delete from estado where sigla_estado=?");
					pst.setString(1, textsigla_est.getText());
					pst.executeUpdate();//update do banco ap�s a dele��o para atualizar o banco de dados
					JOptionPane.showMessageDialog(rootPane, "Dados Exclu�dos com Sucesso");// apresenta uma msg de dados exclu�dos com sucesso 
				} 
				catch (SQLException e) 
				{
					JOptionPane.showMessageDialog(rootPane, "N�o foi poss�vel realizar o processo\n Erro:" + e);
				}
			
				textnome_est.setText("");
				textsigla_est.setText("");
				btnnovoest.setEnabled(true);
			}
		});
		btnexcluirest.setBounds(466, 236, 89, 23);
		getContentPane().add(btnexcluirest);
		
		JButton btnsairest = new JButton("Sair");
		btnsairest.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Estado.this.dispose();//a��o para sair somente do internal frame sem fechar todo o sistema
			}
		});
		btnsairest.setBounds(565, 236, 89, 23);
		getContentPane().add(btnsairest);
		
		JButton btnPrimeiro = new JButton("Primeiro");
		btnPrimeiro.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
			
				textnome_est.setEnabled(true);
				textsigla_est.setEnabled(true);
				
				//instanciando um objeto preparando o statement recebendo uma prepara��o de conex�o para dele��o dos dados atraves de uma instru��o sql
				//ao declarar o proprio java ira solicitar que seja envolvido em um try e catch pois sempre que for manipular o bd ser� preciso
				try 
				{
					conexao.executasql("select * from estado");//chamando o metodo executa sql da classe conectabanco
					conexao.res.first();//chamando o resultado da pesquisa no banco de dados sendo a partir do primeiro dado
					textcodigo_est.setText(String.valueOf(conexao.res.getInt("id_estado")));//mostrando o codigo por�m � preciso fazer a conversao de int para string
					textnome_est.setText(conexao.res.getString("nome_estado"));//mostra o nome
					textsigla_est.setText(conexao.res.getString("sigla_estado"));
				} 
				catch (SQLException e) 
				{
					JOptionPane.showMessageDialog(rootPane, "Erro ao buscar dados\n Erro:" + e);
				}
			
							
			}
		});
		btnPrimeiro.setBounds(267, 236, 94, 23);
		getContentPane().add(btnPrimeiro);
		
		JButton btnProximo = new JButton("Pr\u00F3ximo");
		btnProximo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{

				textnome_est.setEnabled(true);
				textsigla_est.setEnabled(true);
				
				//instanciando um objeto preparando o statement recebendo uma prepara��o de conex�o para dele��o dos dados atraves de uma instru��o sql
				//ao declarar o proprio java ira solicitar que seja envolvido em um try e catch pois sempre que for manipular o bd ser� preciso
				try 
				{
					conexao.res.next();//chamando o resultado da pesquisa no banco de dados sendo a partir do proximo dado
					textcodigo_est.setText(String.valueOf(conexao.res.getInt("id_estado")));//mostrando o codigo por�m � preciso fazer a conversao de int para string
					textnome_est.setText(conexao.res.getString("nome_estado"));//mostra o nome
					textsigla_est.setText(conexao.res.getString("sigla_estado"));
				} 
				catch (SQLException e) 
				{
					JOptionPane.showMessageDialog(rootPane, "Erro ao buscar dados\n Erro:" + e);
				}
			
			
			}
		});
		btnProximo.setBounds(371, 236, 85, 23);
		getContentPane().add(btnProximo);

	}
}
