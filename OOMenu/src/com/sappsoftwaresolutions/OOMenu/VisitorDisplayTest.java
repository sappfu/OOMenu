package com.sappsoftwaresolutions.OOMenu;

public class VisitorDisplayTest implements VisitorDisplayInterface{

	public String display;
	
	public void visit(String display){
		this.display = display;
	}
}
