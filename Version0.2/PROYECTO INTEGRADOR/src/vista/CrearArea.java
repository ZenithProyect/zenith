package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearArea extends JFrame {

	private JPanel contentPane;
	private JTextField textNomAr;
	private JTextField txtCodAr;
	private JTextField txtDescAr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearArea frame = new CrearArea();
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
	public CrearArea() {
		super("Nueva Area");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 35, 56, 16);
		contentPane.add(lblNombre);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(12, 84, 56, 16);
		contentPane.add(lblCodigo);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(12, 136, 80, 16);
		contentPane.add(lblDescripcion);
		
		textNomAr = new JTextField();
		textNomAr.setBounds(84, 32, 116, 22);
		contentPane.add(textNomAr);
		textNomAr.setColumns(10);
		
		txtCodAr = new JTextField();
		txtCodAr.setColumns(10);
		txtCodAr.setBounds(84, 81, 116, 22);
		contentPane.add(txtCodAr);
		
		txtDescAr = new JTextField();
		txtDescAr.setColumns(10);
		txtDescAr.setBounds(84, 133, 116, 22);
		contentPane.add(txtDescAr);
		
		JButton btnGuardarAr = new JButton("Guardar");
		btnGuardarAr.setBounds(22, 215, 97, 25);
		contentPane.add(btnGuardarAr);
		
		JButton btnSalirAr = new JButton("Atrás");
		btnSalirAr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final OpcionVentana opv = new OpcionVentana();
				opv.setVisible(true);
				dispose();

			}
		});
		btnSalirAr.setBounds(323, 215, 97, 25);
		contentPane.add(btnSalirAr);
	}
}
