package atv3.view;
import atv3.controller.RevertController;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		
		RevertController rc = new RevertController();
	
		String texto = JOptionPane.showInputDialog("Insira um texto");
		
		int size = texto.length() - 1;
		
		System.out.println(rc.fnRevert(texto, size, 0));

	}

}