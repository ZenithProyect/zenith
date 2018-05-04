package controlador;

import javax.swing.JOptionPane;

import vista.LoginVentana;

public class DatosUsuario {
	public DatosUsuario() {
		
	}
	String profesor="";
	String pswprofesor="";
	
	
	public int probarpass() {
		LoginVentana lv = new LoginVentana();
		
		/*profesor=(String)lv.getTxtusuario();
		pswprofesor=LoginVentana.psspassword.getText();*/

			if (profesor.equals("profesor")&&pswprofesor.equals("hola")) {
			return 1;
			}else{
			return 0;
				
				
				
			}
	}}
		
