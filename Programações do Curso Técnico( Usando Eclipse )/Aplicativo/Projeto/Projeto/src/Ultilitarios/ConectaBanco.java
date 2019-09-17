package Ultilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConectaBanco 
{
	public Connection conn;//responsável por realizar a conexão com o banco de dados
	public Statement stm;//responsável por preparar e realizar as consultas ao banco de dados
	public ResultSet res;//responsável por armazenar o resultado de uma pesquisa passada para o statement
	private String servidor ="jdbc:mysql://localhost:3306/sistemacompleto";//responsável por setar o local do banco de dados
	private String usuario = "root";
	private String senha = "903136";
	private String driver = "com.mysql.jbdc.Driver";//responsável por identificar o serviço de banco de dados

	public void conectar() // método para conectar ao banco de dados
{
	try // tentativa inicial do método
	{
		System.setProperty("Jdbc.Drivers", driver);//passa a propriedade do driver a ser utilizado
		conn=DriverManager.getConnection(servidor, usuario, senha);//drivemanager gerencia a conexão fazendo a leitura dos parametros (servidor, usuario e senha) 
		JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
	}
	catch(Exception e )//exceção, ocorre quando não for executado a tentativa
	{
		JOptionPane.showMessageDialog(null, "Erro de conexão!\n" + e.getMessage());
	}
	
	}


	
	public void executasql(String sql)//criando método para execução de query
	{
		try
		{
			//statement recebe a conexão criando s statement passando como parametros o resultset case sensitive e em qualquer direção (do inicio para o fim ou do fim para o inicio)
			stm = conn.createStatement(res.TYPE_SCROLL_INSENSITIVE, res.CONCUR_READ_ONLY);
			res = stm.executeQuery(sql);//aqui o resultset recebe a string query que for passada
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Erro no executa sql\n" +e);
		}
	}
	
	
	
	public void desconectar()//método para fechar a conexão
	{
		try//tentativa
		{
			conn.close();//fecha a conexão
		}
		catch(Exception e)//exceção
		{
			JOptionPane.showMessageDialog(null, "Erro ao desconectar!\n" + e.getMessage());	
		}
	}
}