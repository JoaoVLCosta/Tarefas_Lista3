package atv2.controller;

public class CorrespController {

	public CorrespController(){

		super();
	
}	
	public int fnCorr(int a, int b) {
		
		int repasse = 0;
		//A Parada é definida quando o valor de a não pode mais ser avaliado, isso ocorre quando ele atinge 0.
		if(a == 0) {
			
			return 0;
			
		} else {
			
			//A chamada de passos ocorre sob a divisão do valor de a por 10 para que a próxima etapa possa observar a próxima posição.
			repasse = fnCorr(a / 10, b);
			
			if((a % 10) == b) {
			
				return 1 + repasse;
				
			} else {
				
				return 0 + repasse;
				
			}
		}
		
	}

}
