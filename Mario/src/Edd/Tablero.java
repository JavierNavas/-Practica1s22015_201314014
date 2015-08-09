package Edd;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Tablero extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Tablero(){
		Dimension d = new Dimension();
		 setLocation((int) ((d.getWidth()/2)+160), 20);
		 this.setTitle("Mario Maker Creacion de mapa");
		 this.setSize(1000,1000);
		 setDefaultCloseOperation(0);//finaliza el programa cuando se da click en la X
	     setResizable(false);//quita la opcion de cambiar tamanño
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
