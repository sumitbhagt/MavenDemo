package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import  org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCasesEx {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void testcase1()
	{
		Assertions.assertEquals("Hello","Hello");
		Assertions.assertEquals(500,500+200,"addition failed");
		
	}
	@Test
	public void testadd()
	{
		Calculator c=new Calculator();
		int r=c.add(300,200);
		Assertions.assertEquals(500,r);
		
	}

	@Test
	void testAssertFalse() {

	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}
	@Test
	public void testEmptyArrayList() {
	ArrayList<Integer> al = new ArrayList<Integer>();
	Assertions.assertEquals(0, al.size());
	Assertions.assertTrue(al.isEmpty()); // assertTrue Method
	al.add(100);
	al.add(200)
	}
}
