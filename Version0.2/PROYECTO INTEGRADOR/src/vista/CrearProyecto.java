package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
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

public class CrearProyecto extends JPanel {

	public static JTextField textIDPry;
	public static JTextField textNomPry;
	public static JTextField txtGrupoPry;
	public static JTextField txtAnioPry;
	public static JTextField txtUrlPry;
	public static JTextField txtNotaPry;

	public CrearProyecto() {
		super();
		inicializar();
		
		
}
	private void inicializar() {
		setPreferredSize(new Dimension(480, 280));
		setLayout(null);
		JLabel lblIDPry = new JLabel("ID");
		lblIDPry.setBounds(12, 13, 56, 16);
		add(lblIDPry);
		
		JLabel lblNombrePry = new JLabel("Nombre");
		lblNombrePry.setBounds(12, 42, 56, 16);
		add(lblNombrePry);
		
		JLabel lblGrupoPry = new JLabel("Grupo");
		lblGrupoPry.setBounds(12, 71, 56, 16);
		add(lblGrupoPry);
		
		JLabel lblAreaPry = new JLabel("Area");
		lblAreaPry.setBounds(12, 100, 56, 16);
		add(lblAreaPry);
		
		JLabel lblCursoPry = new JLabel("Curso");
		lblCursoPry.setBounds(12, 129, 56, 16);
		add(lblCursoPry);
		
		JLabel lblAnioPry = new JLabel("A\u00F1o");
		lblAnioPry.setBounds(12, 158, 56, 16);
		add(lblAnioPry);
		
		JLabel lblNotaPry = new JLabel("Nota");
		lblNotaPry.setBounds(12, 187, 56, 16);
		add(lblNotaPry);
		
		JLabel lblUrlPry = new JLabel("URL");
		lblUrlPry.setBounds(12, 216, 56, 16);
		add(lblUrlPry);
		
		textIDPry = new JTextField();
		textIDPry.setBounds(80, 10, 116, 22);
		add(textIDPry);
		textIDPry.setColumns(10);
		
		textNomPry = new JTextField();
		textNomPry.setColumns(10);
		textNomPry.setBounds(80, 39, 116, 22);
		add(textNomPry);
		
		txtGrupoPry = new JTextField();
		txtGrupoPry.setColumns(10);
		txtGrupoPry.setBounds(80, 68, 116, 22);
		add(txtGrupoPry);
		
		JSpinner spnCursoPry = new JSpinner();
		spnCursoPry.setModel(new SpinnerNumberModel(1, 1, 2, 1));
		spnCursoPry.setBounds(80, 126, 38, 19);
		add(spnCursoPry);
		
		JComboBox cmbAreaPry = new JComboBox();
		cmbAreaPry.setModel(new DefaultComboBoxModel(new String[] {"ASIR", "DAW", "DAM"}));
		cmbAreaPry.setBounds(80, 97, 116, 22);
		add(cmbAreaPry);
		
		txtAnioPry = new JTextField();
		txtAnioPry.setColumns(10);
		txtAnioPry.setBounds(80, 155, 116, 22);
		add(txtAnioPry);
		
		txtUrlPry = new JTextField();
		txtUrlPry.setColumns(10);
		txtUrlPry.setBounds(80, 213, 116, 22);
		add(txtUrlPry);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(22, 245, 97, 25);
		add(btnGuardar);
		
		JButton btnSalir = new JButton("Atrás");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnSalir.setBounds(239, 245, 97, 25);
		add(btnSalir);
		
		txtNotaPry = new JTextField();
		txtNotaPry.setColumns(10);
		txtNotaPry.setBounds(80, 184, 116, 22);
		add(txtNotaPry);
	}
	}

