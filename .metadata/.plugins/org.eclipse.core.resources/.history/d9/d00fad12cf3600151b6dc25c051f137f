package Edd.entity;

import java.awt.Graphics;
import java.awt.Rectangle;

import Edd.Control;
import Edd.Id;

public abstract class Entity {
  public int x,y;
  public int ancho,altura;
  public int velx,vely;
  
  public int caras=0; 
  public boolean solid;
  public boolean saltando=false;
  public boolean felling=false;
  public Control control;
  
  public Id id;
  public double gravedad=0.0;
  public Entity(int x ,int y, int ancho, int altura,boolean solid,Id id,Control control){
	  this.x= x;
	  this.y=y;
	  this.ancho=ancho;
	  this.altura=altura;
	  this.solid=solid;
	  this.id=id;
	  this.control=control;
  }
  
  public abstract void render(Graphics g);
	  
  
  public abstract void tick();

  
  public void die(){
	  control.EliminarEntity(this);
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

public int getAncho() {
	return ancho;
}

public void setAncho(int ancho) {
	this.ancho = ancho;
}

public int getAltura() {
	return altura;
}

public void setAltura(int altura) {
	this.altura = altura;
}

public boolean isSolid() {
	return solid;
}

public void setSolid(boolean solid) {
	this.solid = solid;
}

public int getVelx() {
	return velx;
}

public void setVelx(int velx) {
	this.velx = velx;
}

public int getVely() {
	return vely;
}

public void setVely(int vely) {
	this.vely = vely;
}

public Id getId() {
	return id;
}

public void setId(Id id) {
	this.id = id;
}
  
public Rectangle getLimites(){
	return new Rectangle(getX(),getY(),ancho,altura);
}
 public Rectangle getLimiteArriba(){
	 return new Rectangle(getX()+10,getY()+10,ancho-20,5);
 }
 public Rectangle getLimiteAbajo(){
	 return new Rectangle(getX()+10,getY()+altura-5,ancho-20,5);
 }
 public Rectangle getLimiteIzquierda(){
	 return new Rectangle(getX(),getY()+10,5,altura-20);
 }
 public Rectangle getLimiteDerecha(){
	 return new Rectangle(getX()+ancho-5,getY()+10,5,altura-20);
 }
}


