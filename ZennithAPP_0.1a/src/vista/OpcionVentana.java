package vista;

import java.awt.BorderLayout;
import controlador.NuevoAlumno;
import controlador.DatosUsuario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.DatosUsuario;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

public class OpcionVentana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcionVentana frame = new OpcionVentana();
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
	public OpcionVentana() {
		super("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCrear = new JLabel("CREAR");
		lblCrear.setBounds(28, 68, 100, 16);
		contentPane.add(lblCrear);
		
		JLabel lblModificar = new JLabel("MODIFICAR");
		lblModificar.setBounds(285, 68, 100, 16);
		contentPane.add(lblModificar);
		final CrearAlumnoVentana al = new CrearAlumnoVentana();
		final CrearArea ar = new CrearArea();
		final CrearProyecto pry = new CrearProyecto();
		
		JComboBox cmbCrear = new JComboBox();
		cmbCrear.setModel(new DefaultComboBoxModel(new String[] {"ALUMNOS", "AREAS", "PROYECTOS"}));
		cmbCrear.setBounds(28, 112, 100, 25);
		contentPane.add(cmbCrear);
		cmbCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent z) {
				if(z.getSource()==cmbCrear) {
					String crear =(String) cmbCrear.getSelectedItem();
					switch(crear) {
					case "ALUMNOS": al.setVisible(true); dispose();
						break;
					case "AREAS": ar.setVisible(true);dispose();
						break;
					case "PROYECTOS": pry.setVisible(true);dispose();
						break;
					default: /*JOptionPane*/ System.out.println("Seleccione una de las opciones");
					}
				}
			}
		});
		
		JComboBox cmbModificar = new JComboBox();
		cmbModificar.setModel(new DefaultComboBoxModel(new String[] {"ALUMNOS", "AREAS", "PROYECTOS"}));
		cmbModificar.setBounds(285, 112, 100, 25);
		contentPane.add(cmbModificar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				dispose();
			}
		});
		btnSalir.setBounds(157, 215, 97, 25);
		contentPane.add(btnSalir);
		
	}
}
