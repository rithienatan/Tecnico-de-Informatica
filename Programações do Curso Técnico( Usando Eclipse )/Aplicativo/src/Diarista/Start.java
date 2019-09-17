package Diarista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.DropMode;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.border.TitledBorder;
import java.awt.TextField;
import java.awt.Cursor;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import java.awt.Panel;
import javax.swing.ImageIcon;

public class Start extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		setTitle("Bem Vindo!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 450);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.CYAN);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 272, 58);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(128, 5, 0, 0);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setLabelFor(contentPane);
		
		JLabel lblNewLabel = new JLabel("Bem Vindo ao App Diarista");
		lblNewLabel.setBounds(63, 17, 147, 16);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 70, 272, 336);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton Diarista = new JButton("Diarista");
		Diarista.setBounds(85, 106, 114, 28);
		panel_1.add(Diarista);
		
		JButton Empregador = new JButton("Empregador");
		Empregador.setBounds(85, 177, 114, 28);
		panel_1.add(Empregador);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 284, 412);
		contentPane.add(lblNewLabel_1);
	}
}
