package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.DatosUsuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginVentana extends JFrame {

	private JPanel contentPane;
	private JTextField txtusuario;
	private JPasswordField psspassword;

	/**
	 * Launch the application.
	 */
	

	public LoginVentana() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(59, 51, 77, 16);
		contentPane.add(lblUsuario);

		txtusuario = new JTextField();
		txtusuario.setBounds(166, 48, 116, 22);
		contentPane.add(txtusuario);
		txtusuario.setColumns(10);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(59, 106, 77, 16);
		contentPane.add(lblContrasea);
		final DatosUsuario data = new DatosUsuario();
		final OpcionVentana opc = new OpcionVentana();
		//ImageIcon imagen = new ImageIcon("src"+File.separator+"imagenes"+File.separator+"zenithOIcon.jpeg");
		//opc.setIcon(imagen);
		
	//	contentPane.add(opc,BorderLayout.CENTER);
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (data.probarpass() == 1) {
					JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
					opc.setVisible(true);
					dispose();
				} else {
						JOptionPane.showMessageDialog(null, "Error, usuario o contraseña incorrectas");

						//JOptionPane.showMessageDialog(null, "Demasiados fallos, intentelo mas tarde");

					

				}

			}
		});
		btnEntrar.setBounds(66, 179, 97, 25);
		contentPane.add(btnEntrar);

		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(261, 179, 97, 25);
		contentPane.add(btnNewButton);

		psspassword = new JPasswordField();
		psspassword.setBounds(166, 103, 116, 22);
		contentPane.add(psspassword);
	}

	public void setTxtusuario(JTextField txtusuario) {
		this.txtusuario = txtusuario;
	}

	public void setPsspassword(JPasswordField psspassword) {
		this.psspassword = psspassword;
	}

	public JTextField getTxtusuario() {
		return txtusuario;
	}

	public JPasswordField getPsspassword() {
		return psspassword;
	}
	
	
}
