package teste;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.print.DocFlavor.URL;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Toolkit;

public class teste extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teste frame = new teste();
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
	public teste() {
        
        java.net.URL url = this.getClass().getResource("/image/Icone_diarista.png");  
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(imagemTitulo);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 635);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel foto = new JLabel("");
		foto.setBounds(10, 10, 500, 500);
		
		ImageIcon imagem = new ImageIcon(teste.class.getResource("/image/tumblr_m39qj6mK6v1qzt4vjo1_500.gif"));
        Image imag = imagem.getImage();

        foto.setIcon(new ImageIcon(imag));
		
		contentPane.add(foto);
	}

}
