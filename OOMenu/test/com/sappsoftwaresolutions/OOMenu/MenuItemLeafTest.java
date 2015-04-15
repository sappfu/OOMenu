package com.sappsoftwaresolutions.OOMenu;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MenuItemLeafTest extends TestCase{

	MenuItemComponent leaf;

	@Before
	public void setUp() throws Exception {
		leaf = new MenuItemLeaf("Leaf");
	}

	@After
	public void tearDown() throws Exception {
		leaf = null;
	}

	@Test
	public void testDisplayMenuOptionLeaf() {
		assertEquals(leaf.displayMenuOption(),"Leaf");
	}
	
	@Test
	public void testRunMenuOptionLeaf() {
		VisitorDisplayTest display = new VisitorDisplayTest();
		VisitorInputInterface input = new VisitorInputKeyboard();
		leaf.runMenuOption(display, input);
		
		assertEquals(display.display,"Option Leaf is running the runMenuOption method");
	}

}
