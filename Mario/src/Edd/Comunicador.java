package Edd;

public class Comunicador {
	 static ListaPersonaje lista =new ListaPersonaje();

	public static ListaPersonaje getLista() {
		return lista;
	}

	public static void setLista(Personaje p) {
		lista.agregar(p);
	}
	 
	 
}
