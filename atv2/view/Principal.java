package atv2.view;
import atv2.controller.CorrespController;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		
		CorrespController cc = new CorrespController();
		
		int a = 0;
		int b = 0;
		
		do {
			
			a = (Integer.parseInt(JOptionPane.showInputDialog("Insira número inteiro entre 10 e 999999")));
		
		} while ((a < 10) || (a > 999999));
		
		do {
		
			b = (Integer.parseInt(JOptionPane.showInputDialog("Insira número inteiro entre 0 e 9")));
	
		} while ((b < 0) || (b > 9));
			
		System.out.println(cc.fnCorr(a, b));
		
	}
	
}

