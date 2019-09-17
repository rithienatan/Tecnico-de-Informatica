package projeto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Produtos extends JInternalFrame {
	private JTextField textnome_prod;
	private JTextField textcodigo_prod;
	private JTextField textfornecedores_prod;
	private JTextField textquantidade_prod;
	private JTextField textprecocompra_prod;
	private JTextField textprecovenda_prod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Produtos frame = new Produtos();
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
	public Produtos() {
		setClosable(true);
		setMaximizable(true);
		setTitle("Produtos");
		setBounds(100, 100, 542, 366);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 71, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo:");
		lblNewLabel_1.setBounds(10, 27, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fornecedor:");
		lblNewLabel_2.setBounds(10, 233, 59, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Quantidade");
		lblNewLabel_3.setBounds(10, 187, 59, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Pre\u00E7o de Compra:");
		lblNewLabel_4.setBounds(10, 109, 94, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Pre\u00E7o de Venda:");
		lblNewLabel_5.setBounds(10, 150, 94, 14);
		getContentPane().add(lblNewLabel_5);
		
		textnome_prod = new JTextField();
		textnome_prod.setBounds(101, 68, 393, 20);
		getContentPane().add(textnome_prod);
		textnome_prod.setColumns(10);
		
		textcodigo_prod = new JTextField();
		textcodigo_prod.setBounds(101, 24, 59, 20);
		getContentPane().add(textcodigo_prod);
		textcodigo_prod.setColumns(10);
		
		textfornecedores_prod = new JTextField();
		textfornecedores_prod.setBounds(101, 230, 393, 20);
		getContentPane().add(textfornecedores_prod);
		textfornecedores_prod.setColumns(10);
		
		textquantidade_prod = new JTextField();
		textquantidade_prod.setBounds(101, 184, 112, 20);
		getContentPane().add(textquantidade_prod);
		textquantidade_prod.setColumns(10);
		
		textprecocompra_prod = new JTextField();
		textprecocompra_prod.setBounds(101, 106, 112, 20);
		getContentPane().add(textprecocompra_prod);
		textprecocompra_prod.setColumns(10);
		
		textprecovenda_prod = new JTextField();
		textprecovenda_prod.setBounds(101, 147, 112, 20);
		getContentPane().add(textprecovenda_prod);
		textprecovenda_prod.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(15, 302, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textnome_prod.setText("");
				textcodigo_prod.setText("");
				textfornecedores_prod.setText("");
				textquantidade_prod.setText("");
				textprecocompra_prod.setText("");
				textprecovenda_prod.setText("");
				
				
				
			}
		});
		btnNewButton_1.setBounds(427, 302, 89, 23);
		getContentPane().add(btnNewButton_1);

	}

}
