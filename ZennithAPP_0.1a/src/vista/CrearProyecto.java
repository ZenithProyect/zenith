package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearProyecto extends JFrame {

	private JPanel contentPane;
	private JTextField textIDPry;
	private JTextField textNomPry;
	private JTextField txtGrupoPry;
	private JTextField txtAnioPry;
	private JTextField txtUrlPry;
	private JTextField txtNotaPry;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearProyecto frame = new CrearProyecto();
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
	public CrearProyecto() {
		super("Nuevo Proyecto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIDPry = new JLabel("ID");
		lblIDPry.setBounds(12, 13, 56, 16);
		contentPane.add(lblIDPry);
		
		JLabel lblNombrePry = new JLabel("Nombre");
		lblNombrePry.setBounds(12, 42, 56, 16);
		contentPane.add(lblNombrePry);
		
		JLabel lblGrupoPry = new JLabel("Grupo");
		lblGrupoPry.setBounds(12, 71, 56, 16);
		contentPane.add(lblGrupoPry);
		
		JLabel lblAreaPry = new JLabel("Area");
		lblAreaPry.setBounds(12, 100, 56, 16);
		contentPane.add(lblAreaPry);
		
		JLabel lblCursoPry = new JLabel("Curso");
		lblCursoPry.setBounds(12, 129, 56, 16);
		contentPane.add(lblCursoPry);
		
		JLabel lblAnioPry = new JLabel("A\u00F1o");
		lblAnioPry.setBounds(12, 158, 56, 16);
		contentPane.add(lblAnioPry);
		
		JLabel lblNotaPry = new JLabel("Nota");
		lblNotaPry.setBounds(12, 187, 56, 16);
		contentPane.add(lblNotaPry);
		
		JLabel lblUrlPry = new JLabel("URL");
		lblUrlPry.setBounds(12, 216, 56, 16);
		contentPane.add(lblUrlPry);
		
		textIDPry = new JTextField();
		textIDPry.setBounds(80, 10, 116, 22);
		contentPane.add(textIDPry);
		textIDPry.setColumns(10);
		
		textNomPry = new JTextField();
		textNomPry.setColumns(10);
		textNomPry.setBounds(80, 39, 116, 22);
		contentPane.add(textNomPry);
		
		txtGrupoPry = new JTextField();
		txtGrupoPry.setColumns(10);
		txtGrupoPry.setBounds(80, 68, 116, 22);
		contentPane.add(txtGrupoPry);
		
		JSpinner spnCursoPry = new JSpinner();
		spnCursoPry.setModel(new SpinnerNumberModel(1, 1, 2, 1));
		spnCursoPry.setBounds(80, 126, 38, 19);
		contentPane.add(spnCursoPry);
		
		JComboBox cmbAreaPry = new JComboBox();
		cmbAreaPry.setModel(new DefaultComboBoxModel(new String[] {"ASIR", "DAW", "DAM"}));
		cmbAreaPry.setBounds(80, 97, 116, 22);
		contentPane.add(cmbAreaPry);
		
		txtAnioPry = new JTextField();
		txtAnioPry.setColumns(10);
		txtAnioPry.setBounds(80, 155, 116, 22);
		contentPane.add(txtAnioPry);
		
		txtUrlPry = new JTextField();
		txtUrlPry.setColumns(10);
		txtUrlPry.setBounds(80, 213, 116, 22);
		contentPane.add(txtUrlPry);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(208, 212, 97, 25);
		contentPane.add(btnGuardar);
		
		JButton btnSalir = new JButton("Atrás");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final OpcionVentana opv = new OpcionVentana();
				opv.setVisible(true);
				dispose();
			}
		});
		btnSalir.setBounds(328, 212, 97, 25);
		contentPane.add(btnSalir);
		
		txtNotaPry = new JTextField();
		txtNotaPry.setColumns(10);
		txtNotaPry.setBounds(80, 184, 116, 22);
		contentPane.add(txtNotaPry);
	}
}
