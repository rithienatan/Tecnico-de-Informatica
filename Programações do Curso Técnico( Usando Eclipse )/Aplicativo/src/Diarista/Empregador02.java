package Diarista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JMenuItem;

public class Empregador02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empregador02 frame = new Empregador02();
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
	public Empregador02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Feed de Noticia");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 302, 524, 14);
		contentPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setEnabled(false);
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 524, 57);
		contentPane.add(menuBar);
		
		JMenu mnIcone = new JMenu("Icone");
		menuBar.add(mnIcone);
		
		JMenuItem mntmPerfil = new JMenuItem("Perfil");
		mnIcone.add(mntmPerfil);
		
		JMenuItem mntmContatos = new JMenuItem("Contatos");
		mnIcone.add(mntmContatos);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnIcone.add(mntmSair);
		
		JSeparator separator = new JSeparator();
		separator.setEnabled(false);
		menuBar.add(separator);
		
		JLabel lblEmpregador = new JLabel("Empregador");
		menuBar.add(lblEmpregador);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setEnabled(false);
		menuBar.add(separator_1);
		
		JButton button = new JButton("");
		menuBar.add(button);
		
		JMenu mnIcone_1 = new JMenu("Icone");
		menuBar.add(mnIcone_1);
		
		JMenuItem mntmConfiguraes = new JMenuItem("Configura\u00E7\u00F5es");
		mnIcone_1.add(mntmConfiguraes);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mnIcone_1.add(mntmSobre);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mnIcone_1.add(mntmLogout);
	}
}
