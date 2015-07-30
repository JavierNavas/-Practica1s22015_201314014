package Edd.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Edd.Id;
import Edd.MarioBros;
import Edd.entity.Entity;

public class KeyInput implements KeyListener{

	public void keyPressed(KeyEvent e) {
		int key =e.getKeyCode();
		for(Entity en:MarioBros.control.entity)
		{
		  if(en.getId()==Id.Jugador){
			switch(key){
			case KeyEvent.VK_W:
				en.setVely(-5);
				if(!en.saltando) {
					en.saltando= true;
					en.gravedad=5.0;
				}
				break;
			case KeyEvent.VK_A:
				en.setVelx(-5);
				en.caras=1 ;
				break;
			case KeyEvent.VK_D:
				en.setVelx(5);
				en.caras=0 ;
				break;
			}
		  }	
		}
	}

	public void keyReleased(KeyEvent e) {
		int key =e.getKeyCode();
		for(Entity en:MarioBros.control.entity)
		{
			if(en.getId()==Id.Jugador){
				switch(key){
				case KeyEvent.VK_W:
					en.setVely(0);
					break;
				case KeyEvent.VK_A:
					en.setVelx(0);
					break;
				case KeyEvent.VK_D:
					en.setVelx(0);
					break;
				case KeyEvent.VK_S:
					en.setVely(0);
					break;
					
				}
			}
			
		}
	}

	public void keyTyped(KeyEvent e) {
		
		
	}

}
