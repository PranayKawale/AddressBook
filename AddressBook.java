package com.bridgelab;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AddressBook {
	ArrayList<PersonInfo>persons;
	
	//constructor
	public AddressBook() {
		persons = new ArrayList <PersonInfo> ();
	}	
		//add new person record to arrayList after taking input 
		public void addPerson ( ) {
			String name = JOptionPane.showInputDialog("Enter name");
			String add = JOptionPane.showInputDialog("Enter address");
			String email = JOptionPane.showInputDialog("Enter emailId");
			String pNum = JOptionPane.showInputDialog("Enter phone number");
			
			//construct new person object
			PersonInfo p = new PersonInfo(name, add, email, pNum);
			//add above PersonInfo object to arrayList
			persons.add(p);
		}
		
		//search person record by iterating over arrayList 
		
		public void searchPerson (String n) {
			for (int i = 0; i < persons.size(); i++) {
				PersonInfo p = (PersonInfo) persons.get(i);
				if (n.equals(p.getName())) {
					p.print ();
					
				}
				
			}
		}
		
		//delete person record by name by iterating over list
		public void deletePerson(String n) {
			for (int i = 0; i < persons.size(); i++) {
				PersonInfo p = (PersonInfo) persons.get(i);
				if (n.equals(p.getName())) {
					p.print ();
					persons.remove(i);
					
				}
				
			}
		}
	
}
