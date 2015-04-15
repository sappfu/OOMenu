package com.sappsoftwaresolutions.OOMenu;

public class VisitorDisplayPrint implements VisitorDisplayInterface{
	
	public void visit(String display) {
		System.out.println(display);
	}


}
