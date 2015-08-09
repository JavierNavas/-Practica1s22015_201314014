package Edd;

public class Lateral {
	int y;
	   Lateral siguiente;
	   Lateral anterior;
	   ListHorizontal fila;
	   
	   Lateral(int y){
		   this.y=y;
		   this.siguiente=null;
		   this.anterior=null;
		   this.fila=new ListHorizontal();
	   }

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Lateral getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Lateral siguiente) {
		this.siguiente = siguiente;
	}

	public Lateral getAnterior() {
		return anterior;
	}

	public void setAnterior(Lateral anterior) {
		this.anterior = anterior;
	}

	public ListHorizontal getFila() {
		return fila;
	}

	public void setFila(ListHorizontal fila) {
		this.fila = fila;
	}
  
	   
	 
}
