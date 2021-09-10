package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oblig01 {

	public static void main(String[] args) {
		
		 String bruttoLonn = JOptionPane.showInputDialog("Din bruttolønn : ?");
		 int lonn = Integer.parseInt(bruttoLonn);
		 
		 double trinn0 =0;
		 double trinn1 =0.0093;
		 double trinn2 =0.0241;
		 double trinn3 =0.1152;
		 double trinn4 =0.1452;

		 
		if(lonn>=0 && lonn <=164100) {
			JOptionPane.showMessageDialog(null, "Ditt sakttetrinn er" + lonn *trinn0);
		}
		else if (lonn >= 164101 && lonn <= 230950) {
			JOptionPane.showMessageDialog(null, "Ditt skattetrinn er "+ lonn * trinn1);
		}
		else if (lonn >= 230951 && lonn <= 580650) {
			JOptionPane.showMessageDialog(null, "Ditt skattetrinn er" + lonn * trinn2);
		}
		else if (lonn >= 580651 && lonn <= 934050) {
		 JOptionPane.showMessageDialog(null, "Ditt skattetrinn er" + lonn * trinn3);
	}
		else if (lonn >= 934051 ) {
			JOptionPane.showMessageDialog(null, "Ditt skattetrinn er" + lonn * trinn4);

     }
		else{
			JOptionPane.showMessageDialog(null, "Ditt skattetrinn er invalid" );
		}


	
	}
}
