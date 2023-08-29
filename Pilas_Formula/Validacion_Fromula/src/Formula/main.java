package Formula;

public class main {

	public static void main(String[] args) {
		clsFormula form1 = new clsFormula("(2+ [3-12]*{8/3})");
		clsFormula form2 = new clsFormula("}(2+[3-12]*{8/3})");
		clsFormula form3 = new clsFormula("{[2+4}]");
		
		if (form1.verificar()) {System.out.println ( "Sintaxis correcta"); }
		else { System.out.println ("Error  de Sintaxis "); }
		
		if (form2.verificar()) {System.out.println ( "Sintaxis correcta"); }
		else { System.out.println ("Error  de Sintaxis "); }
		
		if (form3.verificar()) {System.out.println ( "Sintaxis correcta"); }
		else { System.out.println ("Error  de Sintaxis "); }

	}

}
