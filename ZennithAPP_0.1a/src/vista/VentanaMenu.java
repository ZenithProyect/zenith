package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;

public class VentanaMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMenu frame = new VentanaMenu();
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
	public VentanaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnProfesor = new JMenu("Profesor");
		menuBar.add(mnProfesor);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mnProfesor.add(mntmLogin);
		
		JMenuItem mntmRegister = new JMenuItem("Register");
		mnProfesor.add(mntmRegister);
		
		JMenuItem mntmVisualizar = new JMenuItem("Visualizar");
		mnProfesor.add(mntmVisualizar);
		
		JMenu mnAlumno = new JMenu("Alumno");
		menuBar.add(mnAlumno);
		
		JMenuItem mntmVisualizar_1 = new JMenuItem("Visualizar");
		mnAlumno.add(mntmVisualizar_1);
		
		JMenu mnNosotros = new JMenu("Nosotros");
		menuBar.add(mnNosotros);
		
		JMenuItem mntmInfo = new JMenuItem("Info");
		mnNosotros.add(mntmInfo);
		contentPane = new JPanel();			
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
