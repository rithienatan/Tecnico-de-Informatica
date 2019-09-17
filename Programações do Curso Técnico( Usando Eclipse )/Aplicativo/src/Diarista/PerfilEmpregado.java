package Diarista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;

public class PerfilEmpregado extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerfilEmpregado frame = new PerfilEmpregado();
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
	public PerfilEmpregado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Perfil");
		label.setForeground(Color.DARK_GRAY);
		label.setBackground(Color.LIGHT_GRAY);
		label.setBounds(200, 6, 38, 16);
		contentPane.add(label);
		
		JButton button = new JButton("Voltar");
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(0, 0, 90, 28);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("Foto");
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setBackground(Color.LIGHT_GRAY);
		label_1.setBounds(4, 49, 80, 77);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Nome: ");
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setBackground(Color.LIGHT_GRAY);
		label_2.setBounds(96, 60, 55, 16);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setForeground(Color.DARK_GRAY);
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(144, 54, 169, 28);
		contentPane.add(textField);
		
		JLabel label_3 = new JLabel("Data de Nascimento: ");
		label_3.setForeground(Color.DARK_GRAY);
		label_3.setBackground(Color.LIGHT_GRAY);
		label_3.setBounds(96, 107, 125, 16);
		contentPane.add(label_3);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setForeground(Color.DARK_GRAY);
		formattedTextField.setBackground(Color.LIGHT_GRAY);
		formattedTextField.setBounds(218, 101, 116, 28);
		contentPane.add(formattedTextField);
		
		JLabel label_4 = new JLabel("Telefone: ");
		label_4.setForeground(Color.DARK_GRAY);
		label_4.setBackground(Color.LIGHT_GRAY);
		label_4.setBounds(4, 161, 55, 16);
		contentPane.add(label_4);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setForeground(Color.DARK_GRAY);
		formattedTextField_1.setBackground(Color.LIGHT_GRAY);
		formattedTextField_1.setBounds(65, 155, 116, 28);
		contentPane.add(formattedTextField_1);
		
		JLabel label_5 = new JLabel("Celular: ");
		label_5.setForeground(Color.DARK_GRAY);
		label_5.setBackground(Color.LIGHT_GRAY);
		label_5.setBounds(218, 161, 55, 16);
		contentPane.add(label_5);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setForeground(Color.DARK_GRAY);
		formattedTextField_2.setBackground(Color.LIGHT_GRAY);
		formattedTextField_2.setBounds(266, 155, 116, 28);
		contentPane.add(formattedTextField_2);
		
		JLabel label_6 = new JLabel("Email: ");
		label_6.setForeground(Color.DARK_GRAY);
		label_6.setBackground(Color.LIGHT_GRAY);
		label_6.setBounds(4, 209, 55, 16);
		contentPane.add(label_6);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.DARK_GRAY);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(50, 203, 239, 28);
		contentPane.add(textField_1);
		
		JButton button_2 = new JButton("Editar");
		button_2.setForeground(Color.DARK_GRAY);
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(183, 358, 90, 28);
		contentPane.add(button_2);
		
		JLabel label_9 = new JLabel("Rua: ");
		label_9.setForeground(Color.DARK_GRAY);
		label_9.setBackground(Color.LIGHT_GRAY);
		label_9.setBounds(4, 243, 55, 16);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("Bairro: ");
		label_10.setForeground(Color.DARK_GRAY);
		label_10.setBackground(Color.LIGHT_GRAY);
		label_10.setBounds(6, 283, 55, 16);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("Cidade: ");
		label_11.setForeground(Color.DARK_GRAY);
		label_11.setBackground(Color.LIGHT_GRAY);
		label_11.setBounds(4, 317, 55, 16);
		contentPane.add(label_11);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.DARK_GRAY);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(48, 237, 122, 28);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.DARK_GRAY);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(50, 277, 122, 28);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.DARK_GRAY);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(50, 311, 122, 28);
		contentPane.add(textField_4);
		
		JLabel label_12 = new JLabel("Estado: ");
		label_12.setForeground(Color.DARK_GRAY);
		label_12.setBackground(Color.LIGHT_GRAY);
		label_12.setBounds(218, 243, 55, 16);
		contentPane.add(label_12);
		
		textField_5 = new JTextField();
		textField_5.setForeground(Color.DARK_GRAY);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(266, 237, 122, 28);
		contentPane.add(textField_5);
		
		JLabel label_13 = new JLabel("CEP: ");
		label_13.setForeground(Color.DARK_GRAY);
		label_13.setBackground(Color.LIGHT_GRAY);
		label_13.setBounds(218, 283, 55, 16);
		contentPane.add(label_13);
		
		textField_6 = new JTextField();
		textField_6.setForeground(Color.DARK_GRAY);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setBounds(266, 277, 122, 28);
		contentPane.add(textField_6);
		
		JButton button_3 = new JButton("Salvar");
		button_3.setForeground(Color.DARK_GRAY);
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(292, 358, 90, 28);
		contentPane.add(button_3);
	}

}
