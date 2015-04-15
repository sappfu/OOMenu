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

	public void runMenuOption(VisitorInterface visitor) {
		while(true){
			int i=0;
			for (i=0;i<array.size();i++){
				visitor.visit(i+1 + " " + array.get(i).displayMenuOption());
			}
			visitor.visit(i+1 + " Exit Current Menu");
			try{
				int input = Integer.parseInt(Reader.br.readLine());
				if (input-1 == array.size()){
					visitor.visit("Exiting menu.");
					return;
				}
				this.array.get(input-1).runMenuOption(visitor);
			}
			catch(IOException ioe){
				visitor.visit(ioe.toString());;
			}
			catch(NumberFormatException nfe){
				visitor.visit("Invalid input option.");
			}
			catch(Exception e){
				visitor.visit("Invalid input option.");
			}
		}
	}
	
	
	
}
