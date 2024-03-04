package atv4.view;
import atv4.controller.BinaryController;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		
		BinaryController bc = new BinaryController();
		
		int  valor = 0;
	
		do {
		
			valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um número de 0 a 2000"));
			
		} while(valor < 0 || valor > 2000);
				
		System.out.println(bc.fnBinary(valor));
		
	}

}