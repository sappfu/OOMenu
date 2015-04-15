package com.sappsoftwaresolutions.OOMenu;

import junit.framework.TestCase;

import org.junit.Test;

public class MenuItemCompositeTest extends TestCase {
	MenuItemComponent leaf1;
	MenuItemComponent leaf2;
	MenuItemComponent composite;

	protected void setUp() throws Exception {
		super.setUp();
		leaf1 = new MenuItemLeaf("Leaf1");
		leaf2 = new MenuItemLeaf("Leaf2");
		composite = new MenuItemComposite("Menu",leaf1,leaf2);
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		leaf1 = null;
		leaf2 = null;
		composite = null;
	}

	@Test
	public void testMenuItemDisplayMenuOption() {
		assertEquals(composite.displayMenuOption(),"Menu");
	}
}
