package Edd;

public class ListaLateral {
Lateral primero;
Lateral ultimo;

ListaLateral() {
	this.primero = null;
	this.ultimo = null;
}

public void insertar(Lateral insertar){
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

public void insertarFrente(Lateral insertar){
	primero.setAnterior(insertar);
	insertar.setSiguiente(primero);
	primero=insertar;//el nodo agregado se vuelve el primero de la lista
}

public void InsertarFinal(Lateral insertar){
	ultimo.setSiguiente(insertar);
	insertar.setAnterior(ultimo);
	ultimo=insertar;// el nodo ingresado se vuelve el el tultimo de la lista
}

public void InsertarMedio(Lateral insertar){
	Lateral aux1; 
	Lateral aux2;
	aux1=primero;
	while(aux1.getY()<insertar.getY()){
		aux1=aux1.getSiguiente();
	}
	aux2=aux1.getAnterior();
	aux2.setSiguiente(insertar);  
	aux1.setAnterior(insertar);
	insertar.setSiguiente(aux1);
	insertar.setAnterior(aux2);                                                       
	
			
}

public void recorrer(){
	if(!vacio()){
	Lateral aux1=primero;
	while(aux1!=null){
	aux1=aux1.getSiguiente();	
	}
   }
}


public Lateral buscar(int y){
	if(existe(y)){
		Lateral aux;
		aux=primero;
		while(aux.getY()!=y){
			aux=aux.siguiente;
		}
		return aux;
	}else{
		return(new Lateral(-1)); 
	}
	
}

public boolean existe(int y){
	if(vacio()){
		return false;
	}
	else{
		Lateral aux;
		aux=primero;
		while(aux!=null){
			if(aux.getY()==y){
				System.out.println("si lo encontre");
				return true;
				
			}
			else if(aux.siguiente==null){
				System.out.println("no lo encontre");
				return false;
			}
			aux=aux.siguiente;
		}
	}
	return false;
 }


}
