package Formula;

public class clsFormula {
	private String formula;
  
	private clsPilaLinkedList pila;

/**
 * @author xion20
 * Constructor de clase */


	private clsPilaLinkedList pila;
	
/*
 * Constructor
 *@author xion20 */
 

	clsFormula (String formula) {
		this.formula = formula;
		this.pila = new clsPilaLinkedList();	
	}

/**
 * @author xion20
 * Método general de verificación
 * true : sintaxis bien escrita
 * false : existe un error de sintaxis */
	
	boolean verificar () {
		char digito, temp;
		boolean flag = false;
		for (int i = 0; i < this.formula.length(); i++) {
			digito = formula.charAt(i);
			if (esInc(digito)) { this.pila.meter (digito); }
			if (esFin(digito)) {
				if (!this.pila.pilaVacia()) {
					temp = (char) this.pila.sacar();
					if (pertenece (temp, digito)) { flag = true; }	
				}else { return false; }	
			}	
		}
		if (!this.pila.pilaVacia()) { flag = false ; }
		return flag;
	}

/**
 * @author xion20
 * Método que verifica si es un símbolo de apertura 
 * true : símbolo de apertura
 * false : cualquier otro caso */
	
	boolean esInc (char dig) {
		boolean flag = false;
		if (dig == '(' || dig == '{' || dig == '[') { flag = true; }
		return flag;
	}

/**
 * @author xion20
 * Método que verifica si es un símbolo de cierre 
 * true : símbolo de cierre
 * false : cualquier otro caso */
	
	boolean esFin (char dig) {
		boolean flag = false;
		if (dig == ')' || dig == '}' || dig == ']') { flag = true; }
		return flag;
	}
	
/**
 * @author xion20
 * Método que verifica que dado un símbolo de inicio y cierre coinciden
 * true : símbolos coinciden ej: ()
 * false : símbolos no coinciden ej : [}*/
	
	boolean pertenece (char inicio, char fin) {
	    boolean flag = false;
	    switch (fin) {
	        case ')':
	            if (inicio == '(') { flag = true; }  
	            break;
	        case '}':
	            if (inicio == '{') { flag = true; }	          
	            break;
	        case ']':
	            if (inicio == '[') { flag = true; }
	            break;
	    }
	    return flag;    
	}

}
