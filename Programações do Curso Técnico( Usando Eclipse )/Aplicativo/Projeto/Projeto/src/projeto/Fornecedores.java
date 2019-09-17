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

public class Fornecedores extends JInternalFrame {
	private JTextField textnome_for;
	private JTextField textcodigo_for;
	private JTextField textendereco_for;
	private JTextField textbairro_for;
	private JTextField textcidade_for;
	private JFormattedTextField jftcnpj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fornecedores frame = new Fornecedores();
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
	public Fornecedores() {
		setMaximizable(true);
		setClosable(true);
		setTitle("Fornecedores");
		setBounds(100, 100, 559, 361);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 49, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo:");
		lblNewLabel_1.setBounds(10, 5, 46, 33);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o:");
		lblNewLabel_2.setBounds(10, 137, 59, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CPNJ:");
		lblNewLabel_3.setBounds(10, 93, 52, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Bairro:");
		lblNewLabel_4.setBounds(10, 186, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cidade:");
		lblNewLabel_5.setBounds(10, 239, 46, 14);
		getContentPane().add(lblNewLabel_5);
		
		textnome_for = new JTextField();
		textnome_for.setBounds(78, 46, 455, 20);
		getContentPane().add(textnome_for);
		textnome_for.setColumns(10);
		
		textcodigo_for = new JTextField();
		textcodigo_for.setBounds(78, 11, 86, 20);
		getContentPane().add(textcodigo_for);
		textcodigo_for.setColumns(10);
		
		textendereco_for = new JTextField();
		textendereco_for.setBounds(79, 134, 454, 20);
		getContentPane().add(textendereco_for);
		textendereco_for.setColumns(10);
		
		textbairro_for = new JTextField();
		textbairro_for.setBounds(78, 183, 443, 20);
		getContentPane().add(textbairro_for);
		textbairro_for.setColumns(10);
		
		textcidade_for = new JTextField();
		textcidade_for.setBounds(78, 236, 443, 20);
		getContentPane().add(textcidade_for);
		textcidade_for.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(10, 297, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e) 
			{
			
				textnome_for.setText("");
				textcodigo_for.setText("");
				textendereco_for.setText("");
				textbairro_for.setText("");
				textcidade_for.setText("");
				jftcnpj.setValue(null);
				
				
			}
		});
		btnNewButton_1.setBounds(444, 297, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JFormattedTextField jfcnpj = null;
		try {
			jftcnpj = new JFormattedTextField(new MaskFormatter("##.###.###/####-##"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		jftcnpj.setBounds(78, 90, 148, 20);
		getContentPane().add(jftcnpj);

	}

}
