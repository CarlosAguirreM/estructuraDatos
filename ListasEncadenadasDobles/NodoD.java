package ListasEncadenadasDobles;

public class NodoD {
	
	private String elemento;
	private NodoD siguiente;
	private NodoD anterior;
	
	public void NodoD(String elemento, NodoD nodoSig, NodoD nodoAnt){
		
		this.elemento=elemento;
		this.siguiente=nodoSig;
		this.anterior=nodoAnt;
		
	}
	
	

}
