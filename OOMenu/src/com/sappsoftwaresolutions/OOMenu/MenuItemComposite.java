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

	public void runMenuOption() {
		while(true){
			int i=0;
			for (i=0;i<array.size();i++){
				System.out.println(i+1 + " " + array.get(i).displayMenuOption());
			}
			System.out.println(i+1 + " " + "Exit Current Menu");
			try{
				int input = Integer.parseInt(Reader.br.readLine());
				if (input-1 == array.size()){
					return;
				}
				this.array.get(input-1).runMenuOption();
			}
			catch(IOException ioe){
				System.out.println(ioe);
			}
			catch(NumberFormatException nfe){
				System.out.println("Invalid input option.");
			}
			catch(Exception e){
				System.out.println("Invalid input option.");
			}
		}
	}
	
	
	
}
