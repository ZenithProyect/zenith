package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
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
	private JScrollPane spContenedor;

	public VentanaMenu() {
		super("Z E N I T H");
		inicializar();
		generarMenu();
	}
	
	private void inicializar() {
		try {
			UIManager.setLookAndFeel(
					UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
		PanelIcono img2 = new PanelIcono();
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		spContenedor = new JScrollPane();
		contentPane.add(spContenedor, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 520, 370);
		img2 = new PanelIcono();
		spContenedor.setViewportView(img2);

	}
	
	public void visualizarPanel(JPanel panel) {
		spContenedor.setViewportView(panel);
	}
	
	private void generarMenu() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnProfesor = new JMenu("Profesor");
		menuBar.add(mnProfesor);
		
		LoginVentana lv2 = new LoginVentana();
		JMenuItem mntmLogin = new JMenuItem("Login");
		mnProfesor.add(mntmLogin);
		mntmLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				spContenedor.setViewportView(lv2);
			}});
		
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
