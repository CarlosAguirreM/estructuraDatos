package ListasEncadenadas;

import javax.swing.JOptionPane;

public class Aplicación {
	
/*	public void main(String args[]){
		
		Lista listaNodos = new Lista();
		String opc;
		Nodo nodo;
		
		do{
			opc=JOptionPane.showInputDialog("¿Desea Ingresar un nuevo nodo? S/N");
			if(opc.equalsIgnoreCase("S")){
				listaNodos.agregarInicio(nuevoNodo());
			}
			
		}while(!opc.equalsIgnoreCase("N"));
		
		
		
	}
	
	public static Nodo nuevoNodo(){
		
		Nodo N = new Nodo(JOptionPane.showInputDialog("Ingrese el contenido para el nodo"), null);
		
		return N;
	}*/
	
	 public static void main(String[] args) throws Exception {
	        Lista lista = new Lista();
	        
	        System.out.println("<<-- Ejemplo de lista simple -->>\n");
	        
	        lista.agregarInicio(new Nodo("30", null));
	        lista.agregarInicio(new Nodo ("9", null));
	        
	        System.out.println("<<-- Lista -->>");
	        lista.imprimirLista();
	        
	        System.out.println("\n\n<<-- Tamaño -->");
	        System.out.println(lista.getTamaño());
	        
	             
	        	        
	        System.out.println("\nConsulta si existe el valor 30");
	        System.out.println(lista.buscarNodo("30"));
	        
	        System.out.println("\nConsulta la posicion del valor 9");
	        System.out.println(lista.getPosicion("9"));
	        
	        System.out.println("\nElimina la lista");
	        lista.eliminarLista();
	        
	        System.out.println("\nConsulta si la lista está vacia");
	        System.out.println(lista.estaVacía());
	
	    }   
	}
	


