package vista;

import java.awt.BorderLayout;
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

public class CrearAlumnoVentana extends JFrame {

	private JPanel contentPane;
	public static JTextField CampoCodNum;
	public static JTextField CampoNumExp;
	public static JTextField CampoNombre;
	public static JTextField CampoApellido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearAlumnoVentana frame = new CrearAlumnoVentana();
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
	public CrearAlumnoVentana() {
		super("Nuevo Alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigoNumerico = new JLabel("Codigo Numerico");
		lblCodigoNumerico.setBounds(12, 13, 109, 16);
		contentPane.add(lblCodigoNumerico);
		
		JLabel lblNumeroExpediente = new JLabel("Numero Expediente");
		lblNumeroExpediente.setBounds(12, 67, 134, 16);
		contentPane.add(lblNumeroExpediente);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 122, 109, 16);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellido");
		lblApellidos.setBounds(12, 177, 56, 16);
		contentPane.add(lblApellidos);
		
		
		CampoCodNum = new JTextField();
		CampoCodNum.setBounds(175, 13, 116, 22);
		contentPane.add(CampoCodNum);
		CampoCodNum.setColumns(10);
		
		CampoNumExp = new JTextField();
		CampoNumExp.setBounds(175, 64, 116, 22);
		contentPane.add(CampoNumExp);
		CampoNumExp.setColumns(10);
		
		CampoNombre = new JTextField();
		CampoNombre.setBounds(175, 119, 116, 22);
		contentPane.add(CampoNombre);
		CampoNombre.setColumns(10);
		
		CampoApellido = new JTextField();
		CampoApellido.setBounds(175, 174, 116, 22);
		contentPane.add(CampoApellido);
		CampoApellido.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codNumAl="";//tiene que ser INT
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
		btnGuardar.setBounds(22, 215, 97, 25);
		contentPane.add(btnGuardar);
		
		JButton btnSalir = new JButton("Atrás");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final OpcionVentana opv = new OpcionVentana();
				opv.setVisible(true);
				dispose();
			}
		});
		btnSalir.setBounds(323, 215, 97, 25);
		contentPane.add(btnSalir);
	}
}
