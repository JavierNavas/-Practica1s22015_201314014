package Edd;

import Edd.entity.Entity;

public class Camara {
 public int x,y;

public void tick(Entity jugador){
	setX(-jugador.getX()+ MarioBros.ANCHO/2);
	setY(-jugador.getY()+ MarioBros.ALTURA/2);
	
}
public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}
 
}
