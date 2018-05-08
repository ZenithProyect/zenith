package controlador;
import vista.LoginVentana;
import javax.swing.JOptionPane;

import vista.LoginVentana;

public class DatosUsuario {
	public DatosUsuario() {
		
	}
	String profesor="";
	String pswprofesor="";
	
	
	public int probarpass() {
		LoginVentana lv = new LoginVentana();
		
		profesor = lv.getTxtusuario().getText();
		System.out.println(profesor);
		pswprofesor = lv.getPsspassword().getText();

			if (profesor.equals("profesor")&&pswprofesor.equals("hola")) {
			return 1;
			}else{
			return 0;
				
				
				
			}
	}}
		
