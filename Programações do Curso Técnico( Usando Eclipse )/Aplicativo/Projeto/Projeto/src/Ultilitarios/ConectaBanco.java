package Ultilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConectaBanco 
{
	public Connection conn;//respons�vel por realizar a conex�o com o banco de dados
	public Statement stm;//respons�vel por preparar e realizar as consultas ao banco de dados
	public ResultSet res;//respons�vel por armazenar o resultado de uma pesquisa passada para o statement
	private String servidor ="jdbc:mysql://localhost:3306/sistemacompleto";//respons�vel por setar o local do banco de dados
	private String usuario = "root";
	private String senha = "903136";
	private String driver = "com.mysql.jbdc.Driver";//respons�vel por identificar o servi�o de banco de dados

	public void conectar() // m�todo para conectar ao banco de dados
{
	try // tentativa inicial do m�todo
	{
		System.setProperty("Jdbc.Drivers", driver);//passa a propriedade do driver a ser utilizado
		conn=DriverManager.getConnection(servidor, usuario, senha);//drivemanager gerencia a conex�o fazendo a leitura dos parametros (servidor, usuario e senha) 
		JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
	}
	catch(Exception e )//exce��o, ocorre quando n�o for executado a tentativa
	{
		JOptionPane.showMessageDialog(null, "Erro de conex�o!\n" + e.getMessage());
	}
	
	}


	
	public void executasql(String sql)//criando m�todo para execu��o de query
	{
		try
		{
			//statement recebe a conex�o criando s statement passando como parametros o resultset case sensitive e em qualquer dire��o (do inicio para o fim ou do fim para o inicio)
			stm = conn.createStatement(res.TYPE_SCROLL_INSENSITIVE, res.CONCUR_READ_ONLY);
			res = stm.executeQuery(sql);//aqui o resultset recebe a string query que for passada
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Erro no executa sql\n" +e);
		}
	}
	
	
	
	public void desconectar()//m�todo para fechar a conex�o
	{
		try//tentativa
		{
			conn.close();//fecha a conex�o
		}
		catch(Exception e)//exce��o
		{
			JOptionPane.showMessageDialog(null, "Erro ao desconectar!\n" + e.getMessage());	
		}
	}
}