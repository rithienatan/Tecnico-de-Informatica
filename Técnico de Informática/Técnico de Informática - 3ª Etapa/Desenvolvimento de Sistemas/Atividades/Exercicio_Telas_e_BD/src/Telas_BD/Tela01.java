package Telas_BD;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JProgressBar;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class Tela01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela01 frame = new Tela01();
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
	public Tela01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Cadastro = new JMenu("Cadastro");
		menuBar.add(Cadastro);
		
		JMenuItem estado = new JMenuItem("Estado");
		Cadastro.add(estado);
		
		JMenuItem cidade = new JMenuItem("Cidade");
		Cadastro.add(cidade);
		
		JMenuItem bairro = new JMenuItem("Bairro");
		Cadastro.add(bairro);
		
		JMenuItem telefone = new JMenuItem("Telefones");
		Cadastro.add(telefone);
		
		JMenuItem cliente = new JMenuItem("Clientes");
		Cadastro.add(cliente);
		
		JMenuItem fornecedor = new JMenuItem("Fornecedores");
		Cadastro.add(fornecedor);
		
		JMenuItem produto = new JMenuItem("Produto");
		Cadastro.add(produto);
		
		JMenuItem compra = new JMenuItem("Compra");
		compra.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(compra);
		
		JMenuItem venda = new JMenuItem("Venda");
		venda.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(venda);
		
		JMenuItem relatorio = new JMenuItem("Relat\u00F3rios");
		relatorio.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(relatorio);
		
		JMenuItem sair = new JMenuItem("Sair");
		sair.setHorizontalAlignment(SwingConstants.RIGHT);
		menuBar.add(sair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
