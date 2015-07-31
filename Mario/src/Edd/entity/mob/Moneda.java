package Edd.entity.mob;

import java.awt.Graphics;

import Edd.Control;
import Edd.Id;
import Edd.MarioBros;
import Edd.azulejo.Azulejo;
import Edd.entity.Entity;

public class Moneda extends Entity{

	public Moneda(int x, int y, int ancho, int altura, boolean solid, Id id, Control control) {
		super(x, y, ancho, altura, solid, id, control);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(MarioBros.moneda.getBufferedImage(),x,y,ancho,altura,null);
		
	}

	@Override
	public void tick() {
		x+=velx;
		y+=vely;
		for(int i =0;i<control.azulejo.size();i++){
			Azulejo t = control.azulejo.get(i);
			if(t.isSolid()){
				if(getLimiteAbajo().intersects(t.getLimites())){
					setVely(0);
					if(felling)felling=false;
					
				}else if (!felling){
					felling=true;
					gravedad=0.8;
					
				}
				if(getLimiteIzquierda().intersects(t.getLimites())){
					setVelx(0);
					
				}
				if(getLimiteDerecha().intersects(t.getLimites())){
					setVelx(0);
				}
			}
		}
		
		if(felling){
			gravedad+=0.0;
			setVely((int)gravedad);
		}
		
	}
	
}
