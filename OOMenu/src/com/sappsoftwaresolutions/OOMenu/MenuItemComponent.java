package com.sappsoftwaresolutions.OOMenu;

/**
 * 
 * @author John
 * Composite Design Pattern
 * Component Class
 */
public interface MenuItemComponent {
	public String displayMenuOption();
	public void runMenuOption(VisitorInterface visitor);
}
