package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ConfirmacionCreacionAlumno extends JFrame {

	private JPanel contentPane;
	private JTextArea txtConfirmacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmacionCreacionAlumno frame = new ConfirmacionCreacionAlumno();
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
	public ConfirmacionCreacionAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNo = new JButton("NO");
		btnNo.setBounds(423, 202, 97, 25);
		contentPane.add(btnNo);
		
		JButton btnSi = new JButton("SI");
		btnSi.setBounds(72, 202, 97, 25);
		contentPane.add(btnSi);
		
		JTextArea txtConfirmacion = new JTextArea();
		txtConfirmacion.setBounds(12, 13, 558, 142);
		contentPane.add(txtConfirmacion);
	}

	public JTextArea getTxtConfirmacion() {
		return txtConfirmacion;
	}

	public void setTxtConfirmacion(JTextArea txtConfirmacion) {
		this.txtConfirmacion = txtConfirmacion;
	}
	


}
