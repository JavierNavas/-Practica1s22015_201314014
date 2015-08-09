package Edd;

public class ListVertical {
NodoMatriz primero;
NodoMatriz ultimo;



//clase que crea  una columna de la matriz
public ListVertical() {
	this.primero = null;
	this.ultimo = null;
}

public void insertar(NodoMatriz insertar){
	if(vacio()){
			primero=insertar;
			ultimo=insertar;
		}else{
			if(insertar.getY()<primero.getY()){
				insertarFrente(insertar);
			}
			else if(insertar.getY()>ultimo.getY()){
				InsertarFinal(insertar);
			}else{
				InsertarMedio(insertar);
			}
		}
	}

public boolean vacio(){
	if(primero==null ){
		return true;
	}
	else{
	return false;
	}
}

public void insertarFrente(NodoMatriz insertar){
	primero.setArriba(insertar);
	insertar.setAbajo(primero);
	primero=insertar;//el nodo agregado se vuelve el primero de la lista
}

public void InsertarFinal(NodoMatriz insertar){
	ultimo.setAbajo(insertar);
	insertar.setArriba(ultimo);
	ultimo=insertar;// el nodo ingresado se vuelve el el tultimo de la lista
}

public void InsertarMedio(NodoMatriz insertar){
	NodoMatriz aux1;
	NodoMatriz aux2;
	aux1=primero;
	while(aux1.getY()<insertar.getY()){
		aux1=aux1.getAbajo();
	}
	aux2=aux1.getArriba();
	aux2.setAbajo(insertar);
	aux1.setArriba(insertar);
	insertar.setAbajo(aux1);
	insertar.setArriba(aux2);
	
			
}

public void recorrer(){
	if(!vacio()){
	NodoMatriz aux1=primero;
	while(aux1!=null){
	aux1=aux1.getAbajo();	
	}
   }
}
}
