package atv3.controller;

public class RevertController {

	public RevertController() {
		
		super();
		
	}
	
	public String fnRevert(String texto, int size, int n) {
		
		//A condição de parada ocorre quando n é igual ao tamanho da String recebida.
		if(n == size) {
			
			return texto.substring(n);
			
		} else {

			//O retorno é dado pela concatenação da chamada de função à posição da String atualmente observada.
			return fnRevert(texto, size, n + 1) + texto.substring(n, n + 1);

			
		}
		
		
	}
	
	
	
}
