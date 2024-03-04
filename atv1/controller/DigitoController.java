package atv1.controller;

public class DigitoController {

	public DigitoController(){

		super();
	
}	
	public int fnCont(int n) {
		
		
		if(n > 0) {
			
			//O retorno se da pela soma de 1 a chamada de função que diminui o tamanho de n em 1 digito utilizando divisão por 10.
			
			return 1 + fnCont(n / 10);
			
		} else {
			
			//A condição de parada se da quando n falha o teste lógico. Ou seja, quando n não for maior que 0.
			
			return 0;
			
		}
		
	}

}