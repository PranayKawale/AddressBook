package com.bridgelab;


import javax.swing.JOptionPane;

public class TestBook {
	public static void main(String[] args) {
		
	
	AddressBook ab = new AddressBook();
	String input , s ;
	int  cs ;
	while (true) {
		input = JOptionPane.showInputDialog("Enter 1 to add " + "\n Enter 2 to search" + "\nEnter 3 to Delete" + "\n Enter 4 to exit");
		cs = Integer.parseInt(input);
		switch (cs) {
		case 1:
			ab.addPerson();
			break;
		case 2 :
			s = JOptionPane.showInputDialog("Enter name to search");
			ab.searchPerson(s);
			break;
		case 3 :
			s = JOptionPane.showInputDialog("Enter name to delete");
			ab.deletePerson(s);
			break;	
		case 4 :
			System.exit(0);
				

			
		}
	}
	}

}
