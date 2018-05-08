package controlador;

import javax.swing.JFrame;

//import vista.LoginVentana;
import vista.OpcionVentana;
import vista.VentanaMenu;

public class Main extends JFrame{	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*LoginVentana principal = new LoginVentana();
		principal.hacerVisible();*/
		
		//OpcionVentana ov = new OpcionVentana();
		//ov.setVisible(true);
		
		VentanaMenu vmenu = new VentanaMenu();
		vmenu.setVisible(true);

	}
	
	

}
