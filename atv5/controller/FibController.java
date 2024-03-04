package atv5.controller;

public class FibController {

	public FibController() {
		
		super();
		
	}
	
	public int fnFib(int f) {
		
//		A condição de parada se da quando o valor de f é menor ou igual a 2
		if(f <= 2) {
			
			return 1;
			
		} else {
			
			return fnFib(f - 1) + fnFib(f - 2);
			
		}
	}
}
