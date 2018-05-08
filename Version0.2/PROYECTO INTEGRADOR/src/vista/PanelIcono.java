package vista;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
public class PanelIcono extends JPanel
{
	public PanelIcono()
	{
		super();
		inicializar();
		
	}
 
 private void inicializar() {
	 setPreferredSize(new Dimension(435, 270));
	setLayout(null);
	ImageIcon imagen = new ImageIcon("C:\\Users\\Dani\\Desktop\\CFGS DAM\\PROGRAMACION\\PROYECTO INTEGRADOR\\src\\Imagenes\\zenithIcon.jpeg");
	
	
	JLabel etiqueta = new JLabel(imagen);
	etiqueta.setBounds(104, 13, 289, 258);
	add(etiqueta);

 }
	}
	
 
