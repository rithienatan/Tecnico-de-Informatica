package projeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import Ultilitarios.ConectaBanco;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Frame;
import java.awt.ComponentOrientation;
import java.beans.PropertyVetoException;

public class Formulario extends JFrame 
{
ConectaBanco conexao = new ConectaBanco();//criar uma instancia para a classe ConectaBanco

	public JPanel jdp_principal;
	
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Formulario() 
	{
		conexao.conectar();//chama o método da conexão
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 269);
		jdp_principal = new JPanel();
		jdp_principal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(jdp_principal);
		jdp_principal.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1276, 21);
		jdp_principal.add(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenuItem mntmEstado = new JMenuItem("Estado");
		mntmEstado.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Estado estado = new Estado();
				jdp_principal.add(estado);
				estado.setVisible(true);
										
			}
		});
		mnCadastro.add(mntmEstado);
		
		JMenuItem mntmCidade = new JMenuItem("Cidade");
		mntmCidade.addActionListener(new ActionListener() 
		{
		
			public void actionPerformed(ActionEvent e) 
			{
			
				Cidade cidade = new Cidade();
				jdp_principal.add(cidade);
				cidade.setVisible(true);
					
			}
		});
		mnCadastro.add(mntmCidade);
		
		JMenuItem mntmBairro = new JMenuItem("Bairro");
		mntmBairro.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			
				Bairro bairro = new Bairro();
				jdp_principal.add(bairro);
				bairro.setVisible(true);
						
			}
		});
		mnCadastro.add(mntmBairro);
		
		JMenuItem mntmTelefones = new JMenuItem("Telefones");
		mntmTelefones.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Telefone telefone = new Telefone();
				jdp_principal.add(telefone);
				telefone.setVisible(true);
			}
		});
		mnCadastro.add(mntmTelefones);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Clientes clientes = new Clientes();
				jdp_principal.add(clientes);
				clientes.setVisible(true);
			}
		});
		mnCadastro.add(mntmClientes);
		
		JMenuItem mntmFornecedores = new JMenuItem("Fornecedores");
		mntmFornecedores.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Fornecedores fornecedores = new Fornecedores();
				jdp_principal.add(fornecedores);
				fornecedores.setVisible(true);
			}
		});
		mnCadastro.add(mntmFornecedores);
		
		JMenuItem mntmProdutos = new JMenuItem("Produtos");
		mntmProdutos.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Produtos produtos = new Produtos();
				jdp_principal.add(produtos);
				produtos.setVisible(true);
			}
		});
		mnCadastro.add(mntmProdutos);
		
		JMenu mnCompra = new JMenu("Compra");
		menuBar.add(mnCompra);
		
		JMenu mnVenda = new JMenu("Venda");
		menuBar.add(mnVenda);
		
		JMenu mnRelatorios = new JMenu("Relat\u00F3rios");
		menuBar.add(mnRelatorios);
		
		JMenu jmSair = new JMenu("Sair");
		menuBar.add(jmSair);
		
		JMenuItem mntmSair = new JMenuItem("Encerrar Sistema");
		mntmSair.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				conexao.desconectar();//chama o método de desconectar do banco de dados
				System.exit(0);//ação que sai do sistema ao clicar no menu sair
			}
		});
		jmSair.add(mntmSair);
	}
}
