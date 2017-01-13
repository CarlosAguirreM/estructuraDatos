package ListasEncadenadas;

public class Lista {
	
	protected Nodo nodoInicial; //nodo inicial de la lista (cabeza)
	protected long tama�o; 	// n�mero de nodos en la lista 
	
	public void Lista(){ //Constructor por defecto, crea lista vac�a 
		nodoInicial = null; 
		tama�o = 0; 
	}
	
	public long getTama�o(){
		
		return tama�o;
	}
	
	public boolean estaVac�a(){
		
		return nodoInicial==null;
	}
	
	public void agregarInicio(Nodo nodoNuevo){ 
		
		if(estaVac�a()){
			
			nodoInicial=nodoNuevo;
		}else{
			
			nodoNuevo.setSiguiente(nodoInicial);
			nodoInicial=nodoNuevo;
			
		}
				
		tama�o++; // El tama�o de la lista aumenta en 1 

	}
	
	public void eliminarInicio(Nodo t){
		if (nodoInicial == null){
			System.out.println("La lista est� vac�a"); 
			t = nodoInicial; 
			nodoInicial = nodoInicial.getSiguiente(); // nodo inicial apunta al siguiente 
			t.setSiguiente(null); // el siguiente nodo a t se vuelve null 
			tama�o = tama�o-1; //el numero de nodos disminuye en 1
		}
	
	}
	
	public void imprimirLista(Lista lista){
		
		
		
	}
	
	public boolean buscarNodo(String dato){
		
		Nodo nodoAux=nodoInicial; //crea copia de la lista existente
		boolean encontrado=false;
		
		while(nodoAux!=null && encontrado !=true ){  // mientras no se haya encontrado y no se haya acabado la lista
			
			if(dato.equals(nodoAux.getElemento())){ // si el dato existe, devolver verdadero
				
				encontrado=true;
				
			}else{
				
				nodoAux=nodoAux.getSiguiente();
			}
		}
		
		return encontrado;
	}

	public int getPosicion(String dato) throws Exception{
		
		if(buscarNodo(dato)){
			
			Nodo nodoAux= nodoInicial;
			int contador=0;
			
			while(dato!=nodoAux.getElemento()){
				
				contador ++;
			nodoAux=nodoAux.getSiguiente();
				
			}	
			
			return contador;
			
		}else{
			
			throw new Exception("El dato no existe en la lista");
			
		}
	}
	
	public void imprimirLista(){
		
		if(!estaVac�a()){
			
			Nodo nodoAux= nodoInicial;
			int i=0;
			
			while(nodoAux!= null){
				
				System.out.print(i + ". [ "+ nodoAux.getElemento()+" ] -> ");
				nodoAux=nodoAux.getSiguiente();
				
				i++;
			}
			
		}
		
	}

	public void eliminarLista(){
		
		nodoInicial=null;
		tama�o=0;
		
	}
}
	

