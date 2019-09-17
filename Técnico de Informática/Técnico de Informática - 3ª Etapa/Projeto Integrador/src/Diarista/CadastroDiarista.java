package Diarista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;

public class CadastroDiarista extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDiarista frame = new CadastroDiarista();
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
	public CadastroDiarista() {
		setTitle("Cadastro Diarista");
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 57, 46, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(10, 82, 160, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCfp = new JLabel("CPF");
		lblCfp.setBounds(10, 113, 46, 14);
		contentPane.add(lblCfp);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 138, 160, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(313, 57, 96, 14);
		contentPane.add(lblDataDeNascimento);
		
		textField_2 = new JTextField();
		textField_2.setBounds(313, 82, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(10, 169, 46, 14);
		contentPane.add(lblRg);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 194, 160, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(313, 113, 46, 14);
		contentPane.add(lblSexo);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil");
		lblEstadoCivil.setBounds(313, 169, 64, 14);
		contentPane.add(lblEstadoCivil);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(313, 194, 96, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(313, 138, 96, 20);
		contentPane.add(comboBox_1);
	}
}
