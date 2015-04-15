package com.sappsoftwaresolutions.OOMenu;


public class Main {

	public static void main(String[] args){
		//create main menu leaves
		MenuItemComponent leaf1 = new MenuItemLeaf("Leaf1");
		MenuItemComponent leaf2 = new MenuItemLeaf("Leaf2");
		MenuItemComponent leaf3 = new MenuItemLeaf("Leaf3");
		MenuItemComponent leaf4 = new MenuItemLeaf("Leaf4");
		
		//create submenu1 and 4 leaves
		MenuItemComponent sub1leaf1 = new MenuItemLeaf("Sub1Leaf1");
		MenuItemComponent sub1leaf2 = new MenuItemLeaf("Sub1Leaf2");
		MenuItemComponent sub1leaf3 = new MenuItemLeaf("Sub1Leaf3");
		MenuItemComponent sub1leaf4 = new MenuItemLeaf("Sub1Leaf4");
		MenuItemComponent submenu1 = new MenuItemComposite("SubMenu1",sub1leaf1,sub1leaf2,sub1leaf3,sub1leaf4);
		
		//create submenu2 and 4 leaves
		MenuItemComponent sub2leaf1 = new MenuItemLeaf("Sub2Leaf1");
		MenuItemComponent sub2leaf2 = new MenuItemLeaf("Sub2Leaf2");
		MenuItemComponent sub2leaf3 = new MenuItemLeaf("Sub2Leaf3");
		MenuItemComponent sub2leaf4 = new MenuItemLeaf("Sub2Leaf4");
		MenuItemComponent submenu2 = new MenuItemComposite("SubMenu1",sub2leaf1,sub2leaf2,sub2leaf3,sub2leaf4);
		
		//create MainMenu with all leaves and submenus
		MenuItemComponent MainMenu = new MenuItemComposite("MainMenu", leaf1, leaf2, leaf3, leaf4,submenu1,submenu2);
		
		//create Visitor
		VisitorDisplayInterface display = new VisitorDisplayPrint();
		VisitorInputInterface input = new VisitorInputKeyboard();
		MainMenu.runMenuOption(display,input);
	}
}
