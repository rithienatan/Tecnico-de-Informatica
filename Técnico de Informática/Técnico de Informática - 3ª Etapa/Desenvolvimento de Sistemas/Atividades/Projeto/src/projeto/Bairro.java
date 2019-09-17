package projeto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bairro extends JInternalFrame {
	private JTextField textnome_bar;
	private JTextField textcodigo_bar;
	private JTextField textcidade_bar;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bairro frame = new Bairro();
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
	public Bairro() {
		setClosable(true);
		setMaximizable(true);
		setTitle("Bairro");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(30, 83, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo:");
		lblNewLabel_1.setBounds(30, 25, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cidade:");
		lblNewLabel_2.setBounds(30, 147, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		textnome_bar = new JTextField();
		textnome_bar.setBounds(96, 80, 316, 20);
		getContentPane().add(textnome_bar);
		textnome_bar.setColumns(10);
		
		textcodigo_bar = new JTextField();
		textcodigo_bar.setBounds(96, 22, 86, 20);
		getContentPane().add(textcodigo_bar);
		textcodigo_bar.setColumns(10);
		
		textcidade_bar = new JTextField();
		textcidade_bar.setBounds(96, 144, 316, 20);
		getContentPane().add(textcidade_bar);
		textcidade_bar.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(25, 236, 89, 23);
		getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				textnome_bar.setText("");
				textcodigo_bar.setText("");
				textcidade_bar.setText("");
			}
		});
		btnNewButton_1.setBounds(323, 236, 89, 23);
		getContentPane().add(btnNewButton_1);

	}

}
