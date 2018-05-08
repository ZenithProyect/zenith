package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;

import controlador.NuevoAlumno;
import controlador.DatosUsuario;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearAlumnoVentana extends JPanel {

	public static JTextField CampoCodNum;
	public static JTextField CampoNumExp;
	public static JTextField CampoNombre;
	public static JTextField CampoApellido;

	public CrearAlumnoVentana() {
		super();
		inicializar();
}

	private void inicializar() {
		setPreferredSize(new Dimension(435, 270));
		setLayout(null);
		
		JLabel lblCodigoNumerico = new JLabel("Codigo Numerico");
		lblCodigoNumerico.setBounds(12, 13, 109, 16);
		add(lblCodigoNumerico);
		
		JLabel lblNumeroExpediente = new JLabel("Numero Expediente");
		lblNumeroExpediente.setBounds(12, 67, 134, 16);
		add(lblNumeroExpediente);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 122, 109, 16);
		add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellido");
		lblApellidos.setBounds(12, 177, 56, 16);
		add(lblApellidos);
		
		CampoCodNum = new JTextField();
		CampoCodNum.setBounds(175, 13, 116, 22);
		add(CampoCodNum);
		CampoCodNum.setColumns(10);
		
		CampoNumExp = new JTextField();
		CampoNumExp.setBounds(175, 64, 116, 22);
		add(CampoNumExp);
		CampoNumExp.setColumns(10);
		
		CampoNombre = new JTextField();
		CampoNombre.setBounds(175, 119, 116, 22);
		add(CampoNombre);
		CampoNombre.setColumns(10);
		
		CampoApellido = new JTextField();
		CampoApellido.setBounds(175, 174, 116, 22);
		add(CampoApellido);
		CampoApellido.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO Terminar LA CONFIRMACION
				String codNumAl="";//tiene que  ser INT
				String numExpAl="";
				String nombreAl="";
				String apellidoAl="";
				String frase="";
				
				codNumAl = CrearAlumnoVentana.CampoCodNum.getText();
				numExpAl = CrearAlumnoVentana.CampoNumExp.getText();
				nombreAl = CrearAlumnoVentana.CampoNombre.getText();
				apellidoAl = CrearAlumnoVentana.CampoApellido.getText();
				
				ConfirmacionCreacionAlumno cr1 = new ConfirmacionCreacionAlumno();
				frase="El Alumno "+nombreAl+" "+apellidoAl+" con numero expediente "+numExpAl+" y Codigo "+codNumAl+ "¿Los datos son correctos?";
				try {
				cr1.getTxtConfirmacion().setText(frase);
				} catch (Exception z) {
					z.printStackTrace();
				}
				cr1.setVisible(true);
			}
		});
		btnGuardar.setBounds(24, 232, 97, 25);
		add(btnGuardar);
		
		JButton btnSalir = new JButton("Atrás");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final OpcionVentana opv = new OpcionVentana();
				opv.setVisible(true);
			}
		});
		btnSalir.setBounds(326, 232, 97, 25);
		add(btnSalir);
	}
		
	}
