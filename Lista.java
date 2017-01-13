package ListasEncadenadas;

public class Lista {
	
	protected Nodo nodoInicial; //nodo inicial de la lista (cabeza)
	protected long tamaño; 	// número de nodos en la lista 
	
	public void Lista(){ //Constructor por defecto, crea lista vacía 
		nodoInicial = null; 
		tamaño = 0; 
	}
	
	public long getTamaño(){
		
		return tamaño;
	}
	
	public boolean estaVacía(){
		
		return nodoInicial==null;
	}
	
	public void agregarInicio(Nodo nodoNuevo){ 
		
		if(estaVacía()){
			
			nodoInicial=nodoNuevo;
		}else{
			
			nodoNuevo.setSiguiente(nodoInicial);
			nodoInicial=nodoNuevo;
			
		}
				
		tamaño++; // El tamaño de la lista aumenta en 1 

	}
	
	public void eliminarInicio(Nodo t){
		if (nodoInicial == null){
			System.out.println("La lista está vacía"); 
			t = nodoInicial; 
			nodoInicial = nodoInicial.getSiguiente(); // nodo inicial apunta al siguiente 
			t.setSiguiente(null); // el siguiente nodo a t se vuelve null 
			tamaño = tamaño-1; //el numero de nodos disminuye en 1
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
		
		if(!estaVacía()){
			
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
		tamaño=0;
		
	}
}
	

