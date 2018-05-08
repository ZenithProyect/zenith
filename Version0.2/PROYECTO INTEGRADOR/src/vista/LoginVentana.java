package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
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

public class LoginVentana extends JPanel {

	private JPanel contentPane;
	private JTextField txtusuario;
	private JPasswordField psspassword;

	public LoginVentana() {
		super();
		inicializar();
	}
	private void inicializar() {
		setPreferredSize(new Dimension(435, 270));
		setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(59, 51, 77, 16);
		add(lblUsuario);

		txtusuario = new JTextField();
		txtusuario.setBounds(166, 48, 116, 22);
		add(txtusuario);
		txtusuario.setColumns(10);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(59, 106, 77, 16);
		add(lblContrasea);
		
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verificarUsrYpsw();
			}
		});
		btnEntrar.setBounds(66, 179, 97, 25);
		add(btnEntrar);

		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(261, 179, 97, 25);
		add(btnNewButton);

		psspassword = new JPasswordField();
		psspassword.setBounds(166, 103, 116, 22);
		add(psspassword);
	}
	
		private void verificarUsrYpsw() {
			DatosUsuario data = new DatosUsuario();
			OpcionVentana opc = new OpcionVentana();
			VentanaMenu vm = new VentanaMenu();
			if (data.probarpass() == 1) {
				JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
				opc.setVisible(true);
				vm.setVisible(false);
				
			} else {
					JOptionPane.showMessageDialog(null, "Error, usuario o contraseña incorrectas");
			}
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
