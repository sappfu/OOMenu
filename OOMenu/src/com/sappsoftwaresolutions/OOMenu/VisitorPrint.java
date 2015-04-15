package com.sappsoftwaresolutions.OOMenu;

public class VisitorPrint implements VisitorInterface{
	
	public void visit(String display) {
		System.out.println(display);
	}


}
