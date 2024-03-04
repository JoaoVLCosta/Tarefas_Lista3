package atv1.view;
import atv1.controller.DigitoController;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		
		DigitoController dg = new DigitoController();
		
		int n = (Integer.parseInt(JOptionPane.showInputDialog("Insira Número Inteiro")));
	
		System.out.println(dg.fnCont(n));
		
	}
	
}
