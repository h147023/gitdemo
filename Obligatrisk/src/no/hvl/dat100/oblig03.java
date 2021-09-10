package no.hvl.dat100;

import javax.swing.*;

public class oblig03 {

	public static void main(String[] args) {
		String input =JOptionPane.showInputDialog("Enter the number.");
       int factorial = Integer.parseInt(input);
       JOptionPane.showMessageDialog(null, "The factorial of the number: " + factorial(factorial));
	}
	
	public static int factorial (int n) {
		if(n<=0) {
			JOptionPane.showMessageDialog(null, "Invalid input");
			return n;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
		
		
	}
	

}

			
			
				
	      
		

	

	


