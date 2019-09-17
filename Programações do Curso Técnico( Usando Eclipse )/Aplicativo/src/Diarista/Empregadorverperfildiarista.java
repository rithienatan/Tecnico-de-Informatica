package Diarista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;

public class Empregadorverperfildiarista extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empregadorverperfildiarista frame = new Empregadorverperfildiarista();
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
	public Empregadorverperfildiarista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.DARK_GRAY);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 424, 282);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.DARK_GRAY);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(0, 0, 434, 37);
		panel.add(panel_1);
		
		JLabel label = new JLabel("Perfil");
		label.setForeground(Color.DARK_GRAY);
		label.setBackground(Color.LIGHT_GRAY);
		label.setBounds(206, 6, 38, 16);
		panel_1.add(label);
		
		JButton button = new JButton("Voltar");
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(6, 0, 90, 28);
		panel_1.add(button);
		
		JLabel label_1 = new JLabel("Foto");
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setBackground(Color.LIGHT_GRAY);
		label_1.setBounds(10, 49, 80, 77);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Nome: ");
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setBackground(Color.LIGHT_GRAY);
		label_2.setBounds(102, 60, 55, 16);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setForeground(Color.DARK_GRAY);
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(150, 54, 169, 28);
		panel.add(textField);
		
		JLabel label_4 = new JLabel("Telefone: ");
		label_4.setForeground(Color.DARK_GRAY);
		label_4.setBackground(Color.LIGHT_GRAY);
		label_4.setBounds(102, 138, 55, 16);
		panel.add(label_4);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setForeground(Color.DARK_GRAY);
		formattedTextField_1.setBackground(Color.LIGHT_GRAY);
		formattedTextField_1.setBounds(160, 132, 116, 28);
		panel.add(formattedTextField_1);
		
		JLabel label_5 = new JLabel("Celular: ");
		label_5.setForeground(Color.DARK_GRAY);
		label_5.setBackground(Color.LIGHT_GRAY);
		label_5.setBounds(102, 94, 55, 16);
		panel.add(label_5);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setForeground(Color.DARK_GRAY);
		formattedTextField_2.setBackground(Color.LIGHT_GRAY);
		formattedTextField_2.setBounds(150, 88, 116, 28);
		panel.add(formattedTextField_2);
		
		JLabel label_6 = new JLabel("Email: ");
		label_6.setForeground(Color.DARK_GRAY);
		label_6.setBackground(Color.LIGHT_GRAY);
		label_6.setBounds(10, 175, 55, 16);
		panel.add(label_6);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.DARK_GRAY);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(52, 169, 239, 28);
		panel.add(textField_1);
		
		JLabel label_7 = new JLabel("Valor da Di\u00E1ria:");
		label_7.setForeground(Color.DARK_GRAY);
		label_7.setBackground(Color.LIGHT_GRAY);
		label_7.setBounds(10, 209, 92, 16);
		panel.add(label_7);
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		formattedTextField_3.setForeground(Color.DARK_GRAY);
		formattedTextField_3.setBackground(Color.LIGHT_GRAY);
		formattedTextField_3.setBounds(102, 203, 116, 28);
		panel.add(formattedTextField_3);
		
		JLabel lblVisualizarCurrculo = new JLabel("Visualizar curr\u00EDculo: ");
		lblVisualizarCurrculo.setForeground(Color.DARK_GRAY);
		lblVisualizarCurrculo.setBackground(Color.LIGHT_GRAY);
		lblVisualizarCurrculo.setBounds(10, 247, 116, 16);
		panel.add(lblVisualizarCurrculo);
		
		JButton button_1 = new JButton("Selecionar arquivo");
		button_1.setForeground(Color.DARK_GRAY);
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(127, 243, 149, 28);
		panel.add(button_1);
		
		JButton btnAdicionarContato = new JButton("Adicionar contato");
		btnAdicionarContato.setForeground(Color.DARK_GRAY);
		btnAdicionarContato.setBackground(Color.LIGHT_GRAY);
		btnAdicionarContato.setBounds(288, 243, 122, 28);
		panel.add(btnAdicionarContato);
		
		JLabel lblVotos = new JLabel("Votos");
		lblVotos.setBounds(20, 138, 55, 16);
		panel.add(lblVotos);
	}

}
