package atv6.controller;

public class FSerieController {

	public FSerieController() {
		
		super();
		
	}
	
	public double fnSerie(int n) {
		
		//A  parada é dada quando n chega a 1.
		if(n == 1) {
			
			return 1;
			
		} else {

			//O retorno é definido como 1 dividido pela função fatorial somada a chamada da função série que recebe n - 1.
			
			return 1 / (double) fnFactorial(n) + fnSerie(n - 1);
			
		}
		
	}
	
	public int fnFactorial(int fc) {
	
		if(fc == 1) {
			
			return 1;
			
		} else {
			
			return fc * fnFactorial(fc - 1);
	
		}
	}
		
}
