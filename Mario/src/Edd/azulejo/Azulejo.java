package Edd.azulejo;

import java.awt.Graphics;
import java.awt.Rectangle;

import Edd.Control;
import Edd.Id;

public abstract class Azulejo {
	 public int x,y;
	  public int ancho,altura;
	  public int velx,vely;
	  public boolean solid;
	  
	  Id id;
	  Control control;
	  
	  public Azulejo(int x ,int y, int ancho, int altura,boolean solid ,Id id,Control control){
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
    	 control.EliminarAzulejo(this);
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
	
	public Rectangle getLimites(){
		return new Rectangle(getX(),getY(),ancho,altura);
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	
	  
}
