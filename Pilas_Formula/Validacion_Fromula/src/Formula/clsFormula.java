package Formula;

public class clsFormula {
	private String formula;
	private clsPilaLinkedList pila;

/**
 * @author xion20
 * Constructor de clase */

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
		return flag;
	}
	
	boolean esInc (char dig) {
		boolean flag = false;
		if (dig == '(' || dig == '{' || dig == '[') { flag = true; }
		return flag;
	}
	
	boolean esFin (char dig) {
		boolean flag = false;
		if (dig == ')' || dig == '}' || dig == ']') { flag = true; }
		return flag;
	}
	
	
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
