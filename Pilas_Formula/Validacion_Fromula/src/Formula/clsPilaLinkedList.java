package Formula;

public class clsPilaLinkedList {
	private clsNode pila;
	
	clsPilaLinkedList(){
		limpiaPila();
	}
	
	boolean pilaVacia(){
		return (this.pila == null);
	}
	
	void limpiaPila(){
		this.pila=null;
	}
	
	// inserta elemento a la derecha
	void meter(Object objElemento){
		this.pila=new clsNode(objElemento, this.pila);
		// la cabeza es el elemento ingresado
	}	
	
	// elimina elemento ubicado m�s a la iaq
	Object sacar(){
		Object objElemento = null;
		if (!pilaVacia()){
			objElemento=this.pila.getNodeInfo();
			this.pila=this.pila.getNextNode();			
		}else{
			System.out.println("Error sacar. Pila vacia");			
		}
		return objElemento;
	}	
	
	
	void muestra(){
		clsNode temp;		
		if (!pilaVacia()){
			temp=this.pila;
			while (temp!=null){
				System.out.println("Elemento " + temp.getNodeInfo().toString());
				temp=temp.getNextNode();
			}			
		}else{
			System.out.println("Error muestra. Pila vacia");
		}		
	}

}
