package com.sappsoftwaresolutions.OOMenu;

public class MenuItemLeaf implements MenuItemComponent{
	protected String menuOption;
	
	public MenuItemLeaf(String menuOption){
		this.menuOption = menuOption;
	}
	
	public String displayMenuOption() {
		return this.menuOption;
	}

	//Extend MenuItemLeaf and override method to change what each runMenuOption does
	public void runMenuOption() {
		System.out.println("Option " + this.menuOption + " is running the runMenuOption method");
	}
	
}
