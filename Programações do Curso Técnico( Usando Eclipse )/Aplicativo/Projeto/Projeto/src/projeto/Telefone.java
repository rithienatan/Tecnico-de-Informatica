package projeto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class Telefone extends JInternalFrame {
	private JTextField textcodigo_tel;
	private JFormattedTextField jftel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telefone frame = new Telefone();
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
	public Telefone() {
		setClosable(true);
		setMaximizable(true);
		setTitle("Telefone");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo:");
		lblNewLabel.setBounds(46, 44, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Telefone:");
		lblNewLabel_1.setBounds(46, 118, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		textcodigo_tel = new JTextField();
		textcodigo_tel.setBounds(118, 41, 60, 20);
		getContentPane().add(textcodigo_tel);
		textcodigo_tel.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(25, 236, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				textcodigo_tel.setText("");
				jftel.setValue(null);
				
			}
		});
		btnNewButton_1.setBounds(323, 236, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JFormattedTextField texttelefone_tel = null;
		try {
			jftel = new JFormattedTextField(new MaskFormatter("(##)####-####"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		jftel.setBounds(119, 115, 125, 20);
		getContentPane().add(jftel);

	}
}
