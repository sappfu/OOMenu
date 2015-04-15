package com.sappsoftwaresolutions.OOMenu;

import java.io.IOException;

public class VisitorInputKeyboard implements VisitorInputInterface{

	public String visit() {
		try{
			return Reader.br.readLine();
		}
		catch(IOException ioe){
			return ioe.toString();
		}
	}
}
