package vista;
import vista.PanelIcono;
import java.awt.BorderLayout;
import controlador.NuevoAlumno;
import controlador.DatosUsuario;

import java.awt.EventQueue;
import java.awt.HeadlessException;

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
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JScrollPane;

public class OpcionVentana extends JFrame {

	private JPanel contentPane;
	private JScrollPane spContenedor;
	

	public OpcionVentana () {
		super("Z E N I T H");
		inicializar();
		mostrarMenu();
	}
		
	private void inicializar() {
		try {
			UIManager.setLookAndFeel(
					UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
		PanelIcono img = new PanelIcono();
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		spContenedor = new JScrollPane();
		contentPane.add(spContenedor, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 520, 370);
		img = new PanelIcono();
		spContenedor.setViewportView(img);
	}
	
	public void visualizarPanel(JPanel panel) {
		spContenedor.setViewportView(panel);
	}
		
		private void mostrarMenu() {
			JMenuBar menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			
			JMenu mnVisualizar = new JMenu("Visualizar");
			menuBar.add(mnVisualizar);
			
			JMenuItem mntmArea = new JMenuItem("Area");
			mnVisualizar.add(mntmArea);
			mntmArea.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//TODO Visualizar Area
				}});
			
			JMenuItem mntmAlumno = new JMenuItem("Alumno");
			mnVisualizar.add(mntmAlumno);
			mntmAlumno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg1) {
					//TODO Visualizar Alumno
				}});
			
			JMenuItem mntmProyecto = new JMenuItem("Proyecto");
			mnVisualizar.add(mntmProyecto);
			mntmProyecto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg8) {
					//TODO Visualizar Proyecto
				}});
			
			JMenu mnModificar = new JMenu("Modificar");
			menuBar.add(mnModificar);
			
			JMenuItem mntmAlumno_1 = new JMenuItem("Alumno");
			mnModificar.add(mntmAlumno_1);
			mntmAlumno_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg2) {
					//TODO Modificar Alumno
				}});
			
			JMenuItem mntmProyecto_1 = new JMenuItem("Proyecto");
			mnModificar.add(mntmProyecto_1);
			mntmProyecto_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg3) {
					//TODO Modifivar Alumno
				}});
			
			JMenu mnCrear = new JMenu("Crear");
			menuBar.add(mnCrear);
			
			CrearAlumnoVentana al = new CrearAlumnoVentana();
			JMenuItem mntmAlumno_2 = new JMenuItem("Alumno");
			mnCrear.add(mntmAlumno_2);
			mntmAlumno_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg4) {
					
					spContenedor.setViewportView(al);
				}});
			
			CrearProyecto pry = new CrearProyecto();
			JMenuItem mntmProyecto_2 = new JMenuItem("Proyecto");
			mnCrear.add(mntmProyecto_2);
			mntmProyecto_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg4) {
					
					spContenedor.setViewportView(pry);
				}});
			}
}
