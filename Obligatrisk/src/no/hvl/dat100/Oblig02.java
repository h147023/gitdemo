package no.hvl.dat100;

import javax.swing.*;

public class Oblig02 {
	
	  
		  
	public static void main(String[] args) {
		
		String input =JOptionPane.showInputDialog("Enter your grade.");
       int grade = Integer.parseInt(input);
       JOptionPane.showMessageDialog(null, "Your grade is: " + grade(grade));
	}
	  
	  
	
	public static String grade(int n) {
		if (n>=90 && n<=100) {
			return "A";
		}
		else if(n>=80 && n<90) {
			return "B";
		}
		else if(n>=60 && n<80) {
			return "C";
	}
		else if(n>=50 && n<60) {
			return "D";
		}
		else if(n>=40 && n<50) {
			return "E";
		}
		else if(n>=0 && n<40) {
			return "F";
		}
		else {
			return "Invalid";
		}

}
}

