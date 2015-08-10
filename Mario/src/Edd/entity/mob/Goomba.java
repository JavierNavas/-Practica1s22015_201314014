package Edd.entity.mob;

import java.awt.Graphics;
import java.util.Random;

import Edd.Control;
import Edd.Id;
import Edd.MarioBros;
import Edd.azulejo.Azulejo;
import Edd.entity.Entity;
public class Goomba extends Entity {
	private Random aleatorio = new Random();

	public Goomba(int x, int y, int ancho, int altura, Id id, Control control) {
		super(x, y, ancho, altura, id, control);
		// TODO Auto-generated constructor stub
		int dir = aleatorio.nextInt(2);
				switch(dir){
				case 0:
				setVelx(-1);
				case 1:
					setVelx(1);
				}
	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(MarioBros.goomba.getBufferedImage(),x,y,ancho,altura,null);
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
					setVelx(1);
					
				}
				if(getLimiteDerecha().intersects(t.getLimites())){
					setVelx(-1);
				}
			}
		}
		
		if(felling){
			gravedad+=0.1;
			setVely((int)gravedad);
		}
		
	}

}
