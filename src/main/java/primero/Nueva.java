
package primero;

import javax.swing.*;

public class Nueva {
  
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//este metodo es una mierda
		String genero = "";
		
		do {
			
			genero=JOptionPane.showInputDialog("introduce tu genero (H/M)");
			
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura por favor en cm"));
		
		int pesoideal=0;
		
		
		if (genero.equalsIgnoreCase("H")) {
			
			pesoideal=altura-110;
			
		}
		
		else if (genero.equalsIgnoreCase("M")) {
			
			pesoideal=altura-120;
			
		}
		
		
		System.out.println("tu peso ideal es " + pesoideal + "kg") ;
		

	}
    
    
}
