package controlador;

import javax.swing.JOptionPane;

import vista.ConfirmacionCreacionAlumno;
import vista.CrearAlumnoVentana;

public class NuevoAlumno {
	public NuevoAlumno() {
		
	}
	public void guardardDatosAlumnos() {
		String codNumAl="";
		String numExpAl="";
		String nombreAl="";
		String apellidoAl="";
		String frase="";
		
		codNumAl = CrearAlumnoVentana.CampoCodNum.getText();
		numExpAl = CrearAlumnoVentana.CampoNumExp.getText();
		nombreAl = CrearAlumnoVentana.CampoNombre.getText();
		apellidoAl = CrearAlumnoVentana.CampoApellido.getText();
		
		ConfirmacionCreacionAlumno cr1 = new ConfirmacionCreacionAlumno();
		frase="El Alumno "+nombreAl+" "+apellidoAl+" con numero expediente "+numExpAl+" y Codigo "+codNumAl;
		cr1.getTxtConfirmacion().setText(frase);
		cr1.setVisible(true);

		
		
	}
}
