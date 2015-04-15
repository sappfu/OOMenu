package com.sappsoftwaresolutions.OOMenu;

import java.io.IOException;
import java.util.ArrayList;

public class MenuItemComposite implements MenuItemComponent{
	private ArrayList<MenuItemComponent> array;
	private String menuOption;
	
	
	public MenuItemComposite(String menuOption, MenuItemComponent... components){
		array = new ArrayList<MenuItemComponent>();
		this.menuOption = menuOption;
		for (MenuItemComponent component : components)
			array.add(component);
	}

	public String displayMenuOption() {
		return this.menuOption;
	}

	public void runMenuOption(VisitorDisplayInterface display, VisitorInputInterface input) {
		while(true){
			int i=0;
			for (i=0;i<array.size();i++){
				display.visit(i+1 + " " + array.get(i).displayMenuOption());
			}
			display.visit(i+1 + " Exit Current Menu");
			try{
				int inp = Integer.parseInt(input.visit());
				if (inp-1 == array.size()){
					return;
				}
				this.array.get(inp-1).runMenuOption(display,input);
			}
			catch(NumberFormatException nfe){
				display.visit("Invalid input option.");
			}
			catch(Exception e){
				display.visit("Invalid input option.");
			}
		}
	}
	
	
	
}
