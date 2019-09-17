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

public class Clientes extends JInternalFrame {
	private JTextField textnome_cli;
	private JTextField textcodigo_cli;
	private JTextField textcidade_cli;
	private JTextField textendereco_cli;
	private JTextField textbairro_cli;
	private JTextField textrg_cli;
	private JFormattedTextField jfcpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes();
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
	public Clientes() {
		setClosable(true);
		setMaximizable(true);
		setTitle("Clientes");
		setBounds(100, 100, 560, 433);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 73, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o:");
		lblNewLabel_1.setBounds(10, 201, 64, 17);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("C\u00F3digo:");
		lblNewLabel_2.setBounds(10, 23, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RG:");
		lblNewLabel_3.setBounds(10, 115, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CPF:");
		lblNewLabel_4.setBounds(10, 155, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cidade:");
		lblNewLabel_5.setBounds(10, 291, 46, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Bairro:");
		lblNewLabel_6.setBounds(10, 245, 46, 14);
		getContentPane().add(lblNewLabel_6);
		
		textnome_cli = new JTextField();
		textnome_cli.setBounds(87, 73, 447, 20);
		getContentPane().add(textnome_cli);
		textnome_cli.setColumns(10);
		
		textcodigo_cli = new JTextField();
		textcodigo_cli.setBounds(87, 23, 105, 20);
		getContentPane().add(textcodigo_cli);
		textcodigo_cli.setColumns(10);
		
		textcidade_cli = new JTextField();
		textcidade_cli.setBounds(87, 291, 447, 20);
		getContentPane().add(textcidade_cli);
		textcidade_cli.setColumns(10);
		
		textendereco_cli = new JTextField();
		textendereco_cli.setBounds(87, 202, 447, 20);
		getContentPane().add(textendereco_cli);
		textendereco_cli.setColumns(10);
		
		textbairro_cli = new JTextField();
		textbairro_cli.setBounds(87, 245, 447, 20);
		getContentPane().add(textbairro_cli);
		textbairro_cli.setColumns(10);
		
		textrg_cli = new JTextField();
		textrg_cli.setBounds(87, 115, 195, 20);
		getContentPane().add(textrg_cli);
		textrg_cli.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(10, 369, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textnome_cli.setText("");
				textcodigo_cli.setText("");
				textcidade_cli.setText("");
				textendereco_cli.setText("");
				textbairro_cli.setText("");
				textrg_cli.setText("");
				jfcpf.setValue(null);
							
			}
		});
		btnNewButton_1.setBounds(445, 369, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JFormattedTextField jft_cpf = null;
		try {
			jfcpf = new JFormattedTextField(new MaskFormatter ("###.###.###-##"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		jfcpf.setBounds(87, 155, 195, 20);
		getContentPane().add(jfcpf);

	}

}
