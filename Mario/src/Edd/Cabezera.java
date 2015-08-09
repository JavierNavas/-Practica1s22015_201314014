package Edd;

public class Cabezera {
	int x;
   Cabezera siguiente;
   Cabezera anterior;
   ListVertical columna;
   
   Cabezera(int x){
	   this.x=x;
	   this.siguiente=null;
	   this.anterior=null;
	   this.columna=new ListVertical();
   }

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public Cabezera getSiguiente() {
	return siguiente;
}

public void setSiguiente(Cabezera siguiente) {
	this.siguiente = siguiente;
}

public Cabezera getAnterior() {
	return anterior;
}

public void setAnterior(Cabezera anterior) {
	this.anterior = anterior;
}

public ListVertical getColumna() {
	return columna;
}

public void setColumna(ListVertical columna) {
	this.columna = columna;
}
   
   
}
