package Edd.azulejo;
import java.awt.Graphics;

import Edd.Control;
import Edd.Id;
import Edd.MarioBros;
import Edd.azulejo.Azulejo;
public class Suelo extends Azulejo {

	public Suelo(int x, int y, int ancho, int altura, boolean solid, Id id, Control control) {
		super(x, y, ancho, altura, solid, id, control);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(MarioBros.hierba.getBufferedImage(),x,y,ancho,altura,null);
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

}
