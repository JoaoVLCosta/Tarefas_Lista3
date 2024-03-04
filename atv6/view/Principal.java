package atv6.view;
import javax.swing.JOptionPane;
import atv6.controller.FSerieController;
public class Principal {

	public static void main(String[] args) {
		
		FSerieController fsc = new FSerieController();
		
		int n = 0;
		
		do {
		
			n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número de 1 a 12"));
		
		} while(n < 1 || n > 12);	
			
		System.out.println(fsc.fnSerie(n));
		
	}
	
}
