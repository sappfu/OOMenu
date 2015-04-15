package com.sappsoftwaresolutions.OOMenu;

public class VisitorTest implements VisitorInterface{

	public String display;
	
	public void visit(String display){
		this.display = display;
	}
}
