package projeto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cidade extends JInternalFrame {
	private JTextField textnome_cid;
	private JTextField textcodigo_cid;
	private JTextField textestado_cid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cidade frame = new Cidade();
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
	public Cidade() {
		setMaximizable(true);
		setClosable(true);
		setTitle("Cidade");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(43, 75, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo");
		lblNewLabel_1.setBounds(43, 29, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Estado:");
		lblNewLabel_2.setBounds(43, 135, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		textnome_cid = new JTextField();
		textnome_cid.setBounds(117, 72, 295, 20);
		getContentPane().add(textnome_cid);
		textnome_cid.setColumns(10);
		
		textcodigo_cid = new JTextField();
		textcodigo_cid.setBounds(117, 26, 86, 20);
		getContentPane().add(textcodigo_cid);
		textcodigo_cid.setColumns(10);
		
		textestado_cid = new JTextField();
		textestado_cid.setBounds(117, 132, 295, 20);
		getContentPane().add(textestado_cid);
		textestado_cid.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(22, 236, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textnome_cid.setText("");
				textcodigo_cid.setText("");
				textestado_cid.setText("");
			}
		});
		btnNewButton_1.setBounds(323, 236, 89, 23);
		getContentPane().add(btnNewButton_1);

	}
}
