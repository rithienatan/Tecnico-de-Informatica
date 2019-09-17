package Diarista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import java.awt.Insets;
import javax.swing.JMenu;
import java.awt.ComponentOrientation;
import java.awt.Component;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.Box;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.DebugGraphics;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.List;
import javax.swing.JMenuItem;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLayeredPane;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;

public class Diarista02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diarista02 frame = new Diarista02();
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
	public Diarista02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFeedDeNoticial = new JLabel("Feed de Noticial");
		lblFeedDeNoticial.setBounds(0, 254, 524, 50);
		lblFeedDeNoticial.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblFeedDeNoticial);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setEnabled(false);
		menuBar.setBounds(0, 0, 524, 50);
		contentPane.add(menuBar);
		
		JMenu mnIcone = new JMenu("Icone");
		menuBar.add(mnIcone);
		
		JMenuItem mntmPerfil = new JMenuItem("Perfil");
		mnIcone.add(mntmPerfil);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Contatos");
		mnIcone.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Promo\u00E7\u00F5es");
		mnIcone.add(mntmNewMenuItem_1);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnIcone.add(mntmSair);
		
		JSeparator separator = new JSeparator();
		separator.setEnabled(false);
		menuBar.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		menuBar.add(separator_1);
		
		JSeparator separator_4 = new JSeparator();
		menuBar.add(separator_4);
		
		JLabel lblNewLabel = new JLabel("Diarista");
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		menuBar.add(lblNewLabel);
		
		JSeparator separator_2 = new JSeparator();
		menuBar.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setEnabled(false);
		menuBar.add(separator_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(true);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Rithie\\Desktop\\android-search_icon.png"));
		menuBar.add(btnNewButton);
		
		JMenu mnNewMenu = new JMenu("Icone");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmConfiguraes = new JMenuItem("Configura\u00E7\u00F5es");
		mnNewMenu.add(mntmConfiguraes);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mnNewMenu.add(mntmSobre);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mnNewMenu.add(mntmLogout);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
