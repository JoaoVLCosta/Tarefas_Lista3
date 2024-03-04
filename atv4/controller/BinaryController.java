package atv4.controller;

public class BinaryController {

	public BinaryController() {
		
		super();
		
	}
	
	public String fnBinary(int valor) {
		//O ponto de parada se da quando o valor é reduzido a 0.
		if(valor == 0) {
			
			return "";
			
		} else {
			//O retorno se da pela realização de um teste lógico sobre o valor concatenado a chamada de função que divide valor por 2.
			if(valor % 2 == 0) {
				
				return fnBinary(valor / 2) + "0";
						
			} else {
				
				return fnBinary(valor / 2) + "1";
						
			}
			
		}
		
	}
	
	
	
}
