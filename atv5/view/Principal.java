package atv5.view;
import atv5.controller.FibController;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		
		FibController fc = new FibController();
		
		int  f = 0;
	
		do {
		
			f = Integer.parseInt(JOptionPane.showInputDialog("Insira um número de 1 a 20"));
			
		} while(f < 1 || f > 20);
				
		System.out.println(fc.fnFib(f));
		
	}

}
